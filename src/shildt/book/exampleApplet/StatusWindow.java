package shildt.book.exampleApplet;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by luchk on 22.05.2016.
 */
/*<applet code = "StatusWindow" width = 300 height = 50>
</applet>
 */
public class StatusWindow extends Applet {
    public void init(){
        setBackground(Color.cyan);
    }

    //Отобразить msg в окне аплета
    public void paint(Graphics g){
        g.drawString("This is in the applet window.", 10, 20);
        showStatus("This is in the applet window.");
    }
}
