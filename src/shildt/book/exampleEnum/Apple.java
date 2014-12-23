package shildt.book.exampleEnum;

/**
 * Created by luchkovsky on 22.12.14.
 */
enum  Apple {
    Jonathan(10), GoldtnDel(9), RedDel(12), Winessap(15), Cortland(8);

    private int price; //цена каждого яблока

    //Конструктор
    Apple(int p) {
        price = p;
    }
    int getPrice(){
        return price;
    }
}
