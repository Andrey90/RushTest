package ws.kostin.task6;

import java.util.Scanner;

/**
 * Created by luchkovsky on 18.01.15.
 * Создать программу, которая будет вычислять и выводить на экран сумму двух целых чисел, введённых пользователем.
 * Если пользователь некорректно введёт хотя бы одно из чисел, то сообщать об ошибке.
 */
public class e6_2 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Значение 1: ");
        double z1 = scanner.nextDouble();
        System.out.print("Значение 2: ");
        double z2 = scanner.nextDouble();

        if (z1 % 1 != 0 || z2 % 1 != 0){
            System.out.println("Введите коректные значения");
        }
        else {
            double sum = z1 + z2;
            System.out.println("Сумма чисел равна: " + (int)sum);
        }
    }
}
