package ws.kostin.task7;

/**
 * Created by luchkovsky on 21.01.15.
 * Выведите на экран все двузначные члены последовательности 2an-1+200, где a1= –166.
 */
public class e7_6 {
    public static void main(String args[]){
        for (int a = -166; a < 100; a = 2 * a + 200){
            if (a/100 == 0){
                System.out.print(a + " ");
            }
        }
    }
}
