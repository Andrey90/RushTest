package shildt.book.exampleCollections;

import java.util.Objects;
import java.util.Properties;
import java.util.Set;

/**
 * Created by luchkovsky on 16.02.2016.
 */
public class PropertiesDemo {
    public static void main(String[] args) {
        Properties capitals = new Properties();
        capitals.put("test1", "TEST1");
        capitals.put("test2", "TEST2");
        capitals.put("test3", "TEST3");

        //get of set keys
        Set<Object> states = capitals.keySet();

        //show all states of capital
        for (Object name: states){
            System.out.println("Capital of state: " + name + " - " + capitals.getProperty((String)name) + ".");
        }
        System.out.println();

        //find state, who not be in list
        String str = capitals.getProperty("test4", "not find");
        System.out.println("test4" + str + ".");
    }
}
