package ws.kostin.task8;

/**
 * Created by luchkovsky on 11.03.15.
 * Создать двумерный массив из 5 строк по 8 столбцов в каждой из случайных целых чисел из отрезка [-99;99].
 * Вывести массив на экран. После на отдельной строке вывести на экран значение максимального элемента этого массива
 * (его индекс не имеет значения).
 */
public class e8_15 {
    public static void main(String args[]){
        int [][]mas = new int[5][8];
        int i, j;

        for (i = 0; i < mas.length; i++){
            for (j = 0; j < mas[i].length; j++){
                //Min + (int)(Math.random() * ((Max - Min) + 1))
                mas[i][j] = (int)((Math.random() * 199) - 99);
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }

        int max = mas[0][0];
        for (i = 0; i<mas.length; i++){
            for (j = 0; j < mas[i].length; j++){
                if (mas[i][j] > max){
                    max = mas[i][j];
                }
            }
        }

        int min = mas[0][0];
        for (i = 0; i < mas.length; i++){
            for (j = 0; j < mas[i].length; j++){
                if (mas[i][j] < min){
                    min = mas[i][j];
                }
            }
        }
        System.out.println("max znachenie: " + max);
        System.out.println("min znachenie: " + min);
    }
}
