package shildt.book.exampleCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * Created by luchkovsky on 09.07.2015.
 */
public class IteratorDemo {
    public static void main(String[] args) {
        //Создать массив-список
        ArrayList<String> a1 = new ArrayList<String>();

        //добавить элементы в массив
        a1.add("A");
        a1.add("C");
        a1.add("Z");
        a1.add("B");
        a1.add("D");
        a1.add("E");

        //Использовать итераторы для отображения содержимого а1
        System.out.println("Исходное содержимое а1: " );
        Iterator<String> itr = a1.iterator();
        while (itr.hasNext()){
            String element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();

        //Модифицировать текущий обьект итерации
        ListIterator<String> list = a1.listIterator();
        while (list.hasNext()){
            String element = list.next();
            list.set(element + "+");
        }
        System.out.println("Модифицированное содержимое а1: ");
        itr = a1.iterator();
        while (itr.hasNext()){
            String element = itr.next();
            System.out.print(element + " ");
        }

        System.out.println();

        //Теперь отображаем список в обратном порядке
        System.out.println("Модифицированный список в обратном порядке: ");
        while (list.hasPrevious()){
            String element = list.previous();
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println(a1);
    }
}
