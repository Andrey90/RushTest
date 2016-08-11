package shildt.book.exampleApplet.AppletWindow;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by luchk on 11.07.2016.
 */
//Создание рамочного окна
public class AppletFrame extends Applet {
    Frame f;

    public void init(){
        f = new SampleFrame("A Frame Window");
        f.setSize(250, 250);
        f.setVisible(true);
    }

    public void start(){
        f.setVisible(true);
    }

    public void stop(){
        f.setVisible(false);
    }

    public void paint(Graphics g){
        g.drawString("Это окно апплета", 10, 20);
    }
}
