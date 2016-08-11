package shildt.book.exampleApplet.exampleDrawDemo;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by luchk on 12.07.2016.
 */
/*<applet code = "Rectangles" width = 300 height = 200>
</applet>*/
public class Ellipses extends Applet{
    public void paint(Graphics g){
        g.drawOval(10, 10, 50, 50);
        g.fillOval(100, 10, 75, 50);
        g.drawOval(190, 10, 90, 30);
        g.fillOval(70, 90, 140, 100);
    }
}
