package shildt.book.exampleInterfaceStack;

/**
 * Created by luchkovsky on 15.12.14.
 */
class IfTest2 {
    public static void main(String args[]) {
        DynStack ob1 = new DynStack(5);
        DynStack ob2 = new DynStack(8);

        //Эти циклы увеличивают размеры каждого из стеков
        for (int i = 0; i < 12; i++) {
            ob1.push(i);
        }
        for (int i = 0; i < 20; i++) {
            ob2.push(i);
        }

        System.out.println("Стек в ob1: ");
        for (int i = 0; i < 5; i++)
            System.out.println(ob1.pop());

        System.out.println("Стек в ob2: ");
        for (int i = 0; i < 8; i++)
            System.out.println(ob2.pop());
    }
}
