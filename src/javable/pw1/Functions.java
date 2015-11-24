package javable.pw1;

/**
 * Created by luchkovsky on 28.09.2015.
 */
public class Functions {
    public double getSin(double a) {
        double rad = a * Math.PI/180;
        double rez = Math.sin(rad);
//        double radNew = rez * 180/Math.PI;
        return rez;
    }

    public double getCos(double a) {
        double rad = a * Math.PI/180;
        double rez = Math.cos(rad);
//        double radNew = rez * 180/Math.PI;
        return rez;
    }
}
