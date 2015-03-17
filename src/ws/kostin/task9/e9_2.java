package ws.kostin.task9;

/**
 * Created by luchkovsky on 17.03.15.
 */
public class e9_2 {
    public static int fibonachi(int a){
        if (a == 1 || a == 2){
            return 1;
        }
        return fibonachi(a - 1) + fibonachi(a - 2);
    }
    public static void main(String args[]){
        System.out.print(fibonachi(46));
    }
}
