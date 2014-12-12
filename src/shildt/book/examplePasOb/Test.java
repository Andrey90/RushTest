package shildt.book.examplePasOb;

/**
 * Created by SuperStar on 06.12.2014.
 */
class Test {
    int a, b;

    Test(int i, int j){
        a = i;
        b = j;
    }

    //возврат значения true, если параметр о равен вызывающему обьекту
    boolean equals(Test o){
        if (o.a == a && o.b == b)
            return true;
        else return false;
    }

}
