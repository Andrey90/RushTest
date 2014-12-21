package shildt.book.exampleExeptions;

/**
 * Created by luchkovsky on 21.12.14.
 */
public class ExceptoinDemo {
    static void compute(int a) throws MyException{
        System.out.println("Вызван compute (" + a + ")");
        if (a > 10)
            throw new MyException(a);
        System.out.println("Нормальное завершение");
    }
    public static void main(String args[]){
        try {
            compute(1);
            compute(20);
        } catch (MyException e) {
            System.out.println("Перехвачено " + e);
        }
    }
}
