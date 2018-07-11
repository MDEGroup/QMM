package qualitymetamodel.ui.popup.actions;

import java.io.File;
import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.preferences.ScopedPreferenceStore;

import qualityMetamodel.engine.Connector;
import qualityMetamodel.engine.Engine;
import qualityMetamodel.engine.MDEForgeConnector;
import qualitymetamodel.ui.Activator;

public class Evaluate implements IObjectActionDelegate {

	private Shell shell;

	/**
	 * Constructor for Action1.
	 */
	public Evaluate() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		String path = null;
		String path2 = null;
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		File workspaceDirectory = workspace.getRoot().getLocation().toFile();
		path = workspaceDirectory.toString();
		path2 = workspaceDirectory.toString();

		if (window != null) {
			IStructuredSelection selection = (IStructuredSelection) window.getSelectionService().getSelection();

			if (selection instanceof IStructuredSelection) {
				IStructuredSelection ssel = (IStructuredSelection) selection;
				if (ssel.size() != 2) {
					MessageDialog.openInformation(shell, "Error", "You have to select 2 files");
					return;
				}
				Iterator iterator = ssel.iterator();
				Object rmodel = iterator.next();
				Object metamodel = iterator.next();
				IFile file = (IFile) Platform.getAdapterManager().getAdapter(rmodel, IFile.class);
				if (file == null) {
					if (rmodel instanceof IAdaptable) {
						file = (IFile) ((IAdaptable) rmodel).getAdapter(IFile.class);
						System.out.println(file);
					}
				}
				if (file != null) {
					path += file.toString().substring(1);
				}
				IFile file2 = (IFile) Platform.getAdapterManager().getAdapter(metamodel, IFile.class);
				if (file2 == null) {
					if (rmodel instanceof IAdaptable) {
						file = (IFile) ((IAdaptable) metamodel).getAdapter(IFile.class);
						System.out.println(file2);
					}
				}
				if (file != null) {
					path2 += file2.toString().substring(1);
				}
				Engine eng = new Engine();
				try {
					IPreferenceStore preferenceStore = new
							ScopedPreferenceStore(InstanceScope.INSTANCE,"QualityMetamodel.ui");
					String url = Activator.getInstance().getPreferenceStore().getString("url");
					String username = Activator.getInstance().getPreferenceStore().getString("username");
					String password = Activator.getInstance().getPreferenceStore().getString("password");
					Connector c = new MDEForgeConnector(url, username, password);
					eng.calculateQuality(c, path2, path);
					for(IProject project : ResourcesPlugin.getWorkspace().getRoot().getProjects()){
					    project.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
					}
					MessageDialog.openInformation(shell, "Info", "Quality model is calculated");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
	}

}
