package ws.kostin.task11;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 03.04.15
 * Time: 12:14
 * To change this template use File | Settings | File Templates.
 */
public class Triangle {

    public Point a, b, c;

    //constructor for create triangle
    public Triangle(Point v1, Point v2, Point v3){
        this.a = v1;
        this.b = v2;
        this.c = v3;
    }

    //method who return string with apex of triangle
    public String toString(){
        return "Triangle with apex in points of " + a + ", " + b + " and " + c ;
    }

    //print parameters of triangle
    public void print(){
        System.out.println(this.toString());
    }

    //perimeter of the triangle
    public void getPerimeterTr(double ab, double bc, double ac){
        double per = 0;
        per = ab + bc + ac;
        System.out.println("Perimeter = " + per);
    }

    public double getPerimeterTr(){
        double lengthAb = Point.length(a,b);
        double lengthAc = Point.length(a,c);
        double lengthBc = Point.length(b,c);
        return lengthAb + lengthAc + lengthBc;
    }

    //square of triangle
//    public void getSquareTr(Point a, Point b, Point c){
//        double rez = 0;
//        double p = getPerimeterTr()/2;
//        rez = Math.sqrt(p * (p - a.length(a,b) ) * (p - b.length(p1,p3)) * (p - c.length(p2, p3)));
//        System.out.println("Square = " + rez);
//    }
}
