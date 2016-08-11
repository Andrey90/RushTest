package shildt.book.exampleApplet.exampleDrawDemo;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by luchk on 12.07.2016.
 */
/*<applet code = "HourGlass" width = 300 height = 200>
</applet>*/
public class HourGlass extends Applet{
    public void paint(Graphics g){
        int xpoints[] = {30, 200, 30, 200, 30};
        int ypoints[] = {30, 30, 200, 200, 30};
        int num = 5;
        g.fillPolygon(xpoints, ypoints, num);
        System.out.println(getSize());
    }
}
