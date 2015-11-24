package shildt.book.exampleToString;

/**
 * Created by luchkovsky on 20.05.15.
 */
public class Box {
    double width;
    double height;
    double depth;

    Box(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    public String toString(){
        return "Размеры " + width + " на " +
                depth + " на " + height + ".";
    }
}
