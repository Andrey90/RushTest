package shildt.book.exampleEnum;

/**
 * Created by luchkovsky on 23.12.14.
 */
public class EnumDemo3 {
    public static void main(String args[]){
        Apple ap;

        //Отобразить цену Winessap
        System.out.println("Winessap стоит " + Apple.Winessap.getPrice() + " центов.");

        //Отобразит цены всех сортов яблок
        System.out.println("Все цены яблок: ");
        for (Apple a : Apple.values())
            System.out.println(a + " стоит " + a.getPrice());
    }
}
