package shildt.book.exampleSimpleInheritance;

/**
 * Created by SuperStar on 08.12.2014.
 */
class SipleInheritance {
    public static void main(String args[]){
        A superOb = new A();
        B subOb = new B();

        //Суперкласс может использоваться самостоятельно
        subOb.i = 10;
        subOb.j = 20;
        System.out.println("Содержимое SuperOb: ");
        superOb.showij();
        System.out.println();

        //Подкласс имеет доступ ко всем открытым членам своего суперкласса
        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        System.out.println("Содержимое SuperOb: ");
        subOb.showij();
        subOb.showk();

        System.out.println();
        System.out.println("Сумма i, j, k в subOb: ");
        subOb.sum();
    }
}
