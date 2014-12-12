package shildt.book;

/**
 * Created by SuperStar on 25.11.2014.
 */
class IfSample {
    public static void main(String args[]) {
        int x, y;

        x = 10;
        y = 20;

        if (x < y) System.out.println("x menshe y");

        x = x * 2;
        if (x == y) System.out.println("x ravno y");

        x = x * 2;
        if (x > y) System.out.println("x bolshe y");

        if (x == y) System.out.println("Ne vyvedetsa");
    }


}
