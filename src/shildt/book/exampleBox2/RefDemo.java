package shildt.book.exampleBox2;

/**
 * Created by SuperStar on 08.12.2014.
 */
class RefDemo {
    public static void main(String args[]) {
        BoxWeight weightbox = new BoxWeight(3, 4, 6, 4.54);
        Box plainbox = new Box();
        double vol;

        vol = weightbox.volume();
        System.out.println("Обьем weightbox равен " + weightbox.weight);
        System.out.println();

        //присваивание ссылке на обьект BoxWeight ссылки Box
        plainbox.volume();
        System.out.println("Обьем plainbox равен " + vol);

    }
}
