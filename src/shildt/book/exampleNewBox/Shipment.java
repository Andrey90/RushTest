package shildt.book.exampleNewBox;

/**
 * Created by SuperStar on 08.12.2014.
 */

//Добавление стоимости доставки
class Shipment extends BoxWeight{
    double cost;

    //конструирование клона обьекта
    Shipment(Shipment ob){ //передача обьекта конструктору
        super(ob);
        cost = ob.cost;
    }

    //конструктор, используемый при указании всех параметров
    Shipment(double w, double h, double d, double m, double c){
        super(w, h, d, m); //вызов конструткора суперкласа
        cost = c;
    }

    //конструктор, используемый по умолчанию
    Shipment(){
        super();
        cost = -1;
    }

    //конструктор, используемый при создании куба
    Shipment(double len, double m, double c){
        super(len, m);
        cost = c;
    }
}
