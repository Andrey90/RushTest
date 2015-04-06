package ws.kostin.task12_3;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 06.04.15
 * Time: 16:17
 * To change this template use File | Settings | File Templates.
 */
class Pickup implements CargoAuto, PassangerAuto {
    public void transportCargo(){
        System.out.println("Vezut gruz");
    }
    public void transportPassangers(){
        System.out.println("Vezu pasajirov");
    }
}
