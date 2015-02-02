package ws.kostin.task7;

/**
 * Created by luchkovsky on 21.01.15.
 *Создайте программу, выводящую на экран все неотрицательные элементы последовательности 90 85 80 75 70 65 60 ….
 */
public class e7_3 {
    public static void main(String args[]){
        int i;
        int count = 0;

        for (i = 90; i > 0; i = i - 5){

            System.out.print(i + " ");
            count++;
        }
        System.out.println(" ");
        System.out.println(count);
    }
}
