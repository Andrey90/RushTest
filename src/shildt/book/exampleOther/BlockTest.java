package shildt.book.exampleOther;

/**
 * Created by SuperStar on 25.11.2014.
 */
class BlockTest {
    public static void main(String args[]) {
        int x, y;
        y = 20;

        for (x = 0; x < 10; x++) {
            System.out.println("znachenie x: " + x);
            System.out.println("znachenie y: " + y);
            y = y - 2;
        }
    }
}
