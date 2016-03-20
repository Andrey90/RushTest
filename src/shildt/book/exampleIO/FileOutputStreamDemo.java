package shildt.book.exampleIO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by luchk on 20.03.2016.
 */
public class FileOutputStreamDemo {
    public static void main(String[] args) {
        String source = "How is the time for all good men\n" +
                "to come to the aid of their country\n" +
                "and pay their due taxes.";
        byte buf[] = source.getBytes();
//        FileOutputStream f0 = null;
//        FileOutputStream f1 = null;
//        FileOutputStream f2 = null;

        try {
            FileOutputStream f0 = new FileOutputStream("file0.txt");
            FileOutputStream f1 = new FileOutputStream("file1.txt");
            FileOutputStream f2 = new FileOutputStream("file2.txt");

            //write in first file
            for (int i = 0; i < buf.length; i += 2){
                f0.write(buf[i]);
            }

            //write to second file
            f1.write(buf);

            //write to third file
            f2.write(buf, buf.length-buf.length/4, buf.length/4);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
//        finally {
//            try {
//                if (f0 != null) f0.close();
//            } catch (IOException e) {
//                System.out.println("Error closing file0 " + e.toString());
//            }
//            try {
//                if (f1 != null) f1.close();
//            } catch (IOException e) {
//                System.out.println("Error closing file1 " + e.toString());
//            }
//            try {
//                if (f2 != null) f2.close();
//            } catch (IOException e) {
//                System.out.println("Error closing file2 " + e.toString());
//            }
//        }
    }
}
