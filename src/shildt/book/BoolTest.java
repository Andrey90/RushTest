package shildt.book;

/**
 * Created by SuperStar on 25.11.2014.
 */
class BoolTest {
    public static void main(String args[]){
        boolean b;

        b = false;
        System.out.println(b);
        b = true;
        System.out.println(b);

        if (b)
            System.out.println("good");
        b = false;
        if (b)
            System.out.println("bed");

        System.out.println("10 > 9 ravno " + (10 > 9));

    }
}
