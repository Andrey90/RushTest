package ws.kostin.task10;

import java.util.Scanner;

/**
 * Created by luchkovsky on 19.03.15.
 */
public class Circle {
    //properties of circle
    public double x; //abscissa of the center
    public double y; //ordinate of the center
    public double r; //radius of circle
    public double len;//calculate len
    public double sqr;//calculate sqr

    //constructor Circle
    //Измените в классе Circle конструктор по умолчанию так, чтобы в момент создания объекта с его помощью, координаты
    // центра и радиус окружности пользователь вводил с клавиатуры.
    public Circle(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter coordinate X: ");
        x = scanner.nextDouble();

        System.out.print("Enter coordinate Y: ");
        y = scanner.nextDouble();

        System.out.print("Enter radius R: ");
        r = scanner.nextDouble();
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
    public void scalableR(double r){
        this.r = Math.pow(r,2);
    }

    //length circle
    //Создайте в классе Circle метод, вычисляющий длину окружности.
    public double lenCircle(){
        len = Math.PI * 2 * r;
        return len;
    }

    //square circle
    public double squareCircle(){
        sqr = Math.PI * Math.pow(r,2);
        return sqr;
    }

    //equals Circle
    public boolean equalsCircle(Circle cir){
        if (this.squareCircle() == cir.squareCircle()){
            return true;
        }
        else {
            return false;
        }
    }

    //method for exercise 2
    //Создайте в классе Circle метод, перемещающий центр круга в случайную точку квадрата координатной плоскости с
    // диагональю от [-99;-99] до [99;99]. Обратите внимание на то, что требуется создать обычный метод, применимый к
    // уже существующему объекту, а не конструктор создающий новый объект.
    //Min + (int)(Math.random() * ((Max - Min) + 1))
    public void relocate(double a, double b){
        x = a + (Math.random() * ((b - a) + 1));
        y = a + (Math.random() * ((b - a) + 1));
        System.out.println(x + "; " + y);
    }
    //Создайте в классе Circle метод, вычисляющий расстояние между центрами двух окружностей.
    public double distanceBetweenCenter(Circle cir1){
        double dis = Math.sqrt(Math.sqrt(cir1.x - this.x) + Math.sqrt(cir1.y - this.y));
        //System.out.println(dis);
        return dis;
    }

    //Создайте в классе Circle метод, проверяющий, касаются ли окружности в одной точке. Учтите, что возможен вариант,
    //когда одна окружность содержится внутри другой и при этом всё равно возможно касание в одной точке.
    public double pointCir(Circle cir1){
        return 0;
    }
}
