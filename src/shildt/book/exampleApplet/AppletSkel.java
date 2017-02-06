package shildt.book.exampleApplet;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by luchk on 09.05.2016.
 * БАЗОВЫЙ ШАБЛОН АППЛЕТА
 */
/*<applet code = "AppletSkel" width = 300 height = 100>
</applet>
 */
public class AppletSkel extends Applet {
    String msg;
    //Вызывается первым
    public  void init(){
        //инициализация
    }
    /*Вызывается вторым, после init(). Так же вызывается при перезапуске впплета*/
    public void start(){
        //запускает или возобновляет выполнение
    }
    //Вызывается при остановке апплета
    public void stop(){
        //приостновка выполнения
    }
    /*Вызывается перед уничтожением апплета. Это последний выполняемый метод*/
    public void destroy(){
        //выполняет завешающие действия
    }
    //Вызывается, когда окно апплета должно быть восстановлено.
    public void paint(Graphics gr){
        //перерисовка содержимого окна
    }
}
