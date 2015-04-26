package OOM.DrawFigure;

/**
 * Created by luchkovsky on 26.04.15.
 */
public class TestShape {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Star star = new Star();

        circle.draw();
        rectangle.draw();
        star.draw();
    }
}
