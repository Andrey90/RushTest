package shildt.book.exampleScanner;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by luchk on 14.03.2016.
 */
public class AvgFile {
    public static void main(String[] args) throws IOException {
        int count = 0;
        double sum = 0.0;

        //Записать вывод в файл
        FileWriter fileWriter = new FileWriter("test.txt");
        fileWriter.write("2,2 3,4 33 4.9 10,6 done");
        fileWriter.close();

        FileReader fileReader = new FileReader("test.txt");
        try(Scanner scanner = new Scanner(fileReader)) {
            //Читать значения из файла и сумировать
            while (scanner.hasNext()) {
                if (scanner.hasNextDouble()) {
                    sum += scanner.nextDouble();
                    count++;
                } else {
                    String str = scanner.next();
                    if (str.equals("done")) {
                        break;
                    } else {
                        System.out.println("Error");
//                    return;
                    }
                }
            }
        }
        System.out.println("Median: " + sum / count);
    }
}
