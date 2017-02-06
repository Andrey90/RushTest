package shildt.book.exampleApplet;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by luchk on 09.05.2016.
 */
/*<applet code = "Sample" width = 300 height = 50>
</applet>
 */
public class Sample extends Applet {
    String msg;
    //Установить цвета фона и переднего плана
    public void init(){
        resize(400, 200);
        setBackground(Color.orange);
        setForeground(Color.red);
        msg = "Inside init() --";
    }

    //Инициализировать отображаемую строку
    public void start(){
        msg += " Inside start( ) --";
    }

    //Отобразить сообщение в окне апплета
    public void paint(Graphics gp){
        msg += " Inside paint( ).";
        gp.drawString(msg, 10, 30);
    }
}
