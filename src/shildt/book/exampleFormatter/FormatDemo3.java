package shildt.book.exampleFormatter;

import java.util.Formatter;

/**
 * Created by luchk on 12.03.2016.
 */
public class FormatDemo3 {
    public static void main(String[] args) {
        Formatter formatter = new Formatter();
        formatter.format("Копирование файла%nПеремещение на %d%% завершено", 88);
        System.out.println(formatter);
        formatter.close();
    }
}
