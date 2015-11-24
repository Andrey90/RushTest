package ws.kostin.task8;

/**
 * Created by luchkovsky on 06.03.15.
 */
public class sort_vyborom {
    public static void main(String args[]){
        int count = 0;
        int a[] = {2,4,5,1,5,7,0,12,22,34,1,2,32,0};

        for (int i = 0; i < a.length; i++){
            /* Предполагаем, что начальный элемент рассматриваемого фрагмента и будет минимальным.*/
            int min = a[i]; // Предполагаемый минимальный элемент
            int imin = i;// Индекс минимального элемента
            //Просматриваем оставшийся фрагмент массива и ищем там элемент, меньший предположенного минимума.

            for (int j = i + 1; j < a.length; j++){
                //Если находим новый минимум, то запоминаем его индекс.И обновляем значение минимума.
                if (a[j] < min){
                    min = a[j];
                    imin = j;
                }
            }
            //Проверяем, нашёлся ли элемент меньше, чем стоит на текущей позиции. Если нашёлся, то меняем элементы местами.
            if (i != imin){
                int temp = a[i];
                a[i] = a[imin];
                a[imin] = temp;
            }
            count++;
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println(count);
    }
}
