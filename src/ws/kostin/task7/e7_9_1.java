package ws.kostin.task7;

import java.util.Scanner;

/**
 * Created by luchkovsky on 21.01.15.
 * Проверьте, является ли введённое пользователем с клавиатуры натуральное число — простым.
 * Постарайтесь не выполнять лишних действий (например, после того, как вы нашли хотя бы один нетривиальный делитель уже ясно, что число составное и проверку продолжать не нужно).
 * Также учтите, что наименьший делитель натурального числа n, если он вообще имеется, обязательно располагается в отрезке [2; √n].
 */

public class e7_9_1 {
    public static void main(String[] args) {
        int n, k;
        boolean b;
        b = false;
        Scanner sc = new Scanner(System.in);
        System.out.print("Vvedite chislo: ");
        if (sc.hasNextInt()) {
            n = sc.nextInt();
            for (int i = 1; i <= Math.sqrt(n); i++) {
                if (n % i == 0 && i > 1) {
                    b = true;
                    break;
                }
            }
            if (b) {
                System.out.println("Chislo " + n + " ne prostoje, tak kak u nego est otlichnij ot nulja delitel ");
            } else {
                System.out.println("Chislo " + n + " prostoje, tak kak delitsa toljko na edinitsu i na samo sebja");
            }
        } else {
            System.out.println("Vi vveli nepraviljnoje chislo");
        }
    }
}
