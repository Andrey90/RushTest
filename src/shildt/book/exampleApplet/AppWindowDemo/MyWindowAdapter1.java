package shildt.book.exampleApplet.AppWindowDemo;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by luchk on 12.07.2016.
 */
public class MyWindowAdapter1 extends WindowAdapter {
    public void windowClosing(WindowEvent we) {
        System.exit(0);
    }
}
