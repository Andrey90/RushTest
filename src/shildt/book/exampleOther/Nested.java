package shildt.book.exampleOther;

/**
 * Created by SuperStar on 02.12.2014.
 */
class Nested {
    public static void main(String args[]) {
        int i, j;

        for (i = 0; i < 10; i++) {
            for (j = i; j < 10; j++)
                System.out.print(".");
            System.out.println();
        }

    }
}