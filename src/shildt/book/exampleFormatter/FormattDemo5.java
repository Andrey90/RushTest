package shildt.book.exampleFormatter;

import java.util.Formatter;

/**
 * Created by luchk on 13.03.2016.
 */
public class FormattDemo5 {
    public static void main(String[] args) {
        Formatter formatter = new Formatter();

        formatter.format("% d", -100);
        System.out.println(formatter);
        formatter.close();

        formatter = new Formatter();
        formatter.format("% d", 100);
        System.out.println(formatter);
        formatter.close();

        formatter = new Formatter();
        formatter.format("%(d", -200);
        System.out.println(formatter);
        formatter.close();

        formatter = new Formatter();
        formatter.format("% d", 200);
        System.out.println(formatter);
        formatter.close();

        formatter = new Formatter();
        formatter.format("%,.2f", 4545454211541.54);
        System.out.println(formatter);
        formatter.close();

        formatter = new Formatter();
        formatter.format("%X", 250);
        System.out.println(formatter);
        formatter.close();

        formatter = new Formatter();
        formatter.format("%E", 250.767676);
        System.out.println(formatter);
        formatter.close();

        formatter = new Formatter();
        formatter.format("%3$d, %1$d, %2$d", 15, 25, 35);
        System.out.println(formatter);
        formatter.close();

        formatter = new Formatter();
        formatter.format("%d в шестнадцатиричном формате равно: %1$X", 767676);
        System.out.println(formatter);
        formatter.close();
    }
}
