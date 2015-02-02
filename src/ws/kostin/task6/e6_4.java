package ws.kostin.task6;


import java.util.Scanner;

/**
 * Created by luchkovsky on 18.01.15.
 * Создать программу, которая будет проверять, является ли слово из пяти букв, введённое пользователем,
 * палиндромом (примеры: «комок», «ротор»). Если введено слово не из 5 букв, то сообщать об ошибке.
 * Программа должна нормально обрабатывать слово,
 * даже если в нём использованы символы разного регистра. Например, слова «Комок» или «РОТОР» следует также считать палиндромами.
 */
public class e6_4 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи слово из 5 букв: ");
        String wrd = scanner.next();
        String res = "";

        if (wrd.length() == 5){
            int len = wrd.length();
            for (int i = len - 1; i >= 0; i--){
                res += wrd.charAt(i);
            }
            System.out.println(res);
        }
        else System.out.println("Слово должно состоять из 5 букв");
    }
}
