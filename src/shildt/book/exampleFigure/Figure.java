package shildt.book.exampleFigure;

/**
 * Created by SuperStar on 11.12.2014.
 */
// Применение полиморфизма времени выполнения

abstract class Figure {
    double dim1;
    double dim2;

    Figure(double a, double b){
        dim1 = a;
        dim2 = b;
    }

    abstract double area();
}
