package shildt.book.examplePack;

/**
 * Created by SuperStar on 11.12.2014.
 */
class Balance {
    String name;
    double bal;

    Balance(String n, double b) {
        name = n;
        bal = b;
    }

    void show() {
        if (bal < 0) {
            System.out.print("-->");
            System.out.println(name + " : $ " + bal);
        }
    }
}
