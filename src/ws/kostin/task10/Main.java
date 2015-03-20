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
        //circle.printCircle();
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
        System.out.println(circle2.distanceBetweenCenter(circle));

//        Circle circle3 = new Circle(3.4,43,11.9);
//        circle3.lenCircle();
//        circle3.squareCircle();
//        circle3.printCircle();

//        Circle circle4 = new Circle();
//        circle4.printCircle();
//        if (circle4.equalsCircle(circle)){
//            System.out.println("Square equal");
//        }
//        else {
//            System.out.println("Square not equal");
//        }
//        circle4.relocate(-99,99);
//        circle4.printCircle();
    }
}
