package shildt.book.exampleBox;

/**
 * Created by SuperStar on 02.12.2014.
 */
class Box {
    double width;
    double height;
    double depth;

    double volume() {
        return width * height * depth;
    }

    //установка размеров паралелепипеда
    void setDim (double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
}

