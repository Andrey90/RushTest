package shildt.book.exampleComporators;

import java.util.TreeSet;

/**
 * Created by luchkovsky on 24.11.2015.
 */
public class CompDemo {
    public static void main(String args[]){
        //Create TreeSet
        TreeSet<String> treeSet = new TreeSet<String>(new MyComp());
        //Add new elements in set-tree
        treeSet.add("W");
        treeSet.add("D");
        treeSet.add("O");
        treeSet.add("A");
        treeSet.add("Z");

        //Saw elements
        for (String elements : treeSet){
            System.out.println(" " + elements);
        }
        System.out.println("");
    }
}
