package shildt.book.exampleApplet.AdapterDemo;

import java.applet.Applet;

/**
 * Created by luchk on 10.04.2016.
 */
/*<applet code = "MouseEvents" width = 300 height = 100>
</applet>
*/

public class AdapterDemo extends Applet{
    public void init(){
        addMouseListener(new MyMouseAdapter(this));
        addMouseMotionListener(new MyMouseMotionAdapter(this));
    }
}
