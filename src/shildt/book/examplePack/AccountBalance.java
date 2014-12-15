package shildt.book.examplePack;

/**
 * Created by SuperStar on 11.12.2014.
 */
class AccountBalance {
    public static void main(String args[]) {
        Balance current[] = new Balance[3];

        current[0] = new Balance("Ivanov", -123.32);
        current[1] = new Balance("Petrov", 314.43);
        current[2] = new Balance("Sidorov", 654.2);

        for (int i = 0; i < 3; i++) {
            current[i].show();
        }
    }
}
