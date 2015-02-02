package ws.kostin.task7;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 02.02.15
 * Time: 15:54
 * To change this template use File | Settings | File Templates.
 *
 * В городе N есть большой склад на котором существует 50000 различных полок.
 * Для удобства работников руководство склада решило заказать для каждой полки табличку с номером от 00001 до 50000 в
 * местной типографии, но когда таблички напечатали, оказалось что печатный станок из-за неисправности не печатал цифру 2, поэтому все таблички,
 * в номерах которых содержалась одна или более двойка (например, 00002 или 20202) — надо перепечатывать.
 * Напишите программу, которая подсчитает сколько всего таких ошибочных табличек оказалось в бракованной партии.
 */
public class e7_14 {
    public static void main(String args[]){
        int rez = 0;
         for (int i = 1; i < 50001; i++){
             int i1 = i / 100000 % 10;
             int i2 = i / 10000 % 10;
             int i3 = i / 1000 % 10;
             int i4 = i / 100 % 10;
             int i5 = i / 10 % 10;
             int i6 = i % 10;

             if (i1 == 2 | i2 == 2 | i3 == 2 | i3 == 2 | i4 == 2 | i5 == 2 | i6 == 2  ){
                 rez ++;
                 System.out.println(i);
             }
         }   System.out.println(rez);
    }
}