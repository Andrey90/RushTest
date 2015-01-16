package ws.kostin.task1;

/**
 * Created by luchkovsky on 23.12.14.
 */

//Создайте программу, которая вычислит выражение 20ˣ⅓+158² и выведет результат на экран.

public class e1_1 {
    public static void main(String args[]){
        int a = 20, b = 1, c = 3;
        double d = 158;
        double rez;

        rez = (a * b / c) + Math.pow(d, 2);
        System.out.println(rez);
    }
}
