package shildt.book.exampleObservable;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by luchk on 11.03.2016.
 */
//Класс наблюдатель
public class Watcher2 implements Observer {
    public void update(Observable observable, Object arg){
        //По окончанию выдать звуковой сигнал
        if (((Integer)arg) == 0){
            System.out.println("Готово" + '\7');
        }
    }
}
