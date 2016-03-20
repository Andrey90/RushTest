package shildt.book.exampleServiceClass;

import java.util.StringTokenizer;

/**
 * Created by luchkovsky on 28.02.2016.
 */
public class STDemo {
    static String in = "title=Java: The Complete Reference;" +
                       "author=Schildt;" +
                       "publisher=McGraw-Hill;" +
                       "copyright=2011";

    public static void main(String[] args) {
        System.out.println(in);
        System.out.println();
        StringTokenizer st = new StringTokenizer(in, "=;");
        while (st.hasMoreTokens()){
            String key = st.nextToken();
            String val = st.nextToken();
            System.out.println(key + "\t" + val);
        }
    }
}
