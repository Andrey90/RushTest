package ws.kostin.task1;

/**
 * Created by luchkovsky on 23.12.14.
 */

//Создайте программу, которая вычислит выражение 14/209+14ˣ(29-13²+14/3) и выведет
// результат на экран. При этом число 14 обязательно сохраните в отдельной переменной, выбрав для неё подходящий тип.

public class e1_2 {
    public static void main(String args[]){
        double a = 14;
        System.out.println(a/209 + a * (29 - Math.pow(13, 2) + a / 3 ));
    }
}
