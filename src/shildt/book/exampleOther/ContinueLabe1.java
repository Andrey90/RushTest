package shildt.book.exampleOther;

/**
 * Created by SuperStar on 02.12.2014.
 */
class ContinueLabe1 {
    public static void main(String args[]) {
        metka:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j > i) {
                    System.out.println();
                    continue metka;
                }
                System.out.print(" " + (i * j));
            }
        }
        System.out.println();
    }
}
