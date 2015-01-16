package ws.kostin.task5;

import java.util.Scanner;

/**
 * Created by luchkovsky on 15.01.15.
 Создать программу, которая будет проверять попало ли случайно выбранное из отрезка [5;155] целое число в интервал (25;100) и сообщать результат на экран.
 Примеры работы программы:
 Число 113 не содержится в интервале (25,100)
 Число 72 содержится в интервале (25,100)
 */
public class e5_1 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = scanner.nextInt();

        if (n >= 5 && n <= 155){
            if (n > 25 && n < 100){
                System.out.println("Число " + n + " содержится в интервале (25,100)");
            }
            else System.out.println("Число " + n + " не содержится в интервале (25,100)");
        }
        else System.out.println("Число " + n + " не содержится в интервале [5,155]");

    }
}
