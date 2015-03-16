package ws.kostin.task9;

import java.util.Scanner;

/**
 * Created by luchkovsky on 12.03.15.
 * Создать статический метод, который будет иметь два целочисленных параметра a и b, и в качестве своего значения
 * возвращать случайное целое число из отрезка [a;b]. C помощью данного метода заполнить массив из 20 целых чисел и
 * вывести его на экран.
 */
public class e9_1 {
    public static int ran(int a,int b){
        int c = a + (int)(Math.random() * (b - a) + 1);
        return c;
    }

    public static void pr(int[] arr1){
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++){
            arr[i] = ran(1,23);
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]){
        int[] arr1 = new int[10];
        pr(arr1);
    }
}
