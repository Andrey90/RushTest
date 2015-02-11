package ws.kostin.task8;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 04.02.15
 * Time: 12:42
 * To change this template use File | Settings | File Templates.
 * Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива на экран сначала в строку, отделяя один
 * элемент от другого пробелом, а затем в столбик (отделяя один элемент от другого началом новой строки).
 * Перед созданием массива подумайте, какого он будет размера.
 */
public class e8_1 {
    public static void main(String args[]) {
        int mas[] = new int[10];
        int a = 0;

        for (int i = 1; i <= 20; i++){
            if (i % 2 == 0){
                mas[a] = i;
                System.out.println(mas[a] + " ");
                a++;
            }
        }
    }
}
