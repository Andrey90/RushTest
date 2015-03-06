package ws.kostin.task8;

import java.util.Scanner;

/**
 * Created by luchkovsky on 06.03.15.
 * Пользователь вводит с клавиатуры натуральное число большее 3, которое сохраняется в переменную n. Если пользователь
 * ввёл не подходящее число, то программа должна просить пользователя повторить ввод. Создать массив из n случайных целых
 * чисел из отрезка [0;n] и вывести его на экран. Создать второй массив только из чётных элементов первого массива, если
 * они там есть, и вывести его на экран.
 */
public class e8_13 {
    public static void main(String args[]){
        int i;
        int a = 0;
        int b = 0;
        int n = 0;
        //Создадим 2 переменные, в первой будет храниться значение размера первого массива, введенного пользователем.
        // Во второй, размер второго массива - количесво четных элементов первого массива

        //С помощиью операторов do-while мы запрашиваем пользователя ввести число большее 3, пока он с этим задание не
        // справится
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Vvedite znachenie < 3: ");
            if (scanner.hasNextInt()){
                n = scanner.nextInt();
            }
        }
        while (n < 4);

        //Создадим и заполним первый массив
        System.out.print("Pervuy massiv: ");
        int mas1[] = new int[n];
        for (i = 0; i < mas1.length; i++){
            mas1[i] = (int)(Math.random() * (n + 1));
            System.out.print(mas1[i] + " ");

            //Каждый раз, когда значение элемента массива четное - увеличиваем счетчик
            if (mas1[i] > 0 && mas1[i] % 2 == 0){
                a++;
            }
        }

        System.out.println(" ");
        System.out.print("Kol. parnyh elementov: " + a);
        System.out.println(" ");

        //Если в первом массиве были четные элементы - создаем и заполняем второй массив
        if (a > 0){
            System.out.print("Massiv 2: ");
            int mas2[] = new int[a];
            for (i = 0, b = 0; i < mas1.length; i++){
                if (mas1[i] > 0 && mas1[i] % 2 == 0){
                    mas2[b] = mas1[i];
                    System.out.print(mas2[b] + " ");
                }
            }
        }
        else if (a == 0){
            System.out.println("Massiv 2 ne budet sozdan");
        }
    }
}

