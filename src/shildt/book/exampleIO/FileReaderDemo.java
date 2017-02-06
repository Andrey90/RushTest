package shildt.book.exampleIO;

import java.io.FileReader;
import java.io.IOException;

/**
 * Created by luchk on 21.03.2016.
 */
public class FileReaderDemo {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("C:\\Users\\luchk\\pr\\RushTest\\src\\shildt\\book\\exampleIO\\FileReaderDemo.java")){
            int c;
            //Read and show data from file
            while ((c = fr.read()) != -1){
                System.out.print((char)c);
            }
        }
        catch (IOException e){
            System.out.println("Error");
        }
    }
}
