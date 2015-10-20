package shildt.book.exampleToString;

import shildt.book.exampleWorkString.StringBuf;

/**
 * Created by luchkovsky on 21.05.15.
 */
public class ToStringDemo {
    public static void main(String[] args) {
        Box b = new Box(10, 12, 14);
        String s = "Box b: " + b; //конкатенация обьекта Box
        System.out.println(b);
        System.out.println(s);

        char ch;
        ch = "abc".charAt(0);
        System.out.println(ch);

        String str = "Demo of this method! Oops!!!";
        int start = 4;
        int end = 7;
        char buf[] = new char[end - start];
        str.getChars(start, end, buf, 0);
        System.out.println(buf);

        char ch1[];
        ch1 = "qwerty".toCharArray();
        System.out.println(ch1);

        String s1 = "hello";
        String s2 = "Hello";
        String s3 = "HELLO";
        String s4 = "buy!";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println(s1.equals(s4));
        System.out.println(s1.equalsIgnoreCase(s4));

        System.out.println(s1.regionMatches(1, s2, 1, 2));
        System.out.println(s1.regionMatches(0, s4, 0, 3));

        System.out.println("Hello".startsWith("he"));
        System.out.println("Hello".endsWith("lo"));

        System.out.println(s1.compareTo(s1));
        System.out.println(s1.compareToIgnoreCase(s4));

        System.out.println(s1.indexOf("e", 1));
        System.out.println(s1.indexOf("o"));
        System.out.println(s1.lastIndexOf("l", 2));
        System.out.println(s1.lastIndexOf("l"));
        System.out.println(s1.indexOf("l"));

        //Замена подстроки, substring
        String org = "This is a test. This is, too.";
        String search = "is";
        String sub = "was";
        String result = " ";
        int i;
        do { //замена всех совпадающих подстрок
            System.out.println(org);
            i = org.indexOf(search);
            if (i != -1){
                result = org.substring(0, i);
                result = result + sub;
                result = result + org.substring(i + search.length());
                org = result;
            }
        }
        while (i != -1);

        //contact
        System.out.println(s1.concat(s2));
        System.out.println(s1.concat(s1));

        //replace
        String sN = s1.replace("h", "X");
        System.out.println(sN.replace("l", "r"));

        //trim
        System.out.println(" A method TRIM ! ! !");
        System.out.println(" A method TRIM ! ! !".trim());

        //valueOf
        Integer in = Integer.valueOf(100);
        System.out.println(in);

        //toUpper, toLower
        System.out.println(s1.toUpperCase());
        System.out.println(s4.toLowerCase());

        //StringBuffer
        StringBuffer sb = new StringBuffer("Hello!!!");
        System.out.println(sb + " " + sb.length() + " " + sb.capacity());
        System.out.println(sb.charAt(2));
        sb.setCharAt(1, 'Y');
        System.out.println(sb);
        sb.ensureCapacity(33);
        System.out.println(sb.length() + " " + sb.capacity());

        //append
        String st;
        int a = 42;
        StringBuffer sb3 = new StringBuffer(40);
        st = sb3.append("a = ").append(a).append("!").toString();
        System.out.println(st);
    }
}
