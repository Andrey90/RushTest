package ws.kostin.task3;

/**
 * Created by luchkovsky on 14.01.15.
 * Натуральное положительное число записано в переменную n. Определить и вывести на экран, сколько цифр в числе n.
 */
public class e3_3 {
    public static void main(String args[]) {
        int n = 12;

        String str = Integer.toString(n);
        System.out.println(str.length());

    }
}
