package shildt.book.exampleOther;

/**
 * Created by luchkovsky on 22.06.15.
 */
public class MemoryDemo {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        long mem1, mem2;
        Integer someints[] = new Integer[1000];

        System.out.println("Всего памяти: " + r.totalMemory());

        mem1 = r.freeMemory();
        System.out.println("Свободной памяти в начале: " + mem1);
        r.gc();//запуск сборщика мусора
        mem1 = r.freeMemory();
        System.out.println("Свободной памяти после сбора мусора: " + mem1);

        for (int i = 0; i < someints.length; i++){
            someints[i] = new Integer(i); //Распределение Integer
        }

        mem2 = r.freeMemory();
        System.out.println("Свободной памяти после распределения: " + mem2);
        System.out.println("Использование паяти для распределения: " + (mem1 - mem2));

        //отбросить Integers
        for (int i = 0; i < 1000; i++){
            someints[i] = null;
        }
        r.gc();//запуск сборщика мусора
        mem2 = r.freeMemory();
        System.out.println("Свободной памяти после сбора " + "отброшенных Integer: " + mem2);
    }
}
