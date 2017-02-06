package shildt.book.exampleApplet.AppletInnerDemo;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by luchk on 09.05.2016.
 */
/*<applet code = "InnerClassDemo" width = 300 height = 100>
</applet>
*/
public class InnerClassDemo extends Applet {
    String msg = "";
    int X = 10, Y = 20;
    public void init() {
        addMouseListener(new MyMouseAdapterNew());
        addKeyListener(new MyKeyAdapterNew());
    }
    public  void paint(Graphics gp){
        gp.drawString(msg, X, Y);
    }

    class MyMouseAdapterNew extends MouseAdapter {
        public void mousePressed(MouseEvent me) {
            showStatus("Mouse Pressed");
            repaint();
        }
    }
    class MyKeyAdapterNew extends KeyAdapter{
        public void keyPressed(KeyEvent ke){
            showStatus("Key Pressed");
        }
        public void keyReleased(KeyEvent ke){
            showStatus("Key up");
        }
        public void keyTyped(KeyEvent ke){
            msg += ke.getKeyChar();
            repaint();
        }

    }
}
