package shildt.book.exampleExeptions;

/**
 * Created by luchkovsky on 21.12.14.
 */
class MultiCatch {
    public static void main(String args[]){
        int a = 10, b = 0;
        int vals[] = {1, 3, 5, 6};

        try {
            //int c = a / b;
            vals[10] = 19;
        }
        catch (ArithmeticException | ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Обработаеться исключение " + e);
        }
        System.out.println("После мультиобработчика");
    }
}
