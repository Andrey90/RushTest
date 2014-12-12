package shildt.book.exampleDynamicDis;

/**
 * Created by SuperStar on 11.12.2014.
 */
class Dispatch {
    public static void main(String args[]){
        A a = new A();
        B b = new B();
        C c = new C();

        A r; //получение ссылки класса А

        r = a; //r ссылается на А
        r.callme(); //вызов версии метода, определенный в А

        r = b;
        r.callme(); //вызов версии метода, определенный в B

        r = c;
        r.callme(); //вызов версии метода, определенный в C
    }
}
