/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package QualityMetamodel.resource.qualitymetamodel.debug;

/**
 * DebugMessages are exchanged between the debug server (the Eclipse debug
 * framework) and the debug client (a running process or interpreter). To exchange
 * messages they are serialized and sent over sockets.
 */
public class QualitymetamodelDebugMessage {
	
	private static final char DELIMITER = ':';
	private QualityMetamodel.resource.qualitymetamodel.debug.EQualitymetamodelDebugMessageTypes messageType;
	private String[] arguments;
	
	public QualitymetamodelDebugMessage(QualityMetamodel.resource.qualitymetamodel.debug.EQualitymetamodelDebugMessageTypes messageType, String[] arguments) {
		super();
		this.messageType = messageType;
		this.arguments = arguments;
	}
	
	public QualitymetamodelDebugMessage(QualityMetamodel.resource.qualitymetamodel.debug.EQualitymetamodelDebugMessageTypes messageType, java.util.List<String> arguments) {
		super();
		this.messageType = messageType;
		this.arguments = new String[arguments.size()];
		for (int i = 0; i < arguments.size(); i++) {
			this.arguments[i] = arguments.get(i);
		}
	}
	
	public QualityMetamodel.resource.qualitymetamodel.debug.EQualitymetamodelDebugMessageTypes getMessageType() {
		return messageType;
	}
	
	public String[] getArguments() {
		return arguments;
	}
	
	public String serialize() {
		java.util.List<String> parts = new java.util.ArrayList<String>();
		parts.add(messageType.name());
		for (String argument : arguments) {
			parts.add(argument);
		}
		return QualityMetamodel.resource.qualitymetamodel.util.QualitymetamodelStringUtil.encode(DELIMITER, parts);
	}
	
	public static QualitymetamodelDebugMessage deserialize(String response) {
		java.util.List<String> parts = QualityMetamodel.resource.qualitymetamodel.util.QualitymetamodelStringUtil.decode(response, DELIMITER);
		String messageType = parts.get(0);
		String[] arguments = new String[parts.size() - 1];
		for (int i = 1; i < parts.size(); i++) {
			arguments[i - 1] = parts.get(i);
		}
		QualityMetamodel.resource.qualitymetamodel.debug.EQualitymetamodelDebugMessageTypes type = QualityMetamodel.resource.qualitymetamodel.debug.EQualitymetamodelDebugMessageTypes.valueOf(messageType);
		QualitymetamodelDebugMessage message = new QualitymetamodelDebugMessage(type, arguments);
		return message;
	}
	
	public boolean hasType(QualityMetamodel.resource.qualitymetamodel.debug.EQualitymetamodelDebugMessageTypes type) {
		return this.messageType == type;
	}
	
	public String getArgument(int index) {
		return getArguments()[index];
	}
	
	public String toString() {
		return this.getClass().getSimpleName() + "[" + messageType.name() + ": " + QualityMetamodel.resource.qualitymetamodel.util.QualitymetamodelStringUtil.explode(arguments, ", ") + "]";
	}
	
}
