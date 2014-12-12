package shildt.book.exampleFactorial;

/**
 * Created by SuperStar on 07.12.2014.
 */
class Factorial {
    //рекурсивный метод
    int fac(int n){
        int result;

        if (n == 1)return 1;
        result = fac(n-1) * n;
        return result;
    }
}
