package ws.kostin.task11;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 23.03.15
 * Time: 11:27
 * To change this template use File | Settings | File Templates.
 */
public class Point {
    public double x;//abscissa point
    public double y;//ordinate point

    //return line with the description of point
    public String toString(){
        return "(" + x + ";" + y + ")";
    }

    //print information about point to screen
    public void printPoint(){
        System.out.print(this.toString());
    }

    //method to relocate point by said vector
    public void movePoint(double a, double b){
        x = x + a;
        y = y + b;
    }

    //method to edit coordinate of point
    public void setPoint(double a, double b){
        x = a;
        y = b;
    }

    //default constructor
    public Point() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter X: ");
        double x = scanner.nextDouble();
        System.out.print("Enter Y: ");
        double y = scanner.nextDouble();
    }

    //constructor creates point with the specified coordinates
    public Point(double a, double b){
        x = a;
        y = b;
    }

    //the method calculates the distance between two points
    public double length(Point p){
        return Math.sqrt(Math.pow(p.x - x, 2) + Math.pow(p.y - y, 2));
    }

    //the method checks the same points
    public boolean equalsPoint(Point p){
        if (this.x == p.x && this.y == p.y){
            return true;
        }
        else {
            return false;
        }
    }
    //what is the point of a coordinate quarter
    public void coordinateQuarter(){
        if (this.x == 0 && this.y == 0){
            System.out.println("In center");
        }
        else if(this.x > 0){
            if (this.y > 0){
                System.out.println("1");
            }
            else if (this.y < 0){
                System.out.println("4");
            }
            else {
                System.out.println("1, 4");
            }
        }
        else if (this.x < 0){
            if (this.y < 0){
                System.out.println("3");
            }
            else if (this.y > 0){
                System.out.println("2");
            }
            else {
                System.out.println("2, 3");
            }
        }
    }

    //whether two points symmetric with respect to the reference
    public void symmetricPoints(Point a, Point b){
        if ((this.x - b.x) / (a.x - b.x) == (this.y - b.y) / (a.y - b.y)){
            System.out.println("In one line");
        }
        else System.out.println("In different line");
    }

}
