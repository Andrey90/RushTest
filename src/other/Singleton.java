package other;

/**
 * Created by luchk on 11.03.2016.
 */
public class Singleton {
    private String bar;
    private int foo;

    private Singleton(){
        foo = 13;
        bar = "zap";
    }

    private static Singleton instance;
    public synchronized static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
