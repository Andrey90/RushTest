package shildt.book.exampleObservable;

/**
 * Created by luchk on 11.03.2016.
 */
public class ObserverDemo {
    public static void main(String[] args) {
        BeingWatched beingWatched = new BeingWatched();
        Watcher1 watcher1 = new Watcher1();
        Watcher2 watcher2 = new Watcher2();

        //Добавить наблюдателя в список наблюдателей
        beingWatched.addObserver(watcher1);
        beingWatched.addObserver(watcher2);

        beingWatched.counter(10);
    }
}
