package ws.kostin.task7;

import java.util.Scanner;

/**
 * Created by luchkovsky on 20.01.15.
 */
public class e7_1c {
    public static void main(String args[]) {
        int prog, user;
        // prog — число созданное программой
        // user — число введённое пользователем

        do {
            prog = (int) ((Math.random() * 20) + 1) - 10;
            System.out.println("Сгенерированное число: " + prog);
        }
        while (prog == 0);
////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("Я загадала число от -10 до 10, отгадайте его. " + prog);
        System.out.print("Введите Ваше число: ");
        Scanner input = new Scanner(System.in);

        int count = 1;

        //Проверка, есть ли в потоке целое число
        if (input.hasNextInt()) {
            do {
                //Читаем с потока ввода целое число
                user = input.nextInt();
                if (user == prog) {
                    System.out.println("Вы угадали число!!!");
                } else {
                    count++;
                    // Проверяем, входит ли число в отрезок [1;10]
                    if (user >= -10 && user <= 10) {
                        System.out.println("Вы не угадали(");
                        // Если число загаданное программой меньше...
                        if (prog < user) {
                            System.out.println("Мое число меньше");

                        } else {
                            System.out.println("Мое число больше");
                        }
                        // Если знаки чисел разные
                        if (prog * user < 0 && user < 0) {
                            System.out.println("Введите позитивное значение");
                        } else if (prog * user < 0 && user > 0) {
                            System.out.println("Введите отрицательное значение");
                        }
                    }
                }
            }
            while (user != prog);
        } else {
            System.out.println("Вы не ввели целое число");
        }
        System.out.println("Количество попыток: " + count);
        System.out.println("До свиданья!");

    }
}
