package ws.kostin.task8;

/**
 * Created by luchkovsky on 04.03.15.
 * Программа должна создать массив из 12 случайных целых чисел из отрезка [-10;10] таким образом, чтобы отрицательных
 * и положительных элементов там было поровну и не было нулей. При этом порядок следования элементов должен быть случаен
 * (т. е. не подходит вариант, когда в массиве постоянно выпадает сначала 6 положительных, а потом 6 отрицательных чисел
 * или же когда элементы постоянно чередуются через один и пр.). Вывести полученный массив на экран.
 */
public class e8_12 {
    public static void main(String[] args) {
        //Создадим переменные, в которые будем сохранять количество положительных и отрицательных елементов массива
        int a = 0, b = 0;
        int[] Mas = new int[12];
        //При помощи оператора do-while будем при помощи цикла заполнять массив то тих пор, пока значение положительных и отрицательных элементов массива будет равно
        do {
            for (int i = 0; i < Mas.length; i++) {
                Mas[i] = (int) (Math.random() * 21) - 10;
                //Увеличим значения счетчиков, в зависимости от зачения элемента массива
                if (Mas[i] < 0) {
                    a++;
                }
                if (Mas[i] > 0) {
                    b++;
                }
                //Проверим не равно ли значение массива 0, если равно заполним значение заново
                if (Mas[i] == 0) {
                    --i;
                }
                //Проверим, поровну ли в конце цикла положительных и отрицательных элементов среди элементов массива. Если нет - обнулим счетчики
                if (i == Mas.length - 1 & a != Mas.length / 2) {
                    a = 0;
                    b = 0;
                }
            }
        }
        while (a != Mas.length / 2 & b != Mas.length / 2);
        //С помощью цикла выведем значения массива на экран
        for (int i = 0; i < Mas.length; i++) {
            System.out.print(Mas[i] + " ");
        }
    }
}