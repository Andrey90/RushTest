package shildt.book.exampleScanner;

import java.util.Scanner;

/**
 * Created by luchk on 20.03.2016.
 */
public class FindInLineDemo {
    public static void main(String[] args) {
        String instr = "Name: Tom Age: 28 ID: 77";
        Scanner sc = new Scanner(instr);

        //Найти и оторазить возраст
        sc.findInLine("Age:");
        if (sc.hasNext()){
            System.out.println(sc.next());
        }
        else {
            System.out.println("Error!");
        }
        sc.close();
    }
}
