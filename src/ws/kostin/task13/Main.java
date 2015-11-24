package ws.kostin.task13;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 06.04.15
 * Time: 16:59
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String args[]) {
//        int a = 4;
//        try {
//            System.out.println(a/0);
//        }
//        catch (ArithmeticException e){
//            System.out.println("ошибка деления на 0");
//        }
        int[] mas = {-1, 0, 1};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер индекс массива: ");
        int a = 0;
        try {
            a = scanner.nextInt();
            mas[a] = 4/a;
            System.out.println(mas[a]);
        }
        catch (ArithmeticException err){
            System.out.println("Недопустимая арифметическая операция");
        }
        catch (ArrayIndexOutOfBoundsException err){
            System.out.println("Обращение к недопустимому символу массива");
        }
        catch (InputMismatchException err){
            System.out.println("Error");
        }
        catch (Exception err){
            System.out.println("Non error");
        }
    }
}
