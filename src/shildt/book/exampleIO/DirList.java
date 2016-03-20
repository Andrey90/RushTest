package shildt.book.exampleIO;

import java.io.File;

/**
 * Created by luchk on 20.03.2016.
 */
public class DirList {
    public static void main(String[] args) {
        String dirname = "E:\\hom";
        File f1 = new File(dirname);
        if (f1.isDirectory()){
            System.out.println("Catalog " + dirname);
            String s[] = f1.list();

            for (int i = 0; i < s.length; i++){
                File f = new File(dirname + "/" + s[i]);
                if (f.isDirectory()){
                    System.out.println(s[i] + " is catalog");
                }
                else {
                    System.out.println(s[i] + " is file");
                }
            }
        }
        else {
            System.out.println(dirname + " is not a directory");
        }
    }
}
