package shildt.book.examplePermissions.p2;

/**
 * Created by luchkovsky on 14.12.14.
 */
class OtherPackage {
    OtherPackage() {
        shildt.book.examplePermissions.p1.Protection p = new shildt.book.examplePermissions.p1.Protection();
        System.out.println("конструктор другого пакета");

        //доступно только для данного класса или пакета
        //System.out.println("n = " + p.n);

        //доступно только для класса
        //System.out.println("n_pri = " + p.n_pri);

        //доступно только для данного класса, подкласса или пакета
        //System.out.println("n_pro = " + p.n_pro);

        System.out.println("n_pub = " + p.n_pub);
    }
}
