package shildt.book.exampleOther;

/**
 * Created by SuperStar on 01.12.2014.
 */
class Sample {
    public static void main(String args[]) {
        int num = 3;
        boolean isPrime;

        if (num < 2) isPrime = false;
        else isPrime = true;

        for (int i = 2; i <= num / i; i++) {
            if ((num % i) == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) System.out.println("Prostoe");
        else System.out.println("Ne prostoe");
    }
}
