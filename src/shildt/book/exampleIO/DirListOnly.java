package shildt.book.exampleIO;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Created by luchk on 20.03.2016.
 */
public class DirListOnly {
    public static void main(String[] args) {
        String dirname = "E:\\hom";
        File f1 = new File(dirname);
        FilenameFilter only = new OnlyExt("pdf");
        String s[] = f1.list(only);

        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }

        File f2 = new File("E:\\Test");
        f2.mkdir();
        f2.delete();
    }
}
