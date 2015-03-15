package ws.kostin.task9;

import java.util.Scanner;

/**
 * Created by luchkovsky on 12.03.15.
 * Создать статический метод, который будет иметь два целочисленных параметра a и b, и в качестве своего значения
 * возвращать случайное целое число из отрезка [a;b]. C помощью данного метода заполнить массив из 20 целых чисел и
 * вывести его на экран.
 *
 * Создать метод, который будет выводить указанный массив на экран в строку. С помощью созданного метода и метода из
 * предыдущей задачи заполнить 5 массивов из 10 элементов каждый случайными числами и вывести все 5 массивов на экран,
 * каждый на отдельной строке.
 */
public class e9_1 {
    public static int rand(int a, int b) {
        if (a > b)
        {
            //Min + (int)(Math.random() * ((Max - Min) + 1))
            int c = b + (int) (Math.random() * ((a - b) + 1));
            return c;
        }
        else if (a < b) {
            int c = a + (int) (Math.random() * ((b - a) + 1));
            return c;
        }
        else if (a == b) {
            int c = a;
            return c;
        }
        else return 0;
    }

    public static void pr(int mas[]) {
        for (int i = 0; i < mas.length; i++) {
            mas[i] = rand(12, 33);
            System.out.print(mas[i] + " ");
        }
        System.out.println(" ");
    }

    public static void main(String args[]) {
        //int i;
        int mas[] = new int[10];
        pr(mas);

        int mas1[] = new int[10];
        pr(mas1);

        int mas2[] = new int[10];
        pr(mas2);

        int mas3[] = new int[10];
        pr(mas3);

        int mas4[] = new int[10];
        pr(mas4);

       // Scanner sc = new Scanner(System.in);
       // System.out.println("Vvedite min massiva: ");
        //int a = sc.nextInt();
        //System.out.println("Vvedite man massiva: ");
        //int b = sc.nextInt();

        //System.out.print("Rez: ");
//        for (i = 0; i < mas.length; i++){
//            mas[i] = rand(a,b);
//            System.out.print(mas[i] + " ");
//        }
    }
}
