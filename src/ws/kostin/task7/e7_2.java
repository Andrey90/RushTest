package ws.kostin.task7;

/**
 * Created by luchkovsky on 21.01.15.
 * Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….
 */
public class e7_2 {
    public static void main(String args[]){
        int count = 0;
        for (int i = 0; i <= 54; i++){
            int value = 2*i + 1;
            System.out.print(value + " ");
            count++;
        }
        System.out.println(" ");
        System.out.println(count);
    }
}
