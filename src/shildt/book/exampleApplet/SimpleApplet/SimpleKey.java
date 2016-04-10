package shildt.book.exampleApplet.SimpleApplet;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by luchk on 10.04.2016.
 */

/*<applet code = "MouseEvents" width = 300 height = 100>
</applet>
*/
public class SimpleKey extends Applet implements KeyListener{
    String msg = "";
    int X = 10, Y = 20; //координаты ввода

    public void init(){
        addKeyListener(this);
    }

    public void keyPressed(KeyEvent ke){
        showStatus("Key down");
        int key = ke.getKeyCode();

        switch (key){
            case KeyEvent.VK_F1:
                msg += "<F1>";
                break;
            case KeyEvent.VK_F2:
                msg += "<F2>";
                break;
            case KeyEvent.VK_F3:
                msg += "<F3>";
                break;
            case KeyEvent.VK_PAGE_DOWN:
                msg += "<PgDn>";
                break;
            case KeyEvent.VK_PAGE_UP:
                msg += "<PgUp>";
                break;
            case KeyEvent.VK_LEFT:
                msg += "<Left Arrow>";
                break;
            case KeyEvent.VK_RIGHT:
                msg += "<Fight Arrow>";
                break;
        }
        repaint();
    }

    public void keyReleased(KeyEvent ke){
        showStatus("Key up");
    }

    public void keyTyped(KeyEvent ke){
        msg += ke.getKeyChar();
        repaint();
    }

    //Отображение нажатых клавиш
    public void paint(Graphics g){
        g.drawString(msg, X, Y);
    }
}
