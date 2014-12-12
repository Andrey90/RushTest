package shildt.book.exampleNewStack;

/**
 * Created by SuperStar on 07.12.2014.
 */
class TestStack2 {
    public static void main(String args[]){
        Stack mystack1 = new Stack(5);
        Stack mystack2 = new Stack(8);

        //проталкивание чисел в стек
        for (int i = 0; i < 5; i++)
            mystack1.push(i);
        for (int i = 0; i < 8; i++)
            mystack2.push(i);

        //выталкивание етих чисел из стека
        System.out.println("Стек в mystack1: ");
        for (int i = 0; i < 5; i++)
            System.out.println(mystack1.pop());
        System.out.println("Стек в mystack2: ");
        for (int i = 0; i < 8; i++)
            System.out.println(mystack2.pop());
    }
}
