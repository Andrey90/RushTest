package shildt.book.exampleInterface2;

/**
 * Created by luchkovsky on 15.12.14.
 */

//Етот клас реализует вложенный интерфейс
class B implements A.NestedIf {
    public boolean isNotNegative(int x) {
        return x < 0 ? false : true;
    }
}
