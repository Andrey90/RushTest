package ws.kostin.task12_4;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 06.04.15
 * Time: 16:30
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args) {
        SomeClass a = new SomeClass();
        System.out.println(a.someMethod());//It works
        System.out.println(((Interface1)a).someField);
        System.out.println(Interface1.someField);
    }
}
