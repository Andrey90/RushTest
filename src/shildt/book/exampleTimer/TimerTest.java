package shildt.book.exampleTimer;

import java.util.Timer;

/**
 * Created by luchk on 11.03.2016.
 */
public class TimerTest {
    public static void main(String[] args) {
        MyTimerTask myTimerTask = new MyTimerTask();
        Timer timer = new Timer();

        //Устанавливаем начальную паузу в 1 секунду, затем повторяем каждые пол секуды
        timer.schedule(myTimerTask, 1000, 500);

        try {
            Thread.sleep(10000);
        }
        catch (InterruptedException e){
            System.out.println(e);
        }
        timer.cancel();
    }
}
