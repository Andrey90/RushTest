package shildt.book.exampleExeptions;

/**
 * Created by luchkovsky on 21.12.14.
 */
public class MyException extends Exception {
    private int detail;

    MyException (int a) {
        detail = a;
    }

    public String toString(){
        return "MyException [" + detail + "]";
    }
}
