package shildt.book.exampleCollection;
import java.util.*;

/**
 * Created by luchkovsky on 24.08.2015.
 */
class Address {
    private String name;
    private String street;
    private String city;
    private String state;
    private String code;

    Address(String n, String s, String c, String st, String cd){
        name = n;
        street = s;
        city = c;
        state = st;
        code = cd;
    }
    public String toString(){
        return name + "\n" + street + " " + city + "\n" + state + " " + code;
    }
}


class MailList{
    public static void main(String[] args) {
        LinkedList<Address> m1 = new LinkedList<Address>();
        //Добавление элементов в связанный список

        m1.add(new Address("Ivan", "Kiev", "Ukraine", "UA", "2334243"));
        m1.add(new Address("Ivan1", "Kiev1", "Ukraine1", "UA1", "43121"));
        m1.add(new Address("Ivan2", "Kiev2", "Ukraine2", "UA2", "23345533"));

        //Отобразить список почтовых адерсов
        for (Address element : m1){
            System.out.println(element + "\n");
        }
        System.out.println();
    }
}
