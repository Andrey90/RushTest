package shildt.book.exampleFigure;

/**
 * Created by SuperStar on 11.12.2014.
 */
class Triangle extends Figure {
    Triangle(double a, double b) {
        super(a, b);
    }

    //переопределение метода area для прямоугольного треугольника
    double area() {
        System.out.println("В области треугольника");
        return dim1 * dim2 / 2;
    }
}
