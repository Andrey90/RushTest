package ws.kostin.task3;

import java.util.Scanner;

/**
 * Created by luchkovsky on 15.01.15.
 * В переменные a и b записаны целые числа, при этом b больше a. Создайте программу,
 * которая будет генерировать и выводить на экран целое псевдослучайное число из отрезка [a;b].
 */
public class e3_7 {
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = scanner.nextInt();

        System.out.println("Enter b: ");
        int b = scanner.nextInt();

        if (a < b){
            System.out.println(a + (int) (Math.random() * (b - a) + 1));
        }
        else
            System.out.println("Не удовлетворяет условия равенства");

        System.out.println("Finish");


    }
}