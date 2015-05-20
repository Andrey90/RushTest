package shildt.book.exampleWorkString;

/**
 * Created by luchkovsky on 19.05.15.
 */
public class SubStringCons {
    public static void main(String[] args) {
        byte ascii[] = {11, 22, 33, 44, 55, 66};

        String s1 = new String(ascii);
        System.out.println(s1);

        String s2 = new String(ascii, 2, 3);
        System.out.println(s2);

        int len = s1.length();
        System.out.println(len);

        String s3 = "My" + "Name";
        String s4 = s3 + "Andrey";
        System.out.println(s4);

        String s5 = "Kiev" +
                "Lviv"+
                "Odesa"+
                "Donetsk";
        System.out.println(s5);

        String s6 = new String(s5);
        System.out.println(s6.length());

        int age = 9;
        String s = "He" + "is" + age;
        System.out.println(s + " " + s.length());
    }
}
