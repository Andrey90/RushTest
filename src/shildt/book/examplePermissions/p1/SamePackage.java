package shildt.book.examplePermissions.p1;

/**
 * Created by luchkovsky on 14.12.14.
 */
class SamePackage {
    SamePackage() {
        Protection p = new Protection();
        System.out.println("Конструктор етого же пакета");
        System.out.println("n = " + p.n);

        //class only
        //System.out.println("n_pri = " + p.n_pri);

        System.out.println("n_pro = " + p.n_pro);
        System.out.println("n_pub = " + p.n_pub);
    }
}
