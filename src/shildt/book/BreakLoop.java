package shildt.book;

/**
 * Created by SuperStar on 02.12.2014.
 */
class BreakLoop {
    public static void main(String args[]) {
        metka:
        for (int i = 0; i < 3; i++) {
            //if (i == 2)break;
            System.out.print("Prohod " + i + ": ");
            for (int j = 0; j < 100; j++) {
                if (j == 10) break metka;
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("Cikly zaversheny.");
    }
}
