package shildt.book.exampleOverload;

/**
 * Created by SuperStar on 03.12.2014.
 */
class OverLoad {
    public static void main(String args[]) {
        OverLoadDemo ob = new OverLoadDemo();
        int i = 88;

        //Вызов всех версий метода e8_3
        ob.test();
        ob.test(i); //етот оператор вызовет e8_3(double)
        ob.test(10, 20); //етот оператор вызовет e8_3(double)
        //result = ob.e8_3(123.25);
        //System.out.println("Результат ob.e8_3(123.25): " + result);
    }
}
