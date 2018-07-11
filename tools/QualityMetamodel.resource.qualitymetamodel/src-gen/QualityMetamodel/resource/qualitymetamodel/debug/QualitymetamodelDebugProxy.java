/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package QualityMetamodel.resource.qualitymetamodel.debug;

/**
 * The DebugProxy allows to communicate between the interpreter, which runs in a
 * separate thread or process and the Eclipse Debug framework (i.e., the
 * DebugTarget class).
 */
public class QualitymetamodelDebugProxy {
	
	public static final int STARTUP_DELAY = 1000;
	
	private java.io.PrintStream output;
	
	private java.io.BufferedReader reader;
	
	private QualityMetamodel.resource.qualitymetamodel.debug.QualitymetamodelDebugTarget debugTarget;
	
	private QualityMetamodel.resource.qualitymetamodel.debug.QualitymetamodelDebugCommunicationHelper communicationHelper = new QualityMetamodel.resource.qualitymetamodel.debug.QualitymetamodelDebugCommunicationHelper();
	
	public QualitymetamodelDebugProxy(QualityMetamodel.resource.qualitymetamodel.debug.QualitymetamodelDebugTarget debugTarget, int requestPort) throws java.net.UnknownHostException, java.io.IOException {
		this.debugTarget = debugTarget;
		// give interpreter a chance to start
		try {
			Thread.sleep(STARTUP_DELAY);
		} catch (InterruptedException e) {
		}
		startSocket(requestPort);
	}
	
	private void startSocket(int requestPort) throws java.net.UnknownHostException, java.io.IOException {
		// creating client proxy socket (trying to connect)...
		java.net.Socket client = new java.net.Socket("localhost", requestPort);
		// creating client proxy socket - done. (connected)
		try {
			java.io.BufferedInputStream input = new java.io.BufferedInputStream(client.getInputStream());
			reader = new java.io.BufferedReader(new java.io.InputStreamReader(input));
		} catch (java.io.IOException e) {
			System.out.println(e);
		}
		try {
			output = new java.io.PrintStream(client.getOutputStream());
		} catch (java.io.IOException e) {
			System.out.println(e);
		}
	}
	
	public void resume() {
		sendCommand(QualityMetamodel.resource.qualitymetamodel.debug.EQualitymetamodelDebugMessageTypes.RESUME);
	}
	
	public void stepOver() {
		sendCommand(QualityMetamodel.resource.qualitymetamodel.debug.EQualitymetamodelDebugMessageTypes.STEP_OVER);
	}
	
	public void stepInto() {
		sendCommand(QualityMetamodel.resource.qualitymetamodel.debug.EQualitymetamodelDebugMessageTypes.STEP_INTO);
	}
	
	public void stepReturn() {
		sendCommand(QualityMetamodel.resource.qualitymetamodel.debug.EQualitymetamodelDebugMessageTypes.STEP_RETURN);
	}
	
	public void terminate() {
		sendCommand(QualityMetamodel.resource.qualitymetamodel.debug.EQualitymetamodelDebugMessageTypes.EXIT);
	}
	
	public QualityMetamodel.resource.qualitymetamodel.debug.QualitymetamodelDebugMessage getStack() {
		return sendCommandAndRead(QualityMetamodel.resource.qualitymetamodel.debug.EQualitymetamodelDebugMessageTypes.GET_STACK);
	}
	
	public void addLineBreakpoint(String location, int line) {
		QualityMetamodel.resource.qualitymetamodel.debug.QualitymetamodelDebugMessage message = new QualityMetamodel.resource.qualitymetamodel.debug.QualitymetamodelDebugMessage(QualityMetamodel.resource.qualitymetamodel.debug.EQualitymetamodelDebugMessageTypes.ADD_LINE_BREAKPOINT, new String[] {location, Integer.toString(line)});
		communicationHelper.sendEvent(message, output);
	}
	
