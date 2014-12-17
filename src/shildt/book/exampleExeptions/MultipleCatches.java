package shildt.book.exampleExeptions;

/**
 * Created by luchkovsky on 16.12.14.
 */
class MultipleCatches {
    public static void main(String args[]) {
        try {
            int a = 2;
            //Если не указаны параметры командной строки, следующий оператор создаст исключение деления на ноль.
            int b = 42 / a;

            System.out.println("a = " + a);

            try {
                //Если используется один аргумент командной строки, то исключение деления на ноль будет создано следующим кодом
                if (a == 1)
                    a = a / (a - a); //деление на ноль
                //Если используется два аргумента командной строки, то создается исключение выхода за пределы массива.

                if (a == 2) {
                    int c[] = {1};
                    c[42] = 99; //создается исключение выхода за пределы массива
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Индекс за пределами массива: " + e);
            }
        } catch (ArithmeticException e){
            System.out.println("Деление на ноль: " + e);
        }
    }
}
