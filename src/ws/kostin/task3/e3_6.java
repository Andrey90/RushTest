package ws.kostin.task3;

import java.util.Random;

/**
 * Created by luchkovsky on 14.01.15.
 * Натуральное положительное число записано в переменную n. Создайте программу, которая будет
 * генерировать и выводить на экран целое псевдослучайное число из отрезка [-n;n].
 */
public class e3_6 {
    public static void main(String args[]){
        int n = 3;
        System.out.println((-n) + (int)(Math.random() * (2 * n) + 1));
        /*Random random = new Random(100);
        while (true){

            int res = -n*random.nextInt(2) + random.nextInt(n+1);
            System.out.println(res);
        }*/


    }
}
