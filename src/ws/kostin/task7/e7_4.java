package ws.kostin.task7;

/**
 * Created by luchkovsky on 21.01.15.
 * Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ….
 */
public class e7_4 {
    public static void main(String args[]){
        int count = 0;
        int i;
        int value = 2;

        for (i = 1; i < 21; i++){
            value = value * 2;
            System.out.print(value + " ");
            count++;
        }
        System.out.println(" ");
        System.out.println(count);
    }
}
