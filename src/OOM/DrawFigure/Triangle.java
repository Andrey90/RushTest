package OOM.DrawFigure;

/**
 * Created by luchkovsky on 26.04.15.
 */
public class Triangle extends Shape{
    public void draw(){
        System.out.println("Draw Triangle");
    }
    public void perimeter(int a, int b, int c, int d){
        int rez = a + b + c + d;
        System.out.println("Perimeter = " + rez);
    }
}