	public void removeLineBreakpoint(String location, int line) {
		QualityMetamodel.resource.qualitymetamodel.debug.QualitymetamodelDebugMessage message = new QualityMetamodel.resource.qualitymetamodel.debug.QualitymetamodelDebugMessage(QualityMetamodel.resource.qualitymetamodel.debug.EQualitymetamodelDebugMessageTypes.REMOVE_LINE_BREAKPOINT, new String[] {location, Integer.toString(line)});
		communicationHelper.sendEvent(message, output);
	}
	
	public org.eclipse.debug.core.model.IVariable[] getStackVariables(String stackFrame) {
		QualityMetamodel.resource.qualitymetamodel.debug.QualitymetamodelDebugMessage response = sendCommandAndRead(QualityMetamodel.resource.qualitymetamodel.debug.EQualitymetamodelDebugMessageTypes.GET_FRAME_VARIABLES, new String[] {stackFrame});
		String[] ids = response.getArguments();
		// fetch all variables
		org.eclipse.debug.core.model.IVariable[] variables = getVariables(ids);
		return variables;
	}
	
	public org.eclipse.debug.core.model.IVariable[] getVariables(String... requestedIDs) {
		QualityMetamodel.resource.qualitymetamodel.debug.QualitymetamodelDebugMessage response = sendCommandAndRead(QualityMetamodel.resource.qualitymetamodel.debug.EQualitymetamodelDebugMessageTypes.GET_VARIABLES, requestedIDs);
		String[] varStrings = response.getArguments();
		QualityMetamodel.resource.qualitymetamodel.debug.QualitymetamodelDebugVariable[] variables  = new QualityMetamodel.resource.qualitymetamodel.debug.QualitymetamodelDebugVariable[varStrings.length];
		int i = 0;
		for (String varString : varStrings) {
			java.util.Map<String, String> properties = QualityMetamodel.resource.qualitymetamodel.util.QualitymetamodelStringUtil.convertFromString(varString);
			
			// convert varString to variables and values
			String valueString = properties.get("!valueString");
			String valueRefType = "valueRefType";
			java.util.Map<String, Long> childVariables = new java.util.TreeMap<String, Long>(new java.util.Comparator<String>() {
				public int compare(String s1, String s2) {
					return s1.compareToIgnoreCase(s2);
				}
			});
			for (String property : properties.keySet()) {
				// ignore special properties - they are not children
				if (property.startsWith("!")) {
					continue;
				}
				childVariables.put(property, Long.parseLong(properties.get(property)));
			}
			String id = properties.get("!id");
			org.eclipse.debug.core.model.IValue value = new QualityMetamodel.resource.qualitymetamodel.debug.QualitymetamodelDebugValue(debugTarget, id, valueString, valueRefType, childVariables);
			
			String variableName = properties.get("!name");
			String variableRefType = properties.get("!type");
			
			QualityMetamodel.resource.qualitymetamodel.debug.QualitymetamodelDebugVariable variable = new QualityMetamodel.resource.qualitymetamodel.debug.QualitymetamodelDebugVariable(debugTarget, variableName, value, variableRefType);
			variables[i++] = variable;
		}
		return variables;
	}
	
	private void sendCommand(QualityMetamodel.resource.qualitymetamodel.debug.EQualitymetamodelDebugMessageTypes command, String... parameters) {
		QualityMetamodel.resource.qualitymetamodel.debug.QualitymetamodelDebugMessage message = new QualityMetamodel.resource.qualitymetamodel.debug.QualitymetamodelDebugMessage(command, parameters);
		communicationHelper.sendEvent(message, output);
	}
	
	private QualityMetamodel.resource.qualitymetamodel.debug.QualitymetamodelDebugMessage sendCommandAndRead(QualityMetamodel.resource.qualitymetamodel.debug.EQualitymetamodelDebugMessageTypes command, String... parameters) {
		QualityMetamodel.resource.qualitymetamodel.debug.QualitymetamodelDebugMessage message = new QualityMetamodel.resource.qualitymetamodel.debug.QualitymetamodelDebugMessage(command, parameters);
		return communicationHelper.sendAndReceive(message, output, reader);
	}
	
}
