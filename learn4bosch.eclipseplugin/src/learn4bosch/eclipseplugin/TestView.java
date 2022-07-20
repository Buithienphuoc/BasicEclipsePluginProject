package learn4bosch.eclipseplugin;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

public class TestView extends ViewPart {

	public TestView() {
	}

	@Override
	public void createPartControl(Composite parent) {
		// Type "button" then Ctrl + Space, choose the proposal
		
		Button button = new Button(parent, SWT.PUSH);
		button.setLayoutData(new GridData(SWT.BEGINNING, SWT.CENTER, false, false));
		button.setText("This is the View for Testing Eclipse Plugin !!");
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				MessageDialog.openInformation(null, "Test Shell", "This is the Shell for test, find the meaning on Eclipse documents !!");
			}
		});
	}

	@Override
	public void setFocus() {
	}

}
