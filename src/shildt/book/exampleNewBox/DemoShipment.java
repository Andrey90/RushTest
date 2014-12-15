package shildt.book.exampleNewBox;

/**
 * Created by SuperStar on 08.12.2014.
 */
class DemoShipment {
    public static void main(String args[]) {
        Shipment shipment1 = new Shipment(10, 12, 15, 23, 10.45);
        Shipment shipment2 = new Shipment(4, 5, 45, 0.123, 23.021);
        double vol;

        vol = shipment1.volume();
        System.out.println("Обьем shipment1 равен " + vol);
        System.out.println("Вес shipment1 равен " + shipment1.weight);
        System.out.println("Стоимость доставки: $" + shipment1.cost);
        System.out.println();

        vol = shipment2.volume();
        System.out.println("Обьем shipment2 равен " + vol);
        System.out.println("Вес shipment2 равен " + shipment2.weight);
        System.out.println("Стоимость доставки: $" + shipment2.cost);
        System.out.println();
    }

}
