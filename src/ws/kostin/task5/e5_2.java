package ws.kostin.task5;

/**
 * Created by luchkovsky on 15.01.15.
 * Создать программу, выводящую на экран случайно сгенерированное трёхзначное натуральное число и его наибольшую цифру.
 * Примеры работы программы:
 * В числе 208 наибольшая цифра 8
 */
public class e5_2 {
    public static void main(String args[]) {

        int n = 100 + (int) (Math.random() * 899 + 1);
        System.out.println("String: " + n);

        String a = Integer.toString(n);
        char b[] = a.toCharArray();
        //System.out.println(b);
        char max = 0;

        for (int index = 0; index < b.length; index++) {
            if (b[index] > max) {
                max = b[index];
                int res = Character.getNumericValue(max);
            }
        }
        System.out.println("Max element: " + max);
    }
}
