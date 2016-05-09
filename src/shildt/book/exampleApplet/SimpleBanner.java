package shildt.book.exampleApplet;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by luchk on 10.05.2016.
 */
/*<applet code = "SimpleBanner" width = 300 height = 50>
</applet>
 */
public class SimpleBanner extends Applet implements Runnable {
    String msg = "A Simple Moving Banner for demonstration!";
    Thread t = null;
    boolean stopFlag;

    //Установить цвета и инициализировать поток
    public void init(){
        setBackground(Color.cyan);
        setForeground(Color.red);
    }

    //Запустить поток
    public void start(){
        t = new Thread();
        stopFlag = false;
        t.start();
    }

    //Точка входа для потока, прокручивающегося баннера
    public void run(){
        //Снова отобразить баннер
        for ( ; ; ){
            try {
                repaint();
                Thread.sleep(250);
                if (stopFlag){
                    break;
                }
            }
            catch (InterruptedException e){

            }
        }
    }
    //Пауза в выводе баннера
    public void stop(){
        stopFlag = true;
        t = null;
    }

    //Отображение баннера
    public void paint(Graphics gp){
        char ch;

        ch = msg.charAt(0);
        msg = msg.substring(1, msg.length());
        msg += ch;

        gp.drawString(msg, 50, 30);
    }
}
