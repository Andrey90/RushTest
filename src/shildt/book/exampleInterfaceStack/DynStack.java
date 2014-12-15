package shildt.book.exampleInterfaceStack;

/**
 * Created by luchkovsky on 15.12.14.
 */
class DynStack implements IntStack {
    private int stck[];
    private int tos;

    //резервирование и инициализация стека
    DynStack(int size) {
        stck = new int[size];
        tos = -1;
    }

    //Затаокивание елемента в стек
    public void push(int item) {
        //если стек полон, резервирование стека большего размера
        if (tos == stck.length - 1) {
            int temp[] = new int[stck.length * 2]; //удвоение размера стека
            for (int i = 0; i < stck.length; i++) {
                temp[i] = stck[i];
            }
            stck = temp;
            stck[++tos] = item;
        } else
            stck[++tos] = item;
    }

    //выталкивание элемента из стека
    public int pop() {
        if (tos < 0) {
            System.out.println("Стек пуст");
            return 0;
        } else {
            return stck[tos--];
        }
    }
}
