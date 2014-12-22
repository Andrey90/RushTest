package shildt.book.exampleEnum;

/**
 * Created by luchkovsky on 22.12.14.
 */
class EnumDemo2 {
    public static void main(String args[]){
        Apple ap;

        System.out.println("Константы Apple: ");

        //применение values()
        Apple allapples[] = Apple.values();
        for (Apple a: allapples){
            System.out.println(a);
        }
        System.out.println();

        //применение valuesOf()
        ap = Apple.valueOf("Jonathan");
        System.out.println("ap содержит: " + ap);
    }
}
