package shildt.book.exampleExeptions;

/**
 * Created by luchkovsky on 16.12.14.
 */
class Exc2 {
    public static void main(String args[]){
        int d, a;

        try { //Мониторинг блока кода
            d = 0;
            a = 42 / d;
            System.out.print("Это не будет выведено");
        }
        catch (ArithmeticException e){
            System.out.println("Деление на ноль");
        }
        System.out.print("После оператора catch");
    }
}
