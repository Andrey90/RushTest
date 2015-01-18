package ws.kostin.task6;

import java.util.Scanner;

/**
 * Created by luchkovsky on 17.01.15.
 * Создать программу, которая будет сообщать, является ли целое число, введённое пользователем, чётным или нечётным.
 * Если пользователь введёт не целое число, то сообщать ему об ошибке.
 */
public class e6_1 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter mean: ");
        double mean = scanner.nextDouble();

        if (mean % 1 == 0) {
            if (mean % 2 == 0) {
                System.out.println("Значение четное: " + (int)mean);
            }
            else
                System.out.println("Значение не четное: " + (int)mean);
        }
        else
            System.out.println("Введите целое число");
    }
}
