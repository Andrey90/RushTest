package ws.kostin.task8;

import java.util.Scanner;

/**
 * Created by luchkovsky on 04.03.15.
 * Пользователь должен указать с клавиатуры чётное положительное число, а программа должна создать массив указанного
 * размера из случайных целых чисел из [-5;5] и вывести его на экран в строку. После этого программа должна определить
 * и сообщить пользователю о том, сумма модулей какой половины массива больше: левой или правой, либо сообщить, что эти
 * суммы модулей равны. Если пользователь введёт неподходящее число, то программа должна требовать повторного ввода до
 * тех пор, пока не будет указано корректное значение.
 */
public class e8_11 {
    public static void main(String args[]) {
        int i = 0;
        int a = 0;
        int l = 0;
        int r = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Vvedite znachenie:");

        if (sc.hasNextInt()) {
            do {
                a = sc.nextInt();
                if (a % 2 != 0 || a < 0) {
                    System.out.print("Vvedite znachenie povtorno: ");
                }
            }
            while (a % 2 != 0 || a < 0);
            int mas[] = new int[a];
            for (i = 0; i < mas.length; i++) {
                mas[i] = (-5) + (int) (Math.random() * (5 - (-5)) + 1);
                System.out.print(mas[i] + " ");
            }

            for (i = 0; i < mas.length/2; i++){
                l = l + Math.abs(mas[i]);
            }
            for (i = mas.length/2; i < mas.length; i++){
                r = r + Math.abs(mas[i]);
            }

            System.out.println();

            if (l > r){
                System.out.println("l > r: " + l + " > " + r);
            }
            else if (r > l){
                System.out.println("r > l: " + r + " > " + l);
            }
            else if (r == l){
                System.out.println("r = l: " + r + "=" + l);
            }
        }
    }
}
