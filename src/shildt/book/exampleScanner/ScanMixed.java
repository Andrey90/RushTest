package shildt.book.exampleScanner;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by luchk on 14.03.2016.
 */
public class ScanMixed {
    public static void main(String[] args) throws IOException {
        int i;
        double d;
        boolean b;
        String str;

        //Писать вывод в файл
        FileWriter fw = new FileWriter("test.txt");
        fw.write("Тестирование Scanner 10 22.2 один true два false");
        fw.close();

        //Читать из файла
        FileReader fr = new FileReader("test.txt");

        Scanner sc = new Scanner(fr);

        //Читать до конца
        while (sc.hasNext()){
            if (sc.hasNextInt()){
                i = sc.nextInt();
                System.out.println("int: " + i);
            }
            else if (sc.hasNextDouble()){
                d = sc.nextDouble();
                System.out.println("double: " + d);
            }
            else if (sc.hasNextBoolean()){
                b = sc.nextBoolean();
                System.out.println("Boolean: " + b);
            }
            else {
                str = sc.next();
                System.out.println("String: " + str);
            }
        }
        sc.close();
    }
}
