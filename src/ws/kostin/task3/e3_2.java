package ws.kostin.task3;

/**
 * Created by luchkovsky on 14.01.15.
 * В переменных a и b лежат положительные длины катетов прямоугольного треугольника. Вычислить и вывести на экран площадь треугольника и его периметр.
 */
public class e3_2 {
    public static void main(String args[]) {
        double p;
        double s;
        double a = 10;
        double b = 18;
        //double c;

        s = (a * b)/2;
        System.out.println("Площадь равна: " + s);

        //c = Math.sqrt(a + b);
        p = a + b + Math.sqrt(a + b);
        System.out.println("Периметр равен: " + p);

    }
}
