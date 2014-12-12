package shildt.book;

/**
 * Created by SuperStar on 02.12.2014.
 */
class Search {
    public static void main(String args[]){
        int nums[] = {1,4,5,7,8,9,3};
        int val = 5;
        boolean found = false;

        for (int x: nums){
            if (x == val){
                found = true;
                break;
            }

        }
        if (found) System.out.println("Ok");
        else System.out.println("Not Found");


    }
}
