package shildt.book.exampleInterfaceConstant;

import java.util.Random;

/**
 * Created by luchkovsky on 15.12.14.
 */
class Question implements SharedConstants {

    Random ob = new Random();

    int ask() {
        int prob = (int) (100 * ob.nextDouble());
        if (prob < 30)
            return NO;
        else if (prob < 60)
            return YES;
        else if (prob < 75)
            return LATER;
        else if (prob < 98)
            return SOON;
        else
            return NEVER;
    }

}
