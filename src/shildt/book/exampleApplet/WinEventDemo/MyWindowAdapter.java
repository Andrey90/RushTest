package shildt.book.exampleApplet.WinEventDemo;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by luchk on 11.07.2016.
 */
class MyWindowAdapter extends WindowAdapter {
    SampleFrame sampleFrame;
    public MyWindowAdapter(SampleFrame sampleFrame){
        this.sampleFrame = sampleFrame;
    }

    public void windowClosing(WindowEvent we){
        sampleFrame.setVisible(false);
    }
}
