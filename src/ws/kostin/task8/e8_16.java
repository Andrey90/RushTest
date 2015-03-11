package ws.kostin.task8;

/**
 * Created by luchkovsky on 11.03.15.
 * Cоздать двумерный массив из 7 строк по 4 столбца в каждой из случайных целых чисел из отрезка [-5;5]. Вывести массив
 * на экран. Определить и вывести на экран индекс строки с наибольшим по модулю произведением элементов. Если таких
 * строк несколько, то вывести индекс первой встретившейся из них.
 */
public class e8_16 {
    public static void main(String args[]){
        int mas[][] = new int[7][4];
        int i, j;

        for (i = 0; i < mas.length; i++){
            for (j = 0; j < mas[i].length; j++){
                //Min + (int)(Math.random() * ((Max - Min) + 1))
                mas[i][j] = (int)(Math.random() * 11) - 5;
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
    }
}
