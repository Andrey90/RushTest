package shildt.book.exampleApplet.exampleFonts;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by luchk on 14.09.2016.
 */
/*<applet code = "SampleFonts" width = 300 height = 200>
</applet>*/
public class SampleFonts extends Applet{
    int next = 0;
    Font f;
    String msg;

    public void init(){
        f = new Font("Dialog", Font.PLAIN, 12);
        msg = "Dialog";
        setFont(f);
        addMouseListener(new MyMouseAdapter(this));
    }

    public  void paint(Graphics gp){
        gp.drawString(msg, 4, 20);
    }
}
