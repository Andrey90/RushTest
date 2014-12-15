package shildt.book.exampleStack;

/**
 * Created by SuperStar on 03.12.2014.
 */
class TestStack {
    public static void main(String args[]) {
        Stack mystack1 = new Stack();
        Stack mystack2 = new Stack();

        //заталкивает числа в стек
        for (int i = 0; i < 10; i++) {
            mystack1.push(i);
        }
        for (int i = 0; i < 20; i++) {
            mystack2.push(i);
        }
        //выталкивает числа из стека
        System.out.println("Стек в mystack1: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(mystack1.pop());
        }
        System.out.println("Стек в mystack2: ");
        for (int i = 0; i < 20; i++) {
            System.out.println(mystack2.pop());
        }
    }
}
