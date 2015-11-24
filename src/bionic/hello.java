package bionic;

import java.util.Scanner;

/**
 * Created by luchkovsky on 13.03.15.
 */
public class hello {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your name? ");
        String b = scanner.next();

        System.out.println("Hello " + b);
    }
}

