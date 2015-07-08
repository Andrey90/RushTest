package shildt.book.exampleExeptions;

/**
 * Created by luchkovsky on 08.07.2015.
 */
public class TestTry {
    public static void main(String[] args) {
        for (int a = 0; a < 5; a++){
            try{
                int k = 5 + 10;
                int b = k/a;
                System.out.println(b);
            }
            catch (ArithmeticException e){
                System.out.println("Not correct");
            }
        }
    }
}
