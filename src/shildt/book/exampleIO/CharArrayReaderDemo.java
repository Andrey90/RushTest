package shildt.book.exampleIO;

import java.io.CharArrayReader;
import java.io.IOException;

/**
 * Created by luchk on 22.03.2016.
 */
public class CharArrayReaderDemo {
    public static void main(String[] args) {
        String tmp = "qwertyuiopasdfghjklzxcvbnm";
        int length = tmp.length();
        char c[] = new char[length];

        tmp.getChars(0, length, c, 0);
        int i;

        try (CharArrayReader input1 = new CharArrayReader(c)){
            System.out.println("input1: ");
            while ((i = input1.read()) != -1){
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(" ");
        try (CharArrayReader input2 = new CharArrayReader(c, 0, 5)){
            System.out.println("input2: ");
            while ((i = input2.read()) != -1){
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(" ");
    }
}
