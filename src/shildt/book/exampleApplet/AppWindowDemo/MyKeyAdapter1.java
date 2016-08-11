package shildt.book.exampleApplet.AppWindowDemo;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Created by luchk on 12.07.2016.
 */
public class MyKeyAdapter1 extends KeyAdapter {
    AppWindow appWindow;
    public MyKeyAdapter1(AppWindow appWindow) {
        this.appWindow = appWindow;
    }

    public void keyTyped(KeyEvent ke){
        appWindow.keymsg += ke.getKeyChar();
        appWindow.repaint();
    }
}
