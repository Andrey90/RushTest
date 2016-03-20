package shildt.book.exampleFormatter;

import java.util.Calendar;
import java.util.Formatter;

/**
 * Created by luchk on 11.03.2016.
 */
public class TimeDateFormat {
    public static void main(String[] args) {
        Formatter formatter = new Formatter();
        Calendar calendar = Calendar.getInstance();

        //Отобразить 12-ти часовой формат
        formatter.format("%tr", calendar);
        System.out.println(formatter);

        //Отобразить полную информацию о дате и времени
        formatter = new Formatter();
        formatter.format("%tc", calendar);
        System.out.println(formatter);

        //Отобразить только часы и минуты
        formatter = new Formatter();
        formatter.format("%tl:%tM", calendar, calendar);
        System.out.println(formatter);

        //Отобразить название и номер месяца
        formatter = new Formatter();
        formatter.format("%tB %tb %tm", calendar, calendar, calendar);
        System.out.println(formatter);
        formatter.close();
    }
}
