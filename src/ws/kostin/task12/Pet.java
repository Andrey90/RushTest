package ws.kostin.task12;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 06.04.15
 * Time: 12:15
 * To change this template use File | Settings | File Templates.
 */
abstract class Pet { //abstract class
    String name;
    int age;
    boolean hungry;
    abstract void voice();//abstract method
    void food(){
        hungry = false;
    }
}
