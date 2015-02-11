package ws.kostin.task8;

/**
 * Created by luchkovsky on 11.02.15.
 * Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку, а затем этот же массив выведите
 * на экран тоже в строку, но в обратном порядке (99 97 95 93 … 7 5 3 1).
 */
public class e8_2 {
    public static void main(String[] args) {
        int a = 0;

        int mas[] = new int[50];

        for (int i = 1; i <= 99; i++){
            if (i % 2 != 0){
                mas[a] = i;
                System.out.print(mas[a] + " ");
                a++;
            }
        }
        System.out.println("");
        for (int i = mas.length - 1; i >= 0; i--){
            System.out.print(mas[i] + " ");
        }

    }
}
