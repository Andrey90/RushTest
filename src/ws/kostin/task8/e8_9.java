package ws.kostin.task8;

/**
 * Created by luchkovsky on 01.03.15.
 * Создайте два массива из 10 целых случайных чисел из отрезка [1;9] и третий массив из 10 действительных чисел.
 * Каждый элемент с i-ым индексом третьего массива должен равняться отношению элемента из первого массива с i-ым
 * индексом к элементу из второго массива с i-ым индексом. Вывести все три массива на экран (каждый на отдельной строке),
 * затем вывести количество целых элементов в третьем массиве.
 */
public class e8_9 {
    public static void main(String args[]){
        int mas1[] = new int[10];
        int mas2[] = new int[10];
        double mas3[] = new double[10];
        int i = 0;
        int count = 0;

        for (i = 0; i < mas1.length; i++){
            mas1[i] = (int)(1 + (Math.random()) * 8 + 1);
            System.out.print(mas1[i] + " ");
        }
        System.out.println();
        for (i = 0; i < mas2.length; i++){
            mas2[i] = (int)(1 + (Math.random()) * 8 + 1);
            System.out.print(mas2[i] + " ");
        }
        System.out.println();

        for (i = 0; i < mas3.length; i++){
            mas3[i] = (float) mas1[i] / mas2[i];
            System.out.print(mas3[i] + " ");

            if ((long)mas3[i] == mas3[i]){
                count++;
            }
        }
        System.out.println();
        System.out.print(count);
    }
}
