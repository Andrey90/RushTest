package ws.kostin.task3;

/**
 * Created by luchkovsky on 14.01.15.
 * Вычислить и вывести на экран косинусы углов в 60, 45 и 40 градусов без использования функции Math.toDegrees(n).
 */
public class e3_1 {
    public static void main(String args[]){
        int a = 60;
        int b = 45;
        int c = 40;

        double a1 = Math.toRadians(a);
        System.out.println(a1);
        double a2 = Math.cos(a1);
        System.out.println(a2);

        double b1 = Math.toRadians(b);
        System.out.println(b1);
        double b2 = Math.cos(b1);
        System.out.println(b2);

        double c1 = Math.toRadians(c);
        System.out.println(c1);
        double c2 = Math.cos(c1);
        System.out.println(c2);
    }
}
