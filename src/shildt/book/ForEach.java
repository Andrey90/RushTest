package shildt.book;

/**
 * Created by SuperStar on 02.12.2014.
 */
class ForEach {
    public static void main(String args[]) {
        int num[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for (int x : num) {
            sum = sum + x;
            if (x == 2) {
                break;
            }
        }
        System.out.println(sum);
    }

}
