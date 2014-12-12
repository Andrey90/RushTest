package shildt.book.exampleCallByValue;

/**
 * Created by SuperStar on 06.12.2014.
 */
class CallByValue {
    public static void main(String args[]){
        Test ob = new Test(15, 20);

        System.out.println("а и b перед вызовом метода: " + ob.a + " " + ob.b);

        ob.meth(ob);
        System.out.println("а и b после вызова метода: " + ob.a + " " + ob.b);
    }
}
