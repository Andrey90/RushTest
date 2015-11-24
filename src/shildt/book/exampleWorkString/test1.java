package shildt.book.exampleWorkString;

/**
 * Created by luchkovsky on 19.05.15.
 */
public class test1 {
    public static void main(String[] args) {
        char chars[] = {'w', 'f', 'd'};
        String string = new String(chars);
        String string1 = new String(chars, 1,2);

        System.out.println(string);
        System.out.println(string1);

    }
}
