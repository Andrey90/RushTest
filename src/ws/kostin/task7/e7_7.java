package ws.kostin.task7;

import java.util.Scanner;

/**
 * Created by luchkovsky on 21.01.15.
 * Создайте программу, вычисляющую факториал натурального числа n, которое пользователь введёт с клавиатуры.
 */
public class e7_7 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число");
        int a;
        int rez = 1;
        if (scanner.hasNextInt()){
            a = scanner.nextInt();
            for (int i = 1; i <= a; i++){
                rez = rez * i;
            }
            System.out.println(rez);
        }
        else System.out.println("Введите натуральное число");
    }
}
