package ws.kostin.task8;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 12.02.15
 * Time: 16:59
 * Создайте массив из 15 случайных целых чисел из отрезка [0;9]. Выведите массив на экран.
 * Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на отдельной строке.
 */
public class e8_3 {
    public static void main(String args[]) {
        int mas[] = new int[15];
        int count = 0;
        int i;
        for (i = 0; i <= 14; i++){
            int ran = (int)(Math.random() * (9 - 0) + 1);
            mas[i] = ran;
            System.out.print(mas[i] + " ");

            if (mas[i] % 2 == 0){
                count++;
            }
        }
        System.out.println();
        System.out.print(count);


    }

}

