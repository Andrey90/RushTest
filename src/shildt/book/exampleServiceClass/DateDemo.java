package shildt.book.exampleServiceClass;

import java.util.Date;

/**
 * Created by luchkovsky on 28.02.2016.
 */
public class DateDemo {
    public static void main(String[] args) {
        Date date = new Date();

        //Date with using toString
        System.out.println(date);

        //Count molliseconds from 01.01.1970 00.00.00
        long msec = date.getTime();
        System.out.println(msec);
    }
}
