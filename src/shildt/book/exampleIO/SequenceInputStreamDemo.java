package shildt.book.exampleIO;


import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Vector;

/**
 * Created by luchk on 21.03.2016.
 */
public class SequenceInputStreamDemo {
    public static void main(String[] args) {
        int c;
        Vector<String> files = new Vector<>();

        files.addElement("file1.txt");
        files.addElement("file2.txt");
        files.addElement("file3.txt");

        InputStreamEnumerator ise = new InputStreamEnumerator(files);
//        InputStream input = new SequenceInputStream(ise);

        try (InputStream input = new SequenceInputStream(ise)){
            while ((c = input.read()) != -1){
                System.out.print((char)c);
            }
        }
        catch (NullPointerException e){
            System.out.print("Error opening file");
        }
        catch (IOException e){
            System.out.print("IO Error");
        }
        finally {
//            try {
//                input.close();
//            }
//            catch (IOException e){
//                System.out.print("Error closing stream");
//            }
        }
    }
}
