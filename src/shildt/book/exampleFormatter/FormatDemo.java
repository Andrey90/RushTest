package shildt.book.exampleFormatter;

import java.util.Formatter;

/**
 * Created by luchk on 13.03.2016.
 */
public class FormatDemo {
    public static void main(String[] args) {
        try (Formatter formatter = new Formatter()){
            formatter.format("Formatting %s very simple %d %f", "with JAVA", 10, 98.6);
            System.out.println(formatter);
        }
    }
}
