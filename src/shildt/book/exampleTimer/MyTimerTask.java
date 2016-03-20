package shildt.book.exampleTimer;

import java.util.TimerTask;

/**
 * Created by luchk on 11.03.2016.
 */
public class MyTimerTask extends TimerTask {
    public void run(){
        System.out.println("Задание таймера выполняется");
    }
}
