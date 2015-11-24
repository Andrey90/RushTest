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
        int max = 0;
        int maxIndex = 0;

        for (i = 0; i < mas.length; i++){
            mas[i] = (int)((-15) + (Math.random() * 30 + 1));
            System.out.print(mas[i] + " ");

            if (i == 0){
                max = mas[i];
                maxIndex = i;
            }
            if (i >= 1 && mas[i] > max){
                max = mas[i];
                maxIndex = i;
            }
        }
        System.out.println();
        System.out.println("maxElement = " + max + "; and maxIndex of this element = " + maxIndex );
    }


}
