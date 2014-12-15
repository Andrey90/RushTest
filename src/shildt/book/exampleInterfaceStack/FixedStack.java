package shildt.book.exampleInterfaceStack;

import shildt.book.exampleInterfaceStack.IntStack;

/**
 * Created by luchkovsky on 15.12.14.
 */
// реализация IntStack, использующая область хранения фиксированного размера
class FixedStack implements IntStack {
    private int stck[];
    private int tos;

    //резервирование и инициализация стека
    FixedStack(int size) {
        stck = new int[size];
        tos = 1;
    }

    //заталкивание елемента в стек
    public void push(int item) {
        if (tos == stck.length - 1) {
            System.out.println("Стек полон");
        } else
            stck[++tos] = item;
    }

    //вытадкивание элемента из стека
    public int pop() {
        if (tos < 0) {
            System.out.println("Стек пуст");
            return 0;
        } else
            return stck[tos--];
    }
}
