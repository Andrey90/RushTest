package shildt.book.exampleIO;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by luchk on 21.03.2016.
 */
public class ByteArrayOutputStreamDemo {
    public static void main(String[] args) {
        ByteArrayOutputStream f = new ByteArrayOutputStream();
        String s = "This should end up in the array";
        byte buf[] = s.getBytes();

        try {
            f.write(buf);
        }
        catch (IOException e){
            System.out.println("Error writing to buffer");
            return;
        }

        System.out.println("Buffer as a string");
        System.out.println(f.toString());
        System.out.println("Into array");
        byte b[] = f.toByteArray();
        for (int i = 0; i < b.length; i++){
            System.out.print((char) b[i]);
        }
        System.out.println("\nTo an OutputStream()");

        try (FileOutputStream f1 = new FileOutputStream("testBAOSD.txt")){
            f.writeTo(f1);
        }
        catch (IOException e){
            System.out.println("IO Error: " + e);
            return;
        }

        System.out.println("Doing a reset");
        f.reset();

        for (int i = 0; i < 3; i++){
            f.write('X');
        }
        System.out.println(f.toString());
    }
}
