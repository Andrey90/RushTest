package shildt.book.exampleInterface2;

/**
 * Created by luchkovsky on 15.12.14.
 */
class NestedIfDemo {
    public static void main(String args[]) {
        A.NestedIf nif = new B();
        if (nif.isNotNegative(10))
            System.out.print("10 не является отрицательным");
        if (nif.isNotNegative(-12))
            System.out.print("Это не будет отображаться");
    }
}
