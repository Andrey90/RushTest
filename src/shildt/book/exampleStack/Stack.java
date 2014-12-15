package shildt.book.exampleStack;

/**
 * Created by SuperStar on 03.12.2014.
 */
class Stack {
    int stck[] = new int[10];
    int tos;

    //Инициализация верхушки стека
    Stack() {
        tos = -1;
    }

    //Заталкивание елемента в стек
    void push(int item) {
        if (tos == 9) {
            System.out.println("Стек полон");
        } else
            stck[++tos] = item;
    }

    //Выталкивание елемента из стека
    int pop() {
        if (tos < 0) {
            System.out.println("Стек пустой");
            return 0;
        } else
            return stck[tos--];
    }
}
