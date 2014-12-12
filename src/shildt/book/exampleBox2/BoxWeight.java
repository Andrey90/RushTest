package shildt.book.exampleBox2;

/**
 * Created by SuperStar on 08.12.2014.
 */
class BoxWeight extends Box {
    double weight; //вес паралелепипеда

    //конструирование клона обьекта
    BoxWeight (BoxWeight ob){ //передача обьекта конструктору
        super(ob);
        weight = ob.weight;
    }
    //конструктор, используемый при указании всех параметров
    BoxWeight(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }

    //конструктор используемый по умолчанию
    BoxWeight(){
        super();
        weight = -1;
    }

    //конструктор используемый при создании куба
    BoxWeight(double len, double m){
        super(len);
        weight = m;
    }
}
