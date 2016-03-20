package shildt.book.exampleOther;

/**
 * Created by SuperStar on 01.12.2014.
 */
class NoBody {
    public static void main(String args[]) {
        int i, j;
        i = 100;
        j = 200;

        while (++i < --j) ;
        System.out.println(i);

    }
}

