package shildt.book.exampleInterfaceStack;

/**
 * Created by luchkovsky on 15.12.14.
 */
class IfTest3 {
    public static void main(String args[]) {
        IntStack mystack; //создание ссылочной пременной интерфейса
        DynStack ds = new DynStack(5);
        FixedStack fs = new FixedStack(8);

        mystack = ds; //загрузка динамического стека
        //заталкивание чисел в стек

        for (int i = 0; i < 12; i++) mystack.push(i);

        mystack = fs; //загрузка фиксированного стека
        for (int i = 0; i < 8; i++) mystack.push(i);

        mystack = ds;
        System.out.println("Значение в динамическом стеке: ");
        for (int i = 0; i < 12; i++)
            System.out.println(mystack.pop());

        mystack = fs;
        System.out.println("Значение в фиксированном стеке: ");
        for (int i = 0; i < 8; i++)
            System.out.println(mystack.pop());
    }
}
