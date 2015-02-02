package ws.kostin.task7;

import java.util.Scanner;

/**
 * Created by luchkovsky on 21.01.15.
 * Проверьте, является ли введённое пользователем с клавиатуры натуральное число — простым. Постарайтесь не выполнять лишних действий
 * (например, после того, как вы нашли хотя бы один нетривиальный делитель уже ясно, что число составное и проверку продолжать не нужно).
 * Также учтите, что наименьший делитель натурального числа n, если он вообще имеется, обязательно располагается в отрезке [2; √n].
 */
public class e7_9 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите натуральное число: ");
        int a = sc.nextInt();
        int count = 0;

        if (a % 1 == 0){
            for (int i = 1; i <= a; i++){
                count++;
            }
            if (count == 2){
                System.out.println("Число простое");
            } else {
                if (a != 1){
                    System.out.println("Число составное, у него более 2х делителей: ");
                }else {
                    System.out.println("Ввели: " + a);
                }
            }
        }
        else System.out.println("Введите целое число");
    }
}
