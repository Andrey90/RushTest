package ws.kostin.task10;

/**
 * Created by luchkovsky on 19.03.15.
 */
public class Circle {
    //properties of circle
    public double x; //abscissa of the center
    public double y; //ordinate of the center
    public double r; //radius of circle
    public double pi = 3.1415926535897932;
    public double len;
    public double sqr;

    //constructor Circle
    public Circle(){
        x = 0.1;
        y = 0.5;
        r = 2;
    }

    //constructor Circle with attributes
    public Circle(double a, double b, double c){
        x = a;
        y = b;
        r = c;
    }

    //class of methods
    //print method of circle parameters
    public void printCircle(){
        System.out.println("Circle with center in x; y =  " + x + "; " + y + ", radius = " + r + " len = " + len + " and sqr = " + sqr);
    }

    //relocate center
    public void relocateCircle(double a, double b){
        x = x + a;
        y = y + b;
    }

    //scalable range
    public void scalableR(double k){
        r = r * k;
    }

    //length circle
    public double lenCircle(){
        len = pi * 2 * r;
        return len;
    }

    //square circle
    public double squareCircle(){
        sqr = pi * Math.pow(r,2);
        return sqr;
    }
}
