package shildt.book.exampleObservable;

import java.util.Observable;

/**
 * Created by luchk on 11.03.2016.
 */
//Наблюдаемый класс
public class BeingWatched extends Observable{

    void counter(int period){
        for (; period >= 0; period --){
            setChanged();
            notifyObservers(period);
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException e){
                System.out.println("Ожидание прервано");
            }
        }
        System.out.println(countObservers());
    }
}
