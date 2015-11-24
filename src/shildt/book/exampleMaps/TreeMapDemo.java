package shildt.book.exampleMaps;

import java.util.*;

/**
 * Created by luchkovsky on 24.08.2015.
 */
public class TreeMapDemo {
    public static void main(String[] args) {
        //������� ����� - ������
        TreeMap<String, Double> treeMap = new TreeMap<String, Double>();

        //�������� �������� � ����� - ������
        treeMap.put("Ivan Petrov", 2332.4);
        treeMap.put("Semen Ivanov", 12.3);
        treeMap.put("Marina Victorovna", 344.3);

        //�������� ����� ���������
        Set<Map.Entry<String, Double>> set = treeMap.entrySet();
        System.out.println(set);

        //���������� ���� ���������
        for (Map.Entry<String, Double> me : set){
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        //�������� 1000 �� ����
        double balance = treeMap.get("Semen Ivanov");
        System.out.println(balance);

        treeMap.put("Semen Ivanov", balance + 1000);
        System.out.println(treeMap.get("Semen Ivanov"));

    }
}
