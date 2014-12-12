package shildt.book.exampleFigure;

/**
 * Created by SuperStar on 11.12.2014.
 */
class Rectangle extends Figure {
    Rectangle(double a, double b){
        super(a, b);
    }

    //переопределение метода area для четырехугольника
    double area(){
        System.out.println("В области четырехугольника.");
        return dim1 * dim2;
    }
}
