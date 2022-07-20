package learn4bosch.swt.base;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class TestSWTMain {

	public static void main(String[] args) {
		Display display = new Display();
		Shell shell = new Shell(display);
		// shell.setLayout(new FillLayout());
		Button button = new Button(shell,SWT.PUSH);
		button.setText("Push me!!");
		button.setSize(100,60);
		// shell.pack();
		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		display.dispose();
	}

}
