package qualitymetamodel.ui.preference;

import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import qualitymetamodel.ui.Activator;

public class ConnectorPreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {
	StringFieldEditor url;
	StringFieldEditor username;
	StringFieldEditor password;			
	public ConnectorPreferencePage() {
		super(FieldEditorPreferencePage.GRID);
	}

	
	@Override
	public void init(IWorkbench workbench) {

	}
	
	@Override
	protected void createFieldEditors() {
		url = new StringFieldEditor("Url", "url", getFieldEditorParent());
		username = new StringFieldEditor("username", "username", getFieldEditorParent());
		password = new StringFieldEditor("password", "password", getFieldEditorParent());
		String u = Activator.getInstance().getPreferenceStore().getString("url");
		String ut = Activator.getInstance().getPreferenceStore().getString("username");
		String pw = Activator.getInstance().getPreferenceStore().getString("password");
		url.setStringValue(u);
		username.setStringValue(ut);
		password.setStringValue(pw);
		addField(url);
		addField(username);
		addField(password);
	}
	
	@Override
	public boolean performOk() {
		// TODO Auto-generated method stub
		return super.performOk();
	}
	@Override
	protected void performApply() {
		
		super.performApply();
		
		Activator.getInstance().getPreferenceStore().setValue("url", url.getStringValue());
		Activator.getInstance().getPreferenceStore().setValue("username", username.getStringValue());
		Activator.getInstance().getPreferenceStore().setValue("password", password.getStringValue());
	}

}
