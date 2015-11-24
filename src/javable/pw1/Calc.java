package javable.pw1;

/**
 * Created by luchkovsky on 28.09.2015.
 */
public class Calc {
    public static void main(String[] args) {
        String input = "30";
        Double a = new Double(input);

        Functions functions = new Functions();
        double rez1 = functions.getSin(a);
        double rez2 = functions.getCos(a);

        System.out.println(rez1);
        System.out.println(rez2);
    }
}
