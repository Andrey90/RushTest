package shildt.book.exampleBox2;

/**
 * Created by SuperStar on 03.12.2014.
 */
class Box {
    private double width;
    private double height;
    private double depth;

    //конструирование клона обьекта
    Box(Box ob){
        //передача обьекта конструктору
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    //конструктор, используемый при указании всех измерений
    Box(double w, double h, double d){
        System.out.println("Конструирование обьекта Box");
        width = w;
        height = h;
        depth = d;
    }

    //конструктор, используемый если нет изменений
    Box(){
        width = -1;
        height = -1;
        depth = -1;
    }

    //конструктор, используемый при создании куба
    Box(double len){
        width = depth = height = len;
    }

    //Вычисление и возращение обьема
    double volume(){
        return width * height * depth;
    }

}
