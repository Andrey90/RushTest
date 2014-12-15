package shildt.book.exampleBox2;

/**
 * Created by SuperStar on 03.12.2014.
 */
class BoxDemo {
    public static void main(String args[]) {
        //обьявление, резервирование и инициализация обьектов Box
        Box mybox1 = new Box(10, 24, 54);
        Box mybox2 = new Box();
        Box mybox3 = new Box(7);

        BoxWeight mybox4 = new BoxWeight(10, 20, 15, 34.4);
        BoxWeight mybox5 = new BoxWeight(2, 3, 5, 0.00342);

        ColorBox mybox6 = new ColorBox(12, 32, 43, "red");

        double vol;

        // Получение обьема первого паралелепипеда
        vol = mybox1.volume();
        System.out.println("обьема первого паралелепипеда: " + vol);

        // Получение обьема второго паралелепипеда
        vol = mybox2.volume();
        System.out.println("обьема второго паралелепипеда: " + vol);

        // Получение обьема куба
        vol = mybox3.volume();

        System.out.println("обьема куба: " + vol);

        //Вес куба
        System.out.println("Вес первого куба: " + mybox4.weight);
        System.out.println("Вес второго куба: " + mybox5.weight);

        //Цвет куба
        System.out.println("Цвет: " + mybox6.color);
    }
}
