package ws.kostin.task2;

/**
 * Created by luchkovsky on 13.01.15.
 *
 *В переменных q и w хранятся два натуральных числа. Создайте программу, выводящую на экран результат деления q на w с остатком.
 */
public class e2_1 {
    public static void main(String args[]){
        int q = 4;
        int w = 4;
        int z = q / w;
        int k = q % w;

        System.out.println(q + " / " + w + " = " + z + " и " + k + " в остатке");
    }
}
