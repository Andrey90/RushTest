package shildt.book.exampleApplet;

import java.applet.Applet;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by luchk on 09.05.2016.
 */
public class AnonymousInnerClassDemo extends Applet {
    public void init(){
        addMouseListener(new MouseAdapter() {
            /**
             * {@inheritDoc}
             *
             * @param e
             */
            @Override
            public void mousePressed(MouseEvent e) {
                showStatus("Mouse Pressed");
            }
        });
    }
}
