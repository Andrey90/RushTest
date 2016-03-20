package shildt.book.exampleFormatter;

import java.util.Formatter;

/**
 * Created by luchk on 12.03.2016.
 */
public class FormatDemo4 {
    public static void main(String[] args) {
        Formatter formatter = new Formatter();
        formatter.format("|%f|%n|%12f|%n|%012f|", 10.12345, 10.12345, 10.12345);
        System.out.println(formatter);
        formatter.close();
    }
}
