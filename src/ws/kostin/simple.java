package ws.kostin;

import java.util.Arrays;

/**
 * Created by luchkovsky on 13.01.15.
 */
public class simple {
    public static void main(String[] args) {
        System.out.println("Hello world");
        String arr[] = {"ba", "ac", "az"};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
