package ws.kostin.task10;

/**
 * Created by luchkovsky on 19.03.15.
 */
public class Main {
    //main class, include class main
    public static void main(String args[]){
        //create new object class Circle
        Circle circle = new Circle();
        //print parameters of this object(circle)
        circle.printCircle();
        //change abscissa of circle
        circle.relocateCircle(3.4,21.5);
        //change radius
        circle.r = 12.4;
        //calculate len
        circle.lenCircle();
        //calculate sqr
        circle.squareCircle();
        //print new circle parameters
        circle.printCircle();


        Circle circle2 = new Circle(1.0,12.9,44.0);
        circle2.printCircle();
    }
}
