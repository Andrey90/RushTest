package shildt.book.exampleOther;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by luchkovsky on 16.06.15.
 */
public class Parse {
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        String string;
//        int i;
//        int sum = 0;
//        System.out.println("Enter value, 0 for exit");
//
//        do {
//            string = bufferedReader.readLine();
//            try {
//                i = Integer.parseInt(string);
//            } catch (NumberFormatException e) {
//                System.out.println("Incorrect format");
//                i = 0;
//            }
//            sum = sum + i;
//            System.out.println("Summ: " + sum);
//        }
//        while (i != 0);


        /////////////////////
        int num = 123456789;
        System.out.println(Integer.toBinaryString(num));
        System.out.println(Integer.toOctalString(num));
        System.out.println(Integer.toHexString(num));
    }
}
