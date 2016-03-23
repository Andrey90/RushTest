package shildt.book.exampleIO;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/**
 * Created by luchk on 21.03.2016.
 */
public class ByteArrayInputStreamDemo {
    public static void main(String[] args) throws IOException {
        String tmp = "qwertyuiopasdfghjklzxcvbnm";
        byte b[] = tmp.getBytes();

        ByteArrayInputStream inputStream1 = new ByteArrayInputStream(b);
        ByteArrayInputStream inputStream2 = new ByteArrayInputStream(b, 0, 3);
    }
}
