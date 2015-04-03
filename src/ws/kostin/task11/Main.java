package ws.kostin.task11;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 23.03.15
 * Time: 15:41
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String args[]){
//        Point p1 = new Point();
//        Point p2 = new Point();
//        System.out.println("Distance between points " + p1 + " and " + p2 + " equal " + p2.length(p1));
//
//        if (p1.length(p2) == p2.length(p1)){
//            System.out.println("Ok");
//        }
//        else {
//            System.out.println("Fail");
//        }
//
//        System.out.println(p2);
//
//        if (p1.equalsPoint(p2)){
//            System.out.println("Ok");
//        }
//        else {
//            System.out.println("Fail");
//        }
//
//        p1.coordinateQuarter();
//        Point p3 = new Point(3,-3);
//        p1.symmetricPoints(p2,p3);


        Point point1 = new Point(0, 0);
        Point point2 = new Point(3, 3);
        Point point3 = new Point(6, 0);

        Triangle triangle = new Triangle(point1, point2, point3);
        triangle.print();
        triangle.getPerimeterTr(point1.length(point2), point2.length(point3), point1.length(point3));
        System.out.println(triangle.getPerimeterTr());
        triangle.getSquareTr(point1, point2, point3);

    }
}
