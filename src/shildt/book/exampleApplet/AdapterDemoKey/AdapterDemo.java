package shildt.book.exampleApplet.AdapterDemoKey;

import java.applet.Applet;

/**
 * Created by luchk on 10.04.2016.
 */
/*<applet code = "MouseEvents" width = 300 height = 100>
</applet>
*/

public class AdapterDemo extends Applet{
    public void init(){
        resize(600, 300);
        addMouseListener(new MyMouseAdapter(this));
        addMouseMotionListener(new MyMouseMotionAdapter(this));
    }
}
