package javable.lesson3;

/**
 * Created by luchkovsky on 29.09.2015.
 */
public class Triangle {
    public static void main(String[] args) {
        double a = 45;
        double b = 12;
        double rezA = 0;
        double rezB = 0;

        if (a > 0 && b > 0){
            double gipotenuza = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
            double tanA = a / b;
            double A = Math.atan(tanA);
            rezA = A * 180 / Math.PI;
            rezB = 180 - 90 - rezA;
            System.out.println(rezA);
            System.out.println(rezB);
        }
        else System.out.println("Error");

    }
}
