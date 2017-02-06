package shildt.book.exampleApplet.exampleDrawDemo;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by luchk on 12.07.2016.
 */
/*<applet code = "Arcs" width = 300 height = 200>
</applet>*/
public class Arcs extends Applet{
    public void paint(Graphics g){
        g.drawArc(10, 40, 70, 70, 0, 75);
        g.fillArc(100, 40, 70, 70, 0, 75);
        g.drawArc(10, 100, 70, 80, 0, 175);
        g.fillArc(100, 100, 70, 90, 0, 270);
        g.drawArc(200, 80, 80, 80, 0, 180);
    }
}
