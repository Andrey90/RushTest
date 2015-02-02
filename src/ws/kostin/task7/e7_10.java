package ws.kostin.task7;

/**
 * Created by luchkovsky on 21.01.15.
 * Создайте программу, выводящую на экран 12 первых элементов последовательности 2an-2–2, где a1=3 и a2=2.
 */
public class e7_10 {
    public static void main(String args[]) {
        for (int i = 1, a1 = 3, a2 = 2; i <= 12; i++) {
            if (i % 2 == 0) {
                a2 = a2 * 2 - 2;
                System.out.print(a1 + " ");
            } else {
                a1 = a1 * 2 - 2;
                System.out.print(a2 + " ");
            }
        }
    }
}
