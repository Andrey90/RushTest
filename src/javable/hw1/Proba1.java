package javable.hw1;

/**
 * Created by luchkovsky on 30.08.2015.
 */
public class Proba1 {

    public static void main(String[] args) {
        Oper op = new Oper();
        op.a = 6;
        op.b = 7;

        System.out.println("Sum = " + op.sum());
        System.out.println("Different = " + op.dif());
        System.exit(0);
    }
}
