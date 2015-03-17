package ws.kostin.task9;

import java.util.Scanner;

/**
 * Created by luchkovsky on 12.03.15.
 * Создать статический метод, который будет иметь два целочисленных параметра a и b, и в качестве своего значения
 * возвращать случайное целое число из отрезка [a;b]. C помощью данного метода заполнить массив из 20 целых чисел и
 * вывести его на экран.
 *
 */
//статический метод, который будет иметь два целочисленных параметра a и b, и в качестве своего значения возвращать
// случайное целое число из отрезка [a;b] для заполнения массива.
public class e9_1 {
    public static int ran(int a, int b){
        if (a > b){
            int c = a + (int)(Math.random() * (b - a) + 1);
            return c;
        }
        else if (b > a){
            int c = b + (int)(Math.random() * (a - b) + 1);
            return c;
        }
        else {
            int c = a + (int)(Math.random() * (b - a) + 1);
            return c;
        }
    }
//Метод для заполнения массива
    public static int[] zapArr(int[]arr){
        //Определим случайные значения, в рамках которых будут находится значения элементов массива
        int x = (int)(Math.random() * 100);
        int y = (int)(Math.random() * 100);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ran(x, y);
        }
        return arr;
    }
//Метод для вывода массива на экран
    public static void print(int[]arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
            if(i == arr.length - 1){
                System.out.println(" ");
            }
        }
    }

//метод, который будет сортировать указанный массив по возрастанию
    public static void sort(int []arr){
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i]; // Предполагаемый минимальный элемент
            int imin = i; // Индекс минимального элемента
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    imin = j;
                }
            }
            if (i != imin) {
                int temp = arr[i];
                arr[i] = arr[imin];
                arr[imin] = temp;
            }
        }
    }

//Создание обьектов массивов и операции над ними с помощью созданных методов
    public static void main(String args[]){
        int mas1[] = new int[20];
        zapArr(mas1);
        sort(mas1);
        print(mas1);

        int mas2[] = new int[20];
        zapArr(mas2);
        sort(mas2);
        print(mas2);

        int mas3[] = new int[20];
        zapArr(mas3);
        sort(mas3);
        print(mas3);

        int mas4[] = new int[20];
        zapArr(mas4);
        sort(mas4);
        print(mas4);

        int mas5[] = new int[20];
        zapArr(mas5);
        sort(mas5);
        print(mas5);
    }
}
