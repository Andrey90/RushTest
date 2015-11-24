package shildt.book.exampleMaps;

import java.util.*;

/**
 * Created by luchkovsky on 24.08.2015.
 */
public class HashMapDemo {
    public static void main(String[] args) {
        //������ ��� �����
        HashMap<String ,Double> hashMap = new HashMap<String, Double>();

        //��������� �������� � �����
        hashMap.put("Don Djoy", 4332.32);
        hashMap.put("Iven Petrov", 23.32);
        hashMap.put("Djon Smith", new Double(3243.4));
        hashMap.put("Eren Gordan", new Double(23));

        //�������� ����� ���������
        Set<Map.Entry<String, Double>> set = hashMap.entrySet();

        //���������� �����
        for (Map.Entry<String, Double> me : set){
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        //�������� 1000 �� ���� Iven Petrov
        double balance = hashMap.get("Iven Petrov");
        System.out.println("Old balance of Iven Petrov: " + balance);
        hashMap.put("Iven Petrov", balance + 1000);
        System.out.println("New balance of Iven Petrov equals: " + hashMap.get("Iven Petrov"));

        double balance2 = hashMap.get("Djon Smith");
        System.out.println("Old balance of Djon Smith: " + balance2);
        hashMap.put("Djon Smith", balance + 5000);
        System.out.println("New balance of Djon Smith equals: " + hashMap.get("Djon Smith"));
    }
}

