package ws.kostin.task8;

/**
 * Created by luchkovsky on 13.02.15.
 * Создайте массив из 4 случайных целых чисел из отрезка [10;99], выведите его на экран в строку. Определить и вывести
 * на экран сообщение о том, является ли массив строго возрастающей последовательностью.
 */
public class e8_6 {
    public static void main(String[] args) {
        int i;
        int mas[] = new int[4];

        for (i = 0; i < mas.length; i++){
            int ran = (int)(10 + (Math.random()) * 89 + 1);
            mas[i] = ran;
            System.out.print(mas[i] + " ");
        }
        System.out.println(" ");
        for (i = 1; i < mas.length; i++){
            if (mas[i - 1] >= mas[i]){
                System.out.println("Массив не возрастающей последовательностью");
                break;
            }
            if (i == mas.length - 1){
                System.out.println("Массив с возрастающей прогрессией");
            }
        }
    }
}
