package ws.kostin.task7;

import java.util.Scanner;

/**
 * Created by luchkovsky on 21.01.15.
 * Выведите на экран все положительные делители натурального числа, введённого пользователем с клавиатуры.
 */
public class e7_8 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите натуральное число: ");
        if (sc.hasNextInt()){
            int a = sc.nextInt();
            for (int i = 1; i <= a; i++){
                if (a % i == 0){
                    System.out.print(i + " ");
                }
            }
        }
    }
}
