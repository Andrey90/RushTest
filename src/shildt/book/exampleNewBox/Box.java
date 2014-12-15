package shildt.book.exampleNewBox;

/**
 * Created by SuperStar on 08.12.2014.
 */
//создание класса Box
class Box {
    private double width;
    private double height;
    private double depth;

    //конструирование клона обьекта
    Box(Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    //конструктор, используемый при указании всех измерений
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    //конструктор, используемый, когда ни одного из измерений не указано
    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    //конструктор, используемый при создании куба
    Box(double len) {
        width = height = depth = len;
    }

    //вычисление и возврат обьема
    double volume() {
        return width * height * depth;
    }
}
