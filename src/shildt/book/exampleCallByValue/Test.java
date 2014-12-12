package shildt.book.exampleCallByValue;

/**
 * Created by SuperStar on 06.12.2014.
 */
class Test {
    int a, b;
    Test(int i, int j){
        a = i;
        b = j;
    }
    void meth(Test o){
        o.a *= 2;
        o.b /= 2;
    }
}
