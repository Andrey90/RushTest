package ws.kostin.task9;

import java.util.Scanner;

/**
 * Created by luchkovsky on 17.03.15.
 * Подсчитайте, сколько раз потребуется повторно вычислить четвёртый элементы последовательности Фибоначчи для вычисления пятнадцатого элемента.
 */
public class e9_2 {
    public static int count = 0;
    public static int fibonachi(int a){
        if (a == 1 || a == 2){
            return 1;
        }
        int w = fibonachi(a - 1) + fibonachi(a - 2);
        if (w == 3){
            count++;
        }
        return w;
    }
    public static void main(String args[]){
        int rez = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vvedite znachenie: ");
        int d = scanner.nextInt();

        if (d < 3 && d > 0){
            rez = fibonachi(d);
            System.out.println(count);
            System.out.print(rez);
        }
        else {
            if (d > 0){
                int x1 = 1;
                int x2 = 1;
                rez = 0;
                for (int i = 3; i <= d; i++){
                    rez = x1 + x2;
                    x1 = x2;
                    x2 = rez;
                    if (rez == 3){
                        count++;
                    }
                }
                System.out.println(count);
                System.out.print(rez);
            }
            else {
                System.out.print("Vvedite korectnoe znachenie!");
            }
        }

    }
}
