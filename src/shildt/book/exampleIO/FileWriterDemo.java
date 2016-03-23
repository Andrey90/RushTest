package shildt.book.exampleIO;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by luchk on 21.03.2016.
 */
public class FileWriterDemo {
    public static void main(String[] args) {
        String source = "How is the time for all good men\n" +
                "to come to the aid of their country\n" +
                "and pay their due taxes.";
        char buffer[] = new char[source.length()];
        source.getChars(0, source.length(), buffer, 0);

        try (FileWriter f0 = new FileWriter("file1.txt");
             FileWriter f1 = new FileWriter("file2.txt");
             FileWriter f2 = new FileWriter("file3.txt")){

            //write file0
            for (int i = 0; i < buffer.length; i += 2){
                f0.write(buffer[i]);
            }
            //write file1
            f1.write(buffer);

            //write file2
            f2.write(buffer, buffer.length-buffer.length/4, buffer.length/4);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
