package shildt.book.exampleNewStack;

/**
 * Created by SuperStar on 07.12.2014.
 */
class Stack {
    private int stock[];
    private int tos;

    //резервирование и инициализация стека
    Stack(int size){
        stock = new int[size];
    tos = -1;
    }

    //Проталкивание елемента в стек
    void push(int item){
        if (tos == stock.length - 1)
            System.out.println("Стек полон");
        else
            stock[++tos] = item;
    }
    //Выталкивание елемента из стека
    int pop(){
        if (tos < 0) {
            System.out.println("Стек не загружен");
            return 0;
        }
        else
            return stock[tos--];
    }

}
