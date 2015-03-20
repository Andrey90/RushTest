package shildt.book.exampleOverload;

/**
 * Created by SuperStar on 03.12.2014.
 */
class OverLoadDemo {
    void test() {
        System.out.println("Параметры отсутствуют");
    }

    //Проверка перегрузки на наличие одного целочисленного параметра
    /*void e8_3(int a){
        System.out.println("a " + a);
    }*/
    //Проверка перегрузки на наличие двух целочисленных параметров
    void test(int a, int b) {
        System.out.println("a and b: " + a + " " + b);
    }

    //Проверка перегрузки на наличие параметра типа double
    double test(double a) {
        System.out.println("double a: " + a);
        return a * a;
    }
}
