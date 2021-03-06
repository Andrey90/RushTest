package shildt.book.exampleThread;

/**
 * Created by luchkovsky on 22.12.14.
 */
class ThreadDemo {
    public static void main(String args[]){
        new NewThread(); //создан новый поток

        try {
            for (int i = 5; i > 0; i--){
                System.out.println("Главный поток: " + i);
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e){
            System.out.println("Главный поток прерван");
        }
        System.out.println("Главный поток завершен");
    }
}
