package ws.kostin.task1;

/**
 * Created by luchkovsky on 13.01.15.
 */
/**
 * В переменной n хранится вещественное число с ненулевой дробной частью. Создайте программу, округляющую число n до ближайшего целого и выводящую результат на экран.
 */
public class e1_4 {
    public static void main(String args[]){
        double n = 39.66;
        double a = Math.round(n);

        int b = (int)a;

        System.out.print(b);
    }

}
