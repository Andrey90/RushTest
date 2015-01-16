package ws.kostin.task5;

/**
 * Created by luchkovsky on 16.01.15.
 * В три переменные a, b и c явно записаны программистом три целых попарно неравных между собой числа.
 * Создать программу, которая переставит числа в переменных таким образом, чтобы при выводе на экран
 * последовательность a, b и c оказалась строго возрастающей.
 Числа в переменных a, b и c: 3, 9, -1
 Возрастающая последовательность: -1, 3, 9
 */
public class e5_3 {
    public static void main(String args[]){
        int a = 111;
        int b = 145;
        int c = 123;

        System.out.println(a + " " + b + " " + c);

        int temp;
//Сортировка значений по спаданию
        if (a < b){
            temp = b;
            b = a;
            a = temp;
        }
        if (a < c){
            temp = c;
            c = a;
            a = temp;
        }
        if (b < c){
            temp = c;
            c = b;
            b = temp;
        }

        System.out.println(a + " " + b + " " + c);

//Сортировка значений по возростанию
        if (a > b){
            temp = a;
            a = b;
            b = temp;
        }
        if (a > c){
            temp = a;
            a = c;
            c = temp;
        }
        if (b > c){
            temp = b;
            b = c;
            c = temp;
        }
        System.out.println(a + " " + b + " " + c);
    }
}
