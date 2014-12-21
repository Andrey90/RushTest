package shildt.book.exampleExeptions;

/**
 * Created by luchkovsky on 21.12.14.
 */
class ChainExDemo {
    static void demoproc(){
        //создать исключение
        NullPointerException e = new NullPointerException("Верхний уровень");

        //добавить причину
        e.initCause(new ArithmeticException("Причина"));

        throw e;
    }

    public static void main(String args[]){
        try {
            demoproc();
        } catch (NullPointerException e){
            //отобразить исключение верхнего уровня
            System.out.println("Перехвачено: " + e);

            //отобразить исключение причину
            System.out.println("Исходная причина: " + e.getCause());
        }
    }
}
