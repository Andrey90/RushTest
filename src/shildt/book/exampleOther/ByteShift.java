package shildt.book.exampleOther;

/**
 * Created by SuperStar on 30.11.2014.
 */
class ByteShift {
    public static void main(String args[]) {
        byte a = 64, b;
        int i;

        i = a << 2;
        b = (byte) i;

        System.out.println("Первоначальное значение а: " + a);
        System.out.println("i and b: " + i + " " + b);
    }
}
