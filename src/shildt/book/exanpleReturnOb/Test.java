package shildt.book.exanpleReturnOb;

/**
 * Created by SuperStar on 06.12.2014.
 */
class Test {
    int a;

    Test(int i) {
        a = i;
    }

    Test incrByTen() {
        Test temp = new Test(a + 10);
        return temp;
    }
}
