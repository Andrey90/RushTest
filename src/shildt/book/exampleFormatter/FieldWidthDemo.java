package shildt.book.exampleFormatter;

import java.util.Formatter;

/**
 * Created by luchk on 12.03.2016.
 */
public class FieldWidthDemo {
    public static void main(String[] args) {
        Formatter formatter;
        for (int i = 1; i <= 10; i++){
            formatter = new Formatter();
            formatter.format("%d %4d %4d", i, i * i, i * i * i);
            System.out.println(formatter);
            formatter.close();
        }
    }
}
