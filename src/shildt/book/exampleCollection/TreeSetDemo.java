package shildt.book.exampleCollection;

import java.util.TreeSet;

/**
 * Created by luchkovsky on 05.07.2015.
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<String>();

        System.out.println(treeSet);

        treeSet.add("C");
        treeSet.add("A");
        treeSet.add("B");
        treeSet.add("E");
        treeSet.add("F");
        treeSet.add("D");
        treeSet.add("Z");

        System.out.println(treeSet);
        System.out.println(treeSet.subSet("C", "F"));
    }
}
