package shildt.book.exampleApplet.exampleFonts;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by luchk on 14.09.2016.
 */
/*<applet code = "ShowFonts" width = 300 height = 200>
</applet>*/
public class ShowFonts extends Applet {
    public void paint(Graphics gp){
        String msg = "";
        String FontList[];

        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        FontList = ge.getAvailableFontFamilyNames();
        for (int i = 0; i < FontList.length; i++){
            msg += FontList[i] + " ";
        }

        gp.drawString(msg, 4, 16);
    }
}
