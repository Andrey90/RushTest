package shildt.book;

/**
 * Created by SuperStar on 07.12.2014.
 */
class PassArray {
    static void vaTest(String msg, int... v) {
        System.out.print(msg + v.length + " Содержимое: ");

        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String args[]) {

        vaTest("One parametr vararg: ", 10);
        vaTest("Three parametr vararg: ", 10, 1, 54);
        vaTest("Null parametr vararg: ");
    }
}
