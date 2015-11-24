package bionic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by luchkovsky on 13.03.15.
 */
public class input {
    public static void main(String args[]) throws IOException {
        Scanner a = new Scanner(System.in);
        String str = a.next();
        System.out.println(str);

        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        String str1 = b.readLine();
        System.out.println(str1);
    }
}
