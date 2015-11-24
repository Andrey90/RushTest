package shildt.book.exampleCollection;

import java.util.LinkedList;

/**
 * Created by luchkovsky on 05.07.2015.
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        //Создать связанный список
        LinkedList<String> ll = new LinkedList<String>();
        //ДОбавить элементы в связанный список
        ll.add("F");
        ll.add("B");
        ll.add("D");
        ll.add("E");
        ll.add("C");
        ll.addLast("Z");
        ll.addFirst("A");
        System.out.println(ll);

        //Удалить элементы из связанного списка
        ll.remove("F");
        ll.remove(2);
        System.out.println(ll);

        //Удалить первый и последний элементы
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);

        //Получить и присвоить значения
        String val = ll.get(2);
        ll.set(2, val + "-Изменен");
        System.out.println(ll);
        System.out.println(val);
    }
}
