package shildt.book.exampleFormatter;

import java.util.Formatter;

/**
 * Created by luchk on 11.03.2016.
 */
public class FormatterTest {
    public static void main(String[] args) {
        Formatter formatter = new Formatter();
        formatter.format("Formatting %s is very simple: %d %f, %n\this is %S", "with helping Java", 10, 98.6, "life");
        System.out.println(formatter.toString());
        formatter.out();
        System.out.println(formatter);
        formatter.close();
        System.out.println(" ");

        Formatter formatter1 = new Formatter();
        for (double i = 1000; i < 1.0e+10; i *= 100){
            formatter1.format("%g ", i);
            System.out.println(formatter1);
        }
        formatter1.close();
        System.out.println(" ");

        Formatter formatter2 = new Formatter();
        formatter2.format("Шестнадцетиричное: %x, Восьмиричное: %o, " +
                "Шестнадцатиричное с плавающей точкой %a", 196, 196, 196.234);
        System.out.println(formatter2);
    }
}
