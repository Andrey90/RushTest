package shildt.book.exampleInner;

/**
 * Created by SuperStar on 07.12.2014.
 */
class Outer {
    int outer_x = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    //внутренний класс
    class Inner {
        void display() {
            System.out.println(outer_x);
        }
    }
}
