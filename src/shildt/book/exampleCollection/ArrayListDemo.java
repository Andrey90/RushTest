package shildt.book.exampleCollection;

import java.util.ArrayList;

/**
 * Created by luchkovsky on 02.07.2015.
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        //Создаем массив-список
        ArrayList<String>a1 = new ArrayList<String>();
        ArrayList<Integer>a2 = new ArrayList<Integer>();
        a2.ensureCapacity(6);
        System.out.println("Начальный размер a1: " + a1.size());
        //Отображение массива-списка перед добавлением элементов
        System.out.println(a1);

        //Добавление элементов в массив-список
        a1.add("C");
        a1.add("A");
        a1.add("E");
        a1.add("B");
        a1.add("F");
        a1.add("D");
        a1.add(1, "A2");
        System.out.println("Размер а1 после вставки элементов: " + a1.size());
        //Отображение массива-списка после добавления элементов
        System.out.println(a1);

        //Удаление элементов из массива-списка
        a1.remove("F");
        a1.remove(2);
        System.out.println("Размер после удалений: " + a1.size());
        System.out.println("Отображение после удалений: " + a1);

        a2.add(44);
        a2.add(1);
        System.out.println(a2.size());
        System.out.println(a2);

    }
}
