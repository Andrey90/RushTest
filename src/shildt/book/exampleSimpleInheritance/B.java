package shildt.book.exampleSimpleInheritance;

/**
 * Created by SuperStar on 08.12.2014.
 */
class B extends A {
    int k;

    void showk(){
        System.out.println("k: " + k);
    }

    void sum(){
        System.out.println("i + j + k: " + (i + j + k));
    }
}
