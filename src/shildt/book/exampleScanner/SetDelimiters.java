package shildt.book.exampleScanner;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by luchk on 20.03.2016.
 */
public class SetDelimiters {
    public static void main(String[] args) throws IOException {
        int count = 0;
        double sum = 0.0;

        //Писать вывод в файл
        FileWriter fw = new FileWriter("test1.txt");

        //Сохранить значения в списке разделенном запятыми
        fw.write("2, 3.4, 4, 2.4, done");
        fw.close();

        FileReader fr = new FileReader("test1.txt");
        Scanner sc = new Scanner(fr);

        //Установить в качестве разделителей запятые и пробелы
        sc.useDelimiter(", *");

        //Читать и сумировать значения
        while (sc.hasNext()){
            if (sc.hasNextDouble()){
                sum += sc.nextDouble();
                count++;
            }
            else {
                String str = sc.next();
                if (sc.equals("done")){
                    break;
                }
                else {
                    System.out.println("Error in file format");
//                    return;
                }
            }
        }
        System.out.println(sc.delimiter());
        sc.close();
        System.out.println("Median = " + sum);
    }
}
