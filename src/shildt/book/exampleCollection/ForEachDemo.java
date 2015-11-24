package shildt.book.exampleCollection;

import java.util.ArrayList;

/**
 * Created by luchkovsky on 09.07.2015.
 */
public class ForEachDemo {
    public static void main(String[] args) {
        //Создать массив-список для целых чисел
        ArrayList<Integer> a1 = new ArrayList<Integer>();

        //Добавить значения в массив-список
        a1.add(1);
        a1.add(2);
        a1.add(3);
        a1.add(4);
        a1.add(5);

        //Использовать цикл для отображения значений
        System.out.println("Исходное содержимое а1: " + a1);
        for (int v: a1){
            System.out.println(v + " ");
        }
        System.out.println();
        
        //Суммирование значений в цикле for
        int sum = 0;
        for (int v: a1){
            sum += v;
        }
        System.out.println("Сумма значеий: " + sum);
    }
}
