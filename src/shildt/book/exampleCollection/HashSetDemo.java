package shildt.book.exampleCollection;

import java.util.HashSet;

/**
 * Created by luchkovsky on 05.07.2015.
 */
public class HashSetDemo {
    public static void main(String[] args) {
        //������� ��� �����
        HashSet<String> hashSet = new HashSet<>();

        //�������� �������� � ��� �����
        hashSet.add("B");
        hashSet.add("A");
        hashSet.add("D");
        hashSet.add("Z");
        hashSet.add("E");
        hashSet.add("C");
        hashSet.add("F");
        System.out.println(hashSet);

        //�������� ���������� � ��������������� �������
    }
}
