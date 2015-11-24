package shildt.book.exampleComporators;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by luchkovsky on 24.11.2015.
 */
public class TreeMapDemo2 {
    public static void main(String[] args) {
        //Create map-tree
        TreeMap<String, Double> treeMap = new TreeMap<String, Double>(new TComp());

        //Add elements to the maap
        treeMap.put("Jon Dou", new Double(2323.34));
        treeMap.put("Gogy Dep", new Double(123.04));
        treeMap.put("Ivan Dam", new Double(2.344));
        treeMap.put("Jorg Geni", new Double(2453.4));
        treeMap.put("Jek Malbor", new Double(322323.34));
        treeMap.put("Karry Hey", new Double(23.34));

        //Get elements set
        Set<Map.Entry<String, Double>> set = treeMap.entrySet();

        //Saw elements
        for (Map.Entry<String, Double> me: set){
            System.out.println(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        //Add 1000 on the wallet of Ivan Dam
        double balance = treeMap.get("Ivan Dam");
        treeMap.put("Ivan Dam", balance + 1000);
        System.out.println("New balance of this man = " + treeMap.get("Ivan Dam"));
    }
}
