package shildt.book.exampleFigure;

/**
 * Created by SuperStar on 11.12.2014.
 */
class FindAreas {
    public static void main(String args[]){
        Rectangle r = new Rectangle(15, 13);
        Triangle t = new Triangle(22, 66);
        Figure figref;

        figref = r;
        System.out.println("Площадь равна: " + figref.area());

        figref = t;
        System.out.println("Площадь равна: " + figref.area());
    }
}
