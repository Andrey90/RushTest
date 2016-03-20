package shildt.book.exampleOther;

/**
 * Created by luchkovsky on 16.06.15.
 */
public class DouBle {
    public static void main(String[] args) {
        Double d1 = new Double(3.8322);
        Double d2 = new Double(6.67);

        System.out.println(d1.byteValue());
        System.out.println(d1.compareTo(d2));
        System.out.println(d1.doubleValue());
        System.out.println(d1.equals(d2));
        System.out.println(d1.floatValue());
        System.out.println(d1.hashCode());
        System.out.println(d1.isInfinite());
        System.out.println(d1.isNaN());
        System.out.println(d1.longValue());
        System.out.println(d1.shortValue());
        System.out.println(d1.toString());


        Double d3 = new Double(1/0.);
        Double d4 = new Double(0/0.);
        System.out.println(d3 + "1" + d3.isInfinite()+ " " + d3.isNaN());
        System.out.println(d4 + "2" + d4.isNaN() + " " + d4.isInfinite());

        }
    }