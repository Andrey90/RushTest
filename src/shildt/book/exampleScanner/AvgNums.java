package shildt.book.exampleScanner;

import java.io.FileNotFoundException;
import java.nio.channels.Pipe;
import java.util.Scanner;

/**
 * Created by luchk on 13.03.2016.
 */
public class AvgNums {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        double sum = 0.0;

        System.out.println("Enter digits for counting: ");
        //Read and count digits
        while (scanner.hasNext()){
            if (scanner.hasNextDouble()){
                sum += scanner.nextDouble();
                count++;
            }
            else {
                String str = scanner.next();
                if (str.equals("done")){
                    break;
            }
                else {
                    System.out.println("Error");
                    return;
                }
            }
        }
        scanner.close();
        System.out.println("Median equals: " + sum / count);
    }
}
