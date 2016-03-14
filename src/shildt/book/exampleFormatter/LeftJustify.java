package shildt.book.exampleFormatter;

import java.util.Formatter;

/**
 * Created by luchk on 13.03.2016.
 */
public class LeftJustify {
    public static void main(String[] args) {
        Formatter formatter = new Formatter();
        formatter.format("|%10.2f|", 123.123);
        System.out.println(formatter);
        formatter.close();

        formatter = new Formatter();
        formatter.format("|%-10.2f|", 123.123);
        System.out.println(formatter);
        formatter.close();
    }
}
