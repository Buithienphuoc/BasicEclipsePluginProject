package learn4bosch.swt.base;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

public class TestView extends ViewPart {

	public TestView() {
	}

	@Override
	public void createPartControl(Composite parent) {
		FillLayout layout = new FillLayout();
		layout.type = SWT.HORIZONTAL;
		parent.setLayout(layout);
		String buttonLayoutName = parent.getLayout().getClass().getName();
		Button button = new Button(parent, SWT.PUSH);
		button.setText("Test pushing button!!");
		button.addListener(SWT.Selection, event -> MessageDialog.openConfirm(parent.getShell(), "A testing button","This button has a layout:" + buttonLayoutName));
		
		Button button2 = new Button(parent, SWT.PUSH);
		button2.setText("Test pushing second button!!");
		button2.addListener(SWT.Selection, event -> MessageDialog.openConfirm(parent.getShell(), "A second testing button","This second button has a layout:" + buttonLayoutName));
	}

	@Override
	public void setFocus() {
	}

}
