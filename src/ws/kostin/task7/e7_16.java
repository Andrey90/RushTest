package ws.kostin.task7;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 02.02.15
 * Time: 17:53
 * To change this template use File | Settings | File Templates.
 * В американской армии считается несчастливым число 13, а в японской — 4.
 * Перед международными учениями штаб российской армии решил исключить номера боевой техники, содержащие числа 4 или 13 (
 * например, 40123, 13313, 12345 или 13040), чтобы не смущать иностранных коллег. Если в распоряжении армии имеется 100 тыс.
 * единиц боевой техники и каждая боевая машина имеет номер от 00001 до 99999,
 * то сколько всего номеров придётся исключить?
 */
public class e7_16 {
    public static void main(String[] args) {
//        int rez = 0;
//        int i;
//        int rez1 = 0;
//        int count = 0;
//        for (i = 1; i < 100000; i++){
//            int i1 = i / 100000 % 10;
//            int i2 = i / 10000 % 10;
//            int i3 = i / 1000 % 10;
//            int i4 = i / 100 % 10;
//            int i5 = i / 10 % 10;
//            int i6 = i % 10;
//
//            if (i1 != 4 & i2 != 4 & i3 != 4 & i4 != 4 & i5 != 4 & i6 != 4){
//                int k1 = i % 100;
//                int k2 = i % 1000 / 10;
//                int k3 = i % 10000 / 100;
//                int k4 = i / 1000;
//
//                if (k1 != 13 & k2 != 13 & k3 != 13 & k4 != 13){
//                    rez++;
//                }
//            }
//        }
//        rez1 = i - rez;
//        System.out.println(rez1);
        int count = 0;
        for (int i = 1; i < 100000; i++){
            String numberStr = Integer.toString(i);
            if(numberStr.contains("4") || numberStr.contains("13")){
                count++;
                System.out.println(numberStr);
            }

        }

        System.out.println("*****************************************");
        System.out.println("count = " + count);
    }
}


