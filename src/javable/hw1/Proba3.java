package javable.hw1;

/**
 * Created by luchkovsky on 28.09.2015.
 */
public class Proba3 {
    int a = 10; //simple field
    static int cnt = 0; //static field

    public static void print(Proba3 obj3){
        System.out.println("count = " + cnt);
        System.out.println("a =" + obj3.a);
    }

    public static void main(String[] args) {
        Proba3 obj1 = new Proba3();
        cnt++;
        print(obj1);

        Proba3 obj2 = new Proba3();
        cnt++;
        obj2.a = 0;
        print(obj1);
        print(obj2);
    }
}
