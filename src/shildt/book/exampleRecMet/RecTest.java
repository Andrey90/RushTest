package shildt.book.exampleRecMet;

/**
 * Created by SuperStar on 07.12.2014.
 */
class RecTest {
    int values[];
    RecTest (int i){
        values = new int[i];
    }
    //рекурсивное отображение массива
    void printArray(int i){
        if (i == 0) return;
        else printArray(i - 1);
        System.out.println("[" + (i - 1) + "]" + values[i - 1]);
    }
}
