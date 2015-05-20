package shildt.book.exampleToString;

/**
 * Created by luchkovsky on 21.05.15.
 */
public class ToStringDemo {
    public static void main(String[] args) {
        Box b = new Box(10, 12, 14);
        String s = "Box b: " + b; //конкатенация обьекта Box
        System.out.println(b);
        System.out.println(s);

        char ch;
        ch = "abc".charAt(0);
        System.out.println(ch);

        String str = "Demo of this method! Oops!!!";
        int start = 4;
        int end = 7;
        char buf[] = new char[end - start];
        str.getChars(start, end, buf, 0);
        System.out.println(buf);
    }
}
