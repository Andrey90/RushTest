package ws.kostin.task2;

import java.util.Scanner;

/**
 * Created by luchkovsky on 13.01.15.
 * В переменной n хранится натуральное двузначное число. Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n.
 * В переменной n хранится натуральное трёхзначное число. Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n.
 */
public class e2_2 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи число для суммирования: ");
        int a = scanner.nextInt();

        String str = Integer.toString(a);
        System.out.println("Начальная переменная в строке: " + a);

        char [] myCharArray = str.toCharArray(); //строку символов в массив символов
        System.out.println(myCharArray);

        int i;
        int sum = 0;
        for (i = 0; i < myCharArray.length; i ++ ){
            int k = Character.getNumericValue(myCharArray[i]);
            sum += k;
        }
        System.out.println(sum);
    }

}
