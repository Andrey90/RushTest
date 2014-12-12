package shildt.book;

/**
 * Created by SuperStar on 25.11.2014.
 */
class LifeTime {
    public static void main(String args[]){
        int x;


        for (x = 0; x < 3; x++){
            int y = -1;
            System.out.println(y);

            y = 100;
            System.out.println(y);
        }
    }
}
