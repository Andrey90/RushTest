package shildt.book.exampleOther;

/**
 * Created by SuperStar on 30.11.2014.
 */
class BitLogic {
    public static void main(String args[]) {
        String binary[] = {
                "0000", "0001", "0010", "0100", "0101", "0110", "0111",
                "1000", "1001", "1010", "1011", "1100", "1110", "1111"
        };
        int a = 3;
        int b = 6;
        int c = a | b;
        int d = a & b;
        int e = a ^ b;
        int f = (~a & b) | (a & ~b);
        int g = ~a & 0x0f;

        System.out.println("a = " + binary[a]);
        System.out.println("b = " + binary[b]);
        System.out.println("a | b = " + binary[c]);
        System.out.println("a & b = " + binary[d]);
        System.out.println("a ^ b = " + binary[e]);
        System.out.println("~ a & b | a & ~b = " + binary[f]);
        System.out.println("~a" + binary[g]);
    }
}