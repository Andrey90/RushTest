package shildt.book.exampleInterface;

/**
 * Created by luchkovsky on 14.12.14.
 */
class Client implements Callback {
    public void callback(int p) {
        System.out.println("Метод callback, вызванный со значением " + p);
    }

    void nonInterfMeth() {
        System.out.println("Классы, еоторые реализуют интерфейсы " + "могут определять так же и другие члены");
    }
}
