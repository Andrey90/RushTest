package shildt.book.exampleInterface;

/**
 * Created by luchkovsky on 14.12.14.
 */
class TestInterface2 {
    public static void main(String args[]) {
        Callback c = new Client();
        AnotherClient ob = new AnotherClient();

        c.callback(43);
        c = ob; //теперь ссылается на обьект AnotherClient
        c.callback(43);
    }
}
