package ws.kostin.task1;

/**
 * Created by luchkovsky on 13.01.15.
 */
/**
 * В переменной n хранится трёхзначное число. Создайте программу, вычисляющую и выводящую на экран сумму цифр n.
 */

public class e1_5 {
    public static void main(String args[]){
        int n = 999;
        int a1 = n / 100;
        int a2;
        int a2_2 = n / 10;
        a2 = a2_2 % 10;
        int a3_3 = n % 100;
        int a3 = a3_3 % 10;

        System.out.print("rez = " +(a1 + a2 + a3));

    }
}
