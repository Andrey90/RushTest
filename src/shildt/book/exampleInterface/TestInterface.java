package shildt.book.exampleInterface;

/**
 * Created by luchkovsky on 14.12.14.
 */
class TestInterface {
    public static void main(String args[]) {
        Callback c = new Client();
        c.callback(34);
    }
}
