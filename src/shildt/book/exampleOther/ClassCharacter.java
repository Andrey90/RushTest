package shildt.book.exampleOther;

/**
 * Created by luchkovsky on 17.06.15.
 */
public class ClassCharacter {
    public static void main(String[] args) {
        char a[] = {'a', 'b', '5', '?', 'A', ' '};
        long start, end;

        start = System.nanoTime();
        System.out.println(start);
        for (int i = 0; i < a.length; i++){
            if (Character.isDigit(a[i]))
                System.out.println(a[i] + " Десятичное число");
            if (Character.isLetter(a[i]))
                System.out.println(a[i] + " Буква");
            if (Character.isWhitespace(a[i]))
                System.out.println(a[i] + " Пробел");
            if (Character.isUpperCase(a[i]))
                System.out.println(a[i] + " Верхний регистр");
            if (Character.isLowerCase(a[i]))
                System.out.println(a[i] + " Нижний регистр");
        }
        end = System.nanoTime();
        System.out.println(end);
        System.out.println((end - start));
    }
}
