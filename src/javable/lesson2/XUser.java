package javable.lesson2;

/**
 * Created by luchkovsky on 30.08.2015.
 */
public class XUser {
    void f(){
        int n = 6;
        X x1 = new X();
        X x2 = new X();

        x1.x = 5;
        x1.f(n);

        x2.f(2);

        System.out.println("After x from x1: " + x1.x);
        System.out.println("After x from x2: " + x2.x);
    }

    public static void main(String[] args) {
        XUser ref = new XUser();
        ref.f();
    }
}
