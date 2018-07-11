/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package QualityMetamodel.resource.qualitymetamodel.debug;

public class QualitymetamodelDebugThread extends QualityMetamodel.resource.qualitymetamodel.debug.QualitymetamodelDebugElement implements org.eclipse.debug.core.model.IThread, QualityMetamodel.resource.qualitymetamodel.debug.IQualitymetamodelDebugEventListener {
	
	private boolean suspended = false;
	private QualityMetamodel.resource.qualitymetamodel.debug.QualitymetamodelDebugTarget debugTarget;
	
	public QualitymetamodelDebugThread(QualityMetamodel.resource.qualitymetamodel.debug.QualitymetamodelDebugTarget target) {
		super(target);
		this.debugTarget = target;
	}
	
	public org.eclipse.debug.core.model.IBreakpoint[] getBreakpoints() {
		return null;
	}
	
	public String getName() throws org.eclipse.debug.core.DebugException {
		return "Thread [main]";
	}
	
	public int getPriority() throws org.eclipse.debug.core.DebugException {
		return 0;
	}
	
	public org.eclipse.debug.core.model.IStackFrame[] getStackFrames() throws org.eclipse.debug.core.DebugException {
		if (isSuspended()) {
			QualityMetamodel.resource.qualitymetamodel.debug.QualitymetamodelDebugMessage stack = this.debugTarget.getDebugProxy().getStack();
			String framesData = stack.getArgument(0);
			if (framesData != null && !"".equals(framesData)) {
				java.util.List<String> frames = QualityMetamodel.resource.qualitymetamodel.util.QualitymetamodelStringUtil.decode(framesData, '#');
				org.eclipse.debug.core.model.IStackFrame[] theFrames = new org.eclipse.debug.core.model.IStackFrame[frames.size()];
				for (int i = 0; i < frames.size(); i++) {
					String data = frames.get(i);
					theFrames[frames.size() - i - 1] = new QualityMetamodel.resource.qualitymetamodel.debug.QualitymetamodelStackFrame(getTarget(), data);
				}
				return theFrames;
			}
		}
		return new org.eclipse.debug.core.model.IStackFrame[0];
	}
	
	public org.eclipse.debug.core.model.IStackFrame getTopStackFrame() throws org.eclipse.debug.core.DebugException {
		org.eclipse.debug.core.model.IStackFrame[] frames = getStackFrames();
		if (frames.length > 0) {
			return frames[0];
		}
		return null;
	}
	
	public boolean hasStackFrames() throws org.eclipse.debug.core.DebugException {
		return isSuspended();
	}
	
	public boolean canResume() {
		return isSuspended();
	}
	
	public boolean canSuspend() {
		return !isSuspended();
	}
	
	public boolean isSuspended() {
		return suspended && !isTerminated();
	}
	
	public void resume() throws org.eclipse.debug.core.DebugException {
		debugTarget.getDebugProxy().resume();
		suspended = false;
	}
	
	public void suspend() throws org.eclipse.debug.core.DebugException {
		suspended = true;
		fireSuspendEvent(org.eclipse.debug.core.DebugEvent.BREAKPOINT);
	}
	
	public boolean canStepInto() {
		return true;
	}
	
	public boolean canStepOver() {
		return true;
	}
	
	public boolean canStepReturn() {
		return true;
	}
	
	public boolean isStepping() {
		return false;
	}
	
	public void stepInto() throws org.eclipse.debug.core.DebugException {
		getTarget().getDebugProxy().stepInto();
	}
	
	public void stepOver() throws org.eclipse.debug.core.DebugException {
		getTarget().getDebugProxy().stepOver();
	}
	
	public void stepReturn() throws org.eclipse.debug.core.DebugException {
		getTarget().getDebugProxy().stepReturn();
	}
	
	public boolean canTerminate() {
		return !isTerminated();
	}
	
	public boolean isTerminated() {
		return getDebugTarget().isTerminated();
	}
	
	public void terminate() throws org.eclipse.debug.core.DebugException {
		getTarget().getDebugProxy().terminate();
	}
	
	public void handleMessage(QualityMetamodel.resource.qualitymetamodel.debug.QualitymetamodelDebugMessage message) {
		if (message.hasType(QualityMetamodel.resource.qualitymetamodel.debug.EQualitymetamodelDebugMessageTypes.STARTED)) {
			fireCreationEvent();
		} else if (message.hasType(QualityMetamodel.resource.qualitymetamodel.debug.EQualitymetamodelDebugMessageTypes.RESUMED)) {
			suspended = false;
			fireResumeEvent(0);
		} else if (message.hasType(QualityMetamodel.resource.qualitymetamodel.debug.EQualitymetamodelDebugMessageTypes.SUSPENDED)) {
			suspended = true;
			fireSuspendEvent(org.eclipse.debug.core.DebugEvent.BREAKPOINT);
		} else if (message.hasType(QualityMetamodel.resource.qualitymetamodel.debug.EQualitymetamodelDebugMessageTypes.TERMINATED)) {
			// ignore this event
		} else {
			System.out.println("ERROR " + this.getClass().getName() + ".handleMessage(" + message + ") unknown event");
		}
	}
	
	public QualityMetamodel.resource.qualitymetamodel.debug.QualitymetamodelDebugTarget getTarget() {
		return debugTarget;
	}
	
}
