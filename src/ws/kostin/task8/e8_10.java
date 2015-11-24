package ws.kostin.task8;

/**
 * Created by luchkovsky on 03.03.15.
 * Создайте массив из 11 случайных целых чисел из отрезка [-1;1], выведите массив на экран в строку. Определите какой
 * элемент встречается в массиве чаще всего и выведите об этом сообщение на экран. Если два каких-то элемента встречаются
 * одинаковое количество раз, то не выводите ничего.
 */
public class e8_10 {
    public static void main(String args[]){
        int mas[] = new int[11];
        int i = 0;
        int ran;
        int a = 0;
        int b = 0;
        int c = 0;

        for (i = 0; i < mas.length; i++){
            mas[i] = (-1) + (int)(Math.random() * ((1 - (-1)) + 1));
            System.out.print(mas[i] + " ");
            if (mas[i] == -1){
                a++;
            }
            else if (mas[i] == 0){
                b++;
            }
            else if (mas[i] == 1){
                c++;
            }
        }
        System.out.println(" ");

        if (a == b){
            System.out.println("a = b = " + a);
        }
        else if (a == c){
            System.out.println("a = c = " + a);
        }
        else if (c == b){
            System.out.println("c = b = " + c);
        }
        else if (a > b && a > c){
            System.out.println("a: " + a);
        }
        else if (a > b && a < c){
            System.out.println("c: " + c);
        }
        else if (a < b && b > c){
            System.out.println("b: " + b);
        }


    }
}