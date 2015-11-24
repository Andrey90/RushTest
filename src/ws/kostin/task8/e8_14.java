package ws.kostin.task8;

/**
 * Created by luchkovsky on 11.03.15.
 * Создать двумерный массив из 8 строк по 5 столбцов в каждой из случайных целых чисел из отрезка [10;99].
 * Вывести массив на экран.
 */
public class e8_14 {
    public static void main(String args[]){
        int mas[][] = new int[5][8];
        int i, j;
        int rand;

        for (i = 0; i < mas.length; i++){
            for (j = 0; j < mas[i].length; j++){
                mas[i][j] = (int)(10 + (Math.random()) * 90);
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
    }
}
