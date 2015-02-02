package ws.kostin.task7;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 02.02.15
 * Time: 17:12
 * To change this template use File | Settings | File Templates.
 *
 * Электронные часы показывают время в формате от 00:00 до 23:59. Подсчитать сколько раз за сутки случается так, что
 * слева от двоеточия показывается симметричная комбинация для той, что справа от двоеточия (например, 02:20, 11:11 или 15:51).
 */
public class e7_15 {
    public static void main(String args[]){
        int rez = 0;

        for (int a = 0; a < 60; a++){
            int a1 = a / 10;
            int a2 = a % 10;
            for (int b = 0; b < 60; b++){
                int b1 = b / 10;
                int b2 = b % 10;

                if (a1 == b2 & a2 == b1){
                    rez++;
                    System.out.println(a1 + "" + a2 + ":" + b1 + "" + b2);
                }
            }
        }
        System.out.println(rez);
    }
}
