package ws.kostin.task8;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 13.02.15
 * Time: 15:03
 * Создайте массив из 8 случайных целых чисел из отрезка [1;10]. Выведите массив на экран в строку.
 * Замените каждый элемент с нечётным индексом на ноль. Снова выведете массив на экран на отдельной строке.
 */
public class e8_4 {
    public static void main(String args[]) {
        int i;
        int mas[] = new int[8];

        for (i = 0; i < mas.length; i++) {
            int ran = (int) (1 + (Math.random()) * 9 + 1);
            mas[i] = ran;
            System.out.print(mas[i] + " ");
        }
        System.out.println(" ");

        for (i = 0; i < mas.length; i++){
            if (mas[i] % 2 != 0){
                mas[i] = 0;
            }
            System.out.print(mas[i] + " ");
        }
    }


}
