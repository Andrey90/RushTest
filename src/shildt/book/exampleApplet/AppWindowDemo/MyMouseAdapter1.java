package shildt.book.exampleApplet.AppWindowDemo;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by luchk on 12.07.2016.
 */
public class MyMouseAdapter1 extends MouseAdapter {
    AppWindow appWindow;
    public MyMouseAdapter1(AppWindow appWindow) {
        this.appWindow = appWindow;
    }

    public void mousePressed(MouseEvent me){
        appWindow.mouseX = me.getX();
        appWindow.mouseY = me.getY();
        appWindow.mousemsg = "Mouse Down at " + appWindow.mouseX + ", " + appWindow.mouseY;
        appWindow.repaint();
    }
}
