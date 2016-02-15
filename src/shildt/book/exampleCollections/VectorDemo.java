package shildt.book.exampleCollections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/**
 * Created by luchkovsky on 15.02.2016.
 */
public class VectorDemo {
    public static void main(String[] args) {
        //Start size 3, inkrement 2
        Vector<Integer> v = new Vector<Integer>(3, 2);
        System.out.println("Start size: " + v.size());
        System.out.println("Start count: " + v.capacity());

        v.add(5);
        v.add(1);
        v.add(3);
        v.add(2);
        v.add(4);

        System.out.println("Size after four adding: " + v.size());
        System.out.println("Count after four adding: " + v.capacity());

        System.out.println("The first element: " + v.firstElement());
        System.out.println("The last element: " + v.lastElement());

        if (v.contains(3)){
            System.out.println("This vector contain 3");
        }

        //Count of vector elements
        Enumeration<Integer> enumeration = v.elements();
        System.out.println("\nElements of vector: ");
        while (enumeration.hasMoreElements()){
            System.out.print(enumeration.nextElement() + " ");
        }
        System.out.println();

        //Example of iterator
        Iterator<Integer> iterator = v.iterator();
        System.out.print("\nElements of vector with iterator: ");
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }

        //Example for-each
        System.out.println("\n Elements with for each");
        for (int i: v){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
