package ws.kostin.task1;

/**
 * Created by luchkovsky on 23.12.14.
 */

//В переменной n хранится двузначное число. Создайте программу, вычисляющую и выводящую на экран сумму цифр n

public class e1_3 {
    public static void main(String args[]){
        int n = 30;
        int rez;
        int a;
        int b;


        b = n / 10;
        System.out.println("First symbol: " + b);

        a = n % 10;
        System.out.println("Second symbol: " + a);

        rez = b + a;
        System.out.println(rez);



        //String nString = Integer.toString(n);
        //System.out.println(nString);
    }
}
