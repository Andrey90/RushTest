package shildt.book.exampleServiceClass;

import java.util.Calendar;

/**
 * Created by luchkovsky on 28.02.2016.
 */
public class CalendarDemo {
    public static void main(String[] args) {
        String month[] = {
                "Jan", "Feb", "Mar", "Apr",
                "May", "Jun", "Jul", "Aug",
                "Sep", "Oct", "Nov", "Dec"
        };

        //Create calendar initialized now date and regional data
        Calendar calendar = Calendar.getInstance();

        //Show date
        System.out.println("Date: ");
        System.out.println(month[calendar.get(Calendar.MONTH)]);
        System.out.println(" " + calendar.get(Calendar.DATE) + " ");
        System.out.println(calendar.get(Calendar.YEAR) + " ");
        System.out.println("Time: ");
        System.out.println(calendar.get(Calendar.HOUR) + " ");
        System.out.println(calendar.get(Calendar.MINUTE) + " ");
        System.out.println(calendar.get(Calendar.SECOND) + " ");


        //Set new time and data and show it
        calendar.set(Calendar.HOUR, 10);
        calendar.set(Calendar.MINUTE, 20);
        calendar.set(Calendar.SECOND, 30);

        System.out.println("New time: ");
        System.out.println(calendar.get(Calendar.HOUR) + " ");
        System.out.println(calendar.get(Calendar.MINUTE) + " ");
        System.out.println(calendar.get(Calendar.SECOND) + " ");
    }
}
