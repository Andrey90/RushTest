package other;

/**
 * Created by luchk on 08.03.2016.
 */
public class Demo1 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; ++i){
            new HelloThread().start();
        }
        System.out.println("Hello new thread");
    }

    private static class HelloThread extends Thread{
        @Override
        public void run(){
            System.out.println("Hello from " + getName());
        }
    }
}

