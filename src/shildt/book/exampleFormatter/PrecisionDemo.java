package shildt.book.exampleFormatter;

import java.util.Formatter;

/**
 * Created by luchk on 13.03.2016.
 */
public class PrecisionDemo {
    public static void main(String[] args) {
        Formatter formatter = new Formatter();

        //Формат с 4 десятичными разрядами
        formatter.format("%.4f", 123.1234567);
        System.out.println(formatter);
        formatter.close();

        //Формат с 2 десятичными разрядами в 16-ти символьном поле
        formatter = new Formatter();
        formatter.format("%16.2e", 123.1234567);
        System.out.println(formatter);
        formatter.close();

        //Отобразить максимум 15 символов строки
        formatter = new Formatter();
        formatter.format("%.15s", "Formatting in JAVA is very simple");
        System.out.println(formatter);
        formatter.close();
    }
}
