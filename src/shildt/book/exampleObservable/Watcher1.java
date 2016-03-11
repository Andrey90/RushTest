package shildt.book.exampleObservable;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by luchk on 11.03.2016.
 */

//Класс наблюдатель
public class Watcher1 implements Observer {
    public void update(Observable observable, Object arg){
        System.out.println("update() вызван, count равен " + arg);
    }
}
