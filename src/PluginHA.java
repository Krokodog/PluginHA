import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

/**
 * 
 * Author Luigi Grimaldi 2013
 * 
 */

public class PluginHA {

	private Shell test;

	public PluginHA(Display display) {

		test = new Shell(display);
		test.setText("Task 2013");
		initUI();
		test.setSize(500, 250);
		center(test);
		test.open();

		while (!test.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
	private void initUI() {
		Button buttonsearch=new Button(test, SWT.PUSH);
		buttonsearch.setText("Durchsuchen");
		buttonsearch.setToolTipText("Nach Datei suchen, die kopiert werden soll");
		buttonsearch.setBounds(50, 50, 80, 30);

		Button buttoncopy=new Button(test, SWT.PUSH);
		buttoncopy.setText("Kopierpfad");
		buttoncopy.setToolTipText("In welchen Pfad soll die ausgewählte Datei kopiert werden");
		buttoncopy.setBounds(50, 80, 80, 30);

		Button quitbutton=new Button(test, SWT.PUSH);
		quitbutton.setText("Exit");
		quitbutton.setBounds(50, 110, 80, 30);

		quitbutton.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				test.getDisplay().dispose();
				System.exit(0);
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub

			}
		});

	}


	public void center(Shell shell) {

		Rectangle bounds = shell.getDisplay().getBounds();

		Point p = shell.getSize();

		int nWid = (bounds.width - p.x) / 2;
		int nHei = (bounds.height - p.y) / 2;

		shell.setBounds(nWid, nHei, p.x, p.y);
	}


	public static void main(String[] args) {
		Display display = new Display();
		new PluginHA(display);
		display.dispose();
	}

}


	


