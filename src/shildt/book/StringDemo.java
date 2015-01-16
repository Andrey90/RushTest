package shildt.book;

/**
 * Created by SuperStar on 07.12.2014.
 */
class StringDemo {
    public static void main(String args[]) {
        String str1 = "task1 string";
        String str2 = "second string";
        String str3 = str1;

        System.out.println(str1.length());
        System.out.println(str2.charAt(7));

        if (str1.equals(str2))
            System.out.println("str1 == str2");
        else System.out.println("str1 != str2");

        if (str1.equals(str3))
            System.out.println("str1 == str3");
        else System.out.println("str1 != str3");

    }
}
