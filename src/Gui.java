//import org.eclipse.swt.SWT;
//import org.eclipse.swt.events.SelectionEvent;
//import org.eclipse.swt.events.SelectionListener;
//import org.eclipse.swt.graphics.Point;
//import org.eclipse.swt.graphics.Rectangle;
//import org.eclipse.swt.widgets.Button;
//import org.eclipse.swt.widgets.Composite;
//import org.eclipse.swt.widgets.Display;
//import org.eclipse.swt.widgets.Shell;
//
//
//public class Gui {
//
//	private Shell test;
//	
//    public Gui(Display display) {
//       
//        Shell shell = new Shell(display);
//        shell.setText("Main Window");
//        shell.setSize(500, 500);
//
//        center(shell);
//
//        shell.open();
//        
//        Shell bar = new Shell(display);
//        bar.setText("Bar1");
//        bar.setLocation(250, 250);
//        bar.setToolTipText("Durchsuchen");
//        bar.setSize(250, 200);
//        
//        bar.open();
//        
//        test = new Shell(display);
//        test.setText("Button");
//        initUI();
//        test.setSize(200, 200);
//        test.setLocation(500, 500);
//        test.open();
//       
//
//        while (!shell.isDisposed()) {
//          if (!display.readAndDispatch()) {
//            display.sleep();
//          }
//        }
//        
//        while (!bar.isDisposed()) {
//            if (!display.readAndDispatch()) {
//              display.sleep();
//            }
//          }
//        
//        while (!test.isDisposed()) {
//            if (!display.readAndDispatch()) {
//              display.sleep();
//            }
//          }
//    }
//
//
//    private void initUI() {
//    	
//    	Button buttonsearch=new Button(test, SWT.PUSH);
//    	buttonsearch.setText("Durchsuchen");
//    	buttonsearch.setToolTipText("Nach Datei suchen, die kopiert werden soll");
//    	buttonsearch.setBounds(50, 50, 80, 30);
//    	
//    	Button buttoncopy=new Button(test, SWT.PUSH);
//    	buttoncopy.setText("Kopierpfad");
//    	buttoncopy.setToolTipText("In welchen Pfad soll die ausgewählte Datei kopiert werden");
//    	buttoncopy.setBounds(50, 80, 80, 30);
//
//    	Button quitbutton=new Button(test, SWT.PUSH);
//    	quitbutton.setText("Quit");
//    	quitbutton.setBounds(50, 110, 80, 30);
//
//    	quitbutton.addSelectionListener(new SelectionListener() {
//
//    		@Override
//    		public void widgetSelected(SelectionEvent e) {
//    			test.getDisplay().dispose();
//    			System.exit(0);
//    		}
//
//			@Override
//			public void widgetDefaultSelected(SelectionEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//    	});
//    }
//
//	public void center(Shell shell) {
//
//        Rectangle bds = shell.getDisplay().getBounds();
//
//        Point p = shell.getSize();
//
//        int nLeft = (bds.width - p.x) / 2;
//        int nTop = (bds.height - p.y) / 2;
//
//        shell.setBounds(nLeft, nTop, p.x, p.y);
//    }
//
//
//    public static void main(String[] args) {
//        Display display = new Display();
//        new Gui(display);
//        display.dispose();
//    }
//}