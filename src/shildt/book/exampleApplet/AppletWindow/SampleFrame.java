package shildt.book.exampleApplet.AppletWindow;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by luchk on 11.07.2016.
 */
/*
<applet code = "AppletFrame" width = "300" height = "50">
</applet>
*/
public class SampleFrame extends Frame{
    SampleFrame(String title){
        super(title);

        //Обьект для обработки событий окна
        MyWindowAdapter adapter = new MyWindowAdapter(this);

        //регистрируем его для получения событий
        addWindowListener(adapter);
    }

    public void paint(Graphics g){
        g.drawString("This in a frame window", 10, 40);
    }
}

class MyWindowAdapter extends WindowAdapter{
    SampleFrame sampleFrame;

    public MyWindowAdapter (SampleFrame sampleFrame){
        this.sampleFrame = sampleFrame;
    }

    public void windowClosing(WindowEvent we) {
        sampleFrame.setVisible(false);
    }
}

