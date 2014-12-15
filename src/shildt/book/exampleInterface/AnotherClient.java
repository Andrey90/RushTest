package shildt.book.exampleInterface;

/**
 * Created by luchkovsky on 14.12.14.
 */
class AnotherClient implements Callback {
    public void callback(int p) {
        System.out.println("Еще одна версия callback");
        System.out.println("p в квадрате равно " + (p * p));
    }
}
