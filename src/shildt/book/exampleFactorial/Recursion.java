package shildt.book.exampleFactorial;

/**
 * Created by SuperStar on 07.12.2014.
 */
class Recursion {
    public static void main(String args[]){
        Factorial f = new Factorial();

        System.out.println("Факториал чисоа 3 равен: " + f.fac(3));
        System.out.println("Факториал чисоа 4 равен: " + f.fac(4));
        System.out.println("Факториал чисоа 5 равен: " + f.fac(5));
    }
}
