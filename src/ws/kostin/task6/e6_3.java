package ws.kostin.task6;

import java.util.Scanner;

/**
 * Created by luchkovsky on 18.01.15.
 * Создать программу, которая будет выводить на экран меньшее по модулю из трёх введённых пользователем вещественных чисел.
 */
public class e6_3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите значение 1: ");
        double z1 = sc.nextDouble();
        System.out.print("Введите значение 2: ");
        double z2 = sc.nextDouble();
        System.out.print("Введите значение 3: ");
        double z3 = sc.nextDouble();

        if (Math.abs(z1) > Math.abs(z2)){
            if (Math.abs(z2) > Math.abs(z3)){
                System.out.println(z3);
            }
            else System.out.println(z2);
        }
        else if (Math.abs(z1) < Math.abs(z2)){
            if (Math.abs(z2) < Math.abs(z3)){
                System.out.println(z1);
            }
            else if (Math.abs(z1) < Math.abs(z3)){
                System.out.println(z1);
            }
            else System.out.println(z3);
        }
    }
}
