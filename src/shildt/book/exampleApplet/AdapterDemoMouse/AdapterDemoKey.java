package shildt.book.exampleApplet.AdapterDemoMouse;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by luchk on 09.05.2016.
 */
/*<applet code = "MouseEvents" width = 300 height = 100>
</applet>
*/
public class AdapterDemoKey extends Applet {

    int X = 10, Y = 20;
    String msg = "";

    public void init(){
        addKeyListener(new MyKeyListener(this));
    }

    public void paint(Graphics g){
        g.drawString(msg, X, Y);
    }
}
