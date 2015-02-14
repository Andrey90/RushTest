package ws.kostin.task8;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 14.02.15
 * Time: 12:06
 * Создайте массив из 12 случайных целых чисел из отрезка [-15;15]. Определите какой элемент является в этом массиве
 * максимальным и сообщите индекс его последнего вхождения в массив.
 */
public class e8_8 {
    public static void main(String args[]){
        int i;
        int mas[] = new int[12];
        int count = 0;
        int max = 0;

        for (i = 0; i < mas.length; i++){
            mas[i] = (int)((-15) + (Math.random() * 30 + 1));
            System.out.print(mas[i] + " ");
            count++;
        }
        System.out.println(" ");
        System.out.println(count);

//        for (i = 0; i < mas.length - 1; i++){
//            if (mas[i] > mas[i + 1]){
//                max = mas[i];
//            }
//            System.out.print(max);
//        }
    }

}
