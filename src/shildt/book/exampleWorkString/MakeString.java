package shildt.book.exampleWorkString;

/**
 * Created by luchkovsky on 19.05.15.
 */
public class MakeString {
    public static void main(String[] args) {
        char c[] = {'w', 'r', 't', 'y'};
        String s1 = new String(c);
        String s2 = new String(c, 1, 2);
        String s3 = new String(s1);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
