package ws.kostin.task4;

import java.util.Scanner;

/**
 * Created by luchkovsky on 15.01.15.
 * Создать программу, выводящую на экран ближайшее к 10 из двух чисел, записанных в переменные m и n.
 * Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45.
 */
public class e4_2 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter m: ");
        double m = scanner.nextDouble();

        System.out.print("Enter n: ");
        double n = scanner.nextDouble();

        int a = 10;
        double k = Math.abs(m - a);
        double z = Math.abs(n - a);

        if (k > z) {
            System.out.println("Ближе к 10 значение: " + n);
        }
        else
            System.out.println("Ближе к 10 значение: " + m);


    }
}
