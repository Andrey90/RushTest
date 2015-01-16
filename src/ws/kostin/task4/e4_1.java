package ws.kostin.task4;

import java.util.Scanner;

/**
 * Created by luchkovsky on 15.01.15.
 * Создать программу, проверяющую и сообщающую на экран, является ли целое число записанное в переменную n, чётным либо нечётным.
 */
public class e4_1 {
    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        int k = n % 2;

        if (k == 0){
            System.out.println("Значение четное: " + n);
        }
        else {
            System.out.println("Значение не четное: " + n);
        }

    }
}
