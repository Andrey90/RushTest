package shildt.book.exampleFormatter;

import java.util.Calendar;
import java.util.Formatter;

/**
 * Created by luchk on 13.03.2016.
 */
public class FormatDemo6 {
    public static void main(String[] args) {
        Formatter formatter = new Formatter();
        Calendar calendar = Calendar.getInstance();

        formatter.format("Today is day %te of %<tB, %<tY", calendar);
        System.out.println(formatter);
        formatter.close();
    }
}
