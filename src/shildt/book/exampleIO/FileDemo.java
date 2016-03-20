package shildt.book.exampleIO;

import java.io.File;

/**
 * Created by luchk on 20.03.2016.
 */
public class FileDemo {
    static void p(String s){
        System.out.println(s);
    }

    public static void main(String[] args) {
        File f1 = new File("/java/COPYRIGHT");
        p("File name: " + f1.getName());
        p("Path: " + f1.getPath());
        p("Absolute path: " + f1.getAbsolutePath());
        p("Parent catalog: " + f1.getParent());
        p(f1.exists() ? "present" : "not present");
        p(f1.canWrite()? "can be write" : "can not be write");
        p(f1.canRead() ? "can be read" : "can not be read");
        p(f1.isDirectory() ? "is directory" : "is not directory");
        p(f1.isFile() ? "is file" : "is not file");
        p(f1.isAbsolute() ? "can be named catalog" : "can not be named catalog");
        p("Data edit: " + f1.lastModified());
        p("Size: " + f1.length() + " bite");
    }
}
