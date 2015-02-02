package ws.kostin.task7;

/**
 * Created by luchkovsky on 21.01.15.
 * Выведите на экран первые 11 членов последовательности Фибоначчи.
 * Напоминаем, что первый и второй члены последовательности равны единицам, а каждый следующий — сумме двух предыдущих.
 */
public class e7_11 {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c = 0;

        System.out.print(a + " " + b + " ");
         for (int i = 3; i <= 11; i++){
             c = a + b;
             a = b;
             b = c;
             System.out.print(c + " ");
         }

    }
}
