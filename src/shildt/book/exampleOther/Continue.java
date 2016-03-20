package shildt.book.exampleOther;

/**
 * Created by SuperStar on 02.12.2014.
 */
class Continue {
    public static void main(String args[]) {
        for (int i = 0; i < 100; i++) {
            System.out.print(i + " ");
            if (i % 2 == 0) continue;
            System.out.println(" ");
        }
    }
}
