package shildt.book.exampleComporators;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

/**
 * Created by luchkovsky on 24.11.2015.
 */
public class AlgorithmsDemo {
    public static void main(String args[]){
        //Create initialization link list
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(-8);
        linkedList.add(12);
        linkedList.add(-12);
        linkedList.add(8);

        //Create comparator of reverse list
        Comparator<Integer> com = Collections.reverseOrder();
        //Sort list of this comparator
        Collections.sort(linkedList, com);
        System.out.println("List sort reverse: ");
        for (int i: linkedList){
            System.out.println(i + " ");
        }
        System.out.println();

        //Mixed list
        Collections.shuffle(linkedList);

        //Saw mix list
        System.out.println("List by MIX: ");
        for(int i: linkedList){
            System.out.println(i + " ");
        }

        System.out.println();
        System.out.println(Collections.min(linkedList));
        System.out.println(Collections.max(linkedList));
    }
}
