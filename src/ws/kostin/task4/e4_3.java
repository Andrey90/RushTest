package ws.kostin.task4;

import java.util.Scanner;

/**
 * Created by luchkovsky on 15.01.15.
 * В три переменные a, b и c записаны три вещественных числа. Создать программу,
 * которая будет находить и выводить на экран вещественные корни квадратного уравнения ax²+bx+c=0, либо сообщать,
 * что корней нет.
 */
public class e4_3 {
    public static void main(String args[]){

        //сканнер значений a, b, c
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите a: ");
        int a = scanner.nextInt();
        System.out.println("Введите b: ");
        int b = scanner.nextInt();
        System.out.println("Введите c: ");
        int c = scanner.nextInt();

        double disc = Math.pow(b,2) - 4 * a * c; //находим дискрименант

        //условия нахождения корней уравнения
        if (disc > 0){
            System.out.println("Уравнение имеет 2 корня: ");
            System.out.println((-b + Math.sqrt(Math.pow(b,2) - 4 * c)) / (2 * a));
            System.out.println((-b - Math.sqrt(Math.pow(b,2) - 4 * c)) / (2 * a));
        }
        else if (disc == 0){
            System.out.println("Уравнение имеет 1 корень: ");
            System.out.println(-(b / (2 * a)));
        }
        else
            System.out.println("Уравнение не имеет корней:");
    }
}
