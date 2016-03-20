package shildt.book.exampleIO;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Created by luchk on 20.03.2016.
 */
public class OnlyExt implements FilenameFilter {
    String ext;
    OnlyExt(String ext) {
        this.ext = "." + ext;
    }
    public boolean accept(File dir, String name){
        return name.endsWith(ext);
    }
}
