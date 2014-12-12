package shildt.book.exampleForInClass;

/**
 * Created by SuperStar on 07.12.2014.
 */
class Outer {
    int outer_x = 100;

    void test(){
        for (int i  = 0; i < 10; i++){
            class Inner{
                void display(){
                    System.out.println(outer_x);
                }
            }
            Inner inner = new Inner();
            inner.display();
        }
    }
}
