package shildt.book.exampleBox;

/**
 * Created by SuperStar on 02.12.2014.
 */
class BoxDemo {
    public static void main(String args[]) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        //присваивание значений переменнім екземпляра mybox1
        /*mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;*/
        mybox1.setDim(10, 20, 15);

        //присваивание значений переменным екземпляра mybox2
        /*mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;*/
        mybox2.setDim(3, 6, 9);

        //отображение обьема первого паралелепипеда
        //vol = mybox1.volume();
        System.out.println("Обьем равен: " + mybox1.volume());

        //отображение обьема второго паралелепипеда
        //vol = mybox2.volume();
        System.out.print("Обьем равен: " + mybox2.volume());
    }
}
