package shildt.book.exampleApplet.exampleDrawDemo;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by luchk on 11.08.2016.
 */
/*<applet code = "ResizeMe" width = 300 height = 200>
</applet>*/
public class ResizeMe extends Applet {
    final int inc = 25;
    int max = 500;
    int min = 200;
    Dimension d;

    public ResizeMe(){
        addMouseListener(new MouseAdapter(){
            @Override
            public void mouseReleased(MouseEvent e) {
                int w = (d.width + inc) > max?min : (d.width + inc);
                int h = (d.height + inc) > max?min : (d.height + inc);
                setSize(new Dimension(w, h));
            }
        });
    }

    public void paint(Graphics g){
        d = getSize();
        g.drawLine(0, 0, d.width - 1, d.height - 1);
        g.drawLine(0, d.width - 1, d.height - 1, 0);
        g.drawLine(0, 0, d.width - 1, d.height - 1);
    }
}
