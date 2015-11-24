package shildt.book.exampleCollection;

import java.util.ArrayDeque;

/**
 * Created by luchkovsky on 05.07.2015.
 */
public class ArrayDequeDemo {
    public static void main(String[] args) {
        //Создать двустороннею очередь
        ArrayDeque<String> arrayDeque = new ArrayDeque<String>();

        //Использование ArrayDeque в виде стека
        arrayDeque.push("A");
        arrayDeque.push("B");
        arrayDeque.push("C");
        arrayDeque.push("D");
        arrayDeque.push("E");
        arrayDeque.push("F");

        System.out.println("Выталкиваем из стека: ");
        while (arrayDeque.peek() != null)
            System.out.print(arrayDeque.pop() + " ");

        System.out.println();
    }
}
