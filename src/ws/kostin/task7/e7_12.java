package ws.kostin.task7;

import java.util.Scanner;

/**
 * Created by luchkovsky on 28.01.15.
 * Для введённого пользователем с клавиатуры натурального числа посчитайте сумму всех его цифр (заранее не известно сколько цифр будет в числе).
 */
public class e7_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");

        if (scanner.hasNextInt()){
            int a = scanner.nextInt();
            int sum = 0;

            while (a != 0){
                sum = sum + (a % 10);
                a = a / 10;
            }
            System.out.println(sum);

        }



    }
}
