package shildt.book.exampleOverload;

/**
 * Created by SuperStar on 03.12.2014.
 */
class OverLoad {
    public static void main(String args[]){
        OverLoadDemo ob = new OverLoadDemo();
        int i = 88;

        //Вызов всех версий метода test
        ob.test();
        ob.test(i); //етот оператор вызовет test(double)
        ob.test(10, 20); //етот оператор вызовет test(double)
        //result = ob.test(123.25);
        //System.out.println("Результат ob.test(123.25): " + result);
    }
}
