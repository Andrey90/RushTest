package ws.kostin.task8;

/**
 * Created by luchkovsky on 13.02.15.
 * Создайте массив из 20-ти первых чисел Фибоначчи и выведите его на экран. Напоминаем, что первый и второй члены
 * последовательности равны единицам, а каждый следующий — сумме двух предыдущих.
 */
public class e8_7 {
    public static void main(String[] args) {
        int i;
        int count = 0;
        int mas[] = new int[20];
        mas[0] = 1;
        mas[1] = 1;

        System.out.print(mas[0] + " " + mas[1] + " ");

        for (i = 2; i <= mas.length - 1; i ++){
            mas[i] = mas[i - 2] + mas[i - 1];
            System.out.print(mas[i] + " ");
            count++;
        }
        System.out.println();
        System.out.println(count + 2);

    }
}
