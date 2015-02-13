package ws.kostin.task8;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 13.02.15
 * Time: 17:14
 * Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый, выведите массивы на экран в двух отдельных строках.
 * Посчитайте среднее арифметическое элементов каждого массива и сообщите, для какого из массивов это значение оказалось больше
 * (либо сообщите, что их средние арифметические равны).
 */
public class e8_5 {
    public static void main(String args[]){
        int i;
        int mas1[] = new int[5];
        int mas2[] = new int[5];
        double s1, s2 = 0;
        double sum1 = 0;
        double sum2 = 0;
        double sr = 0;

    //Работа над первым масивом
        for (i = 0; i < mas1.length; i++){
            int ran1 = (int)((Math.random() * 5 + 1));
            mas1[i] = ran1;
            System.out.print(mas1[i] + " ");
        }
        System.out.println(" ");

        for (i = 0; i < mas1.length; i++){
            sum1 = sum1 + mas1[i];
        }
        s1 = sum1 / mas1.length;
        System.out.println("Среднее арифметическое первого массива: " + s1);

        //Работа над вторым масивом
        for (i = 0; i < mas2.length; i++){
            int ran2 = (int)((Math.random() * 5 + 1));
            mas2[i] = ran2;
            System.out.print(mas2[i] + " ");
        }
        System.out.println(" ");

        for (i = 0; i < mas1.length; i++){
            sum2 = sum2 + mas2[i];
        }
        s2 = sum2 / mas2.length;
        System.out.println("Среднее арифметическое первого массива: " + s2);


        System.out.println(" ");

        if (s1 < s2){
            System.out.println("Среднее арифметическое массива 2 больше, равно: " + s2);
        }
        else if (s1 > s2){
            System.out.println("Среднее арифметическое массива 1 больше, равно: " + s1);
        }
        else {
            System.out.println("Среднее арифметическое двух массивов равно");
        }

    }
}
