package shildt.book.exampleIO;

import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by luchk on 22.03.2016.
 */
public class CharArrayWriterDemo {
    public static void main(String[] args) {
        CharArrayWriter f = new CharArrayWriter();
        String s = "This should end up in the array";
        char buf[] = new char[s.length()];

        s.getChars(0, s.length(), buf, 0);

        try {
            f.write(buf);
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        System.out.println("Buffer in string");
        System.out.println(f.toString());
        System.out.println("In array");

        char c[] = f.toCharArray();
        for (int i = 0; i < c.length; i++){
            System.out.print(c[i]);
        }

        System.out.println("\nIn FileWriter");
        try (FileWriter f2 = new FileWriter("test9.txt")){
            f.writeTo(f2);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Make reset()");
        f.reset();

        for (int i = 0; i < 3; i++){
            System.out.println(f.toString());
        }
    }
}
