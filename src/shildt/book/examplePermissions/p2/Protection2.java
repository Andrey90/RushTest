package shildt.book.examplePermissions.p2;

import shildt.book.examplePermissions.p1.Protection;

/**
 * Created by luchkovsky on 14.12.14.
 */
class Protection2 extends Protection {
    Protection2() {
        System.out.println("Унаследованный конструктор другого пакета");

        //доступно только для данного класса или пакета
        //System.out.println("n = " + n);

        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
