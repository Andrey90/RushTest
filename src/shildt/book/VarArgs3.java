package shildt.book;

/**
 * Created by SuperStar on 07.12.2014.
 */
class VarArgs3 {
    static void vaTest(int... v) {
        System.out.println("vaTest(int...): " + " Количество аргументов: " + v.length + " Содержимое: ");

        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    static void vaTest(boolean... v) {
        System.out.println("vaTest(boolean...): " + " Количество аргументов: " + v.length + " Содержимое: ");

        for (boolean x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    static void vaTest(String msg, int... v) {
        System.out.println("vaTest(String, int ...): " + " Количество аргументов: " + v.length + " Содержимое: ");

        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        vaTest(1, 2, 3);
        vaTest("Проверка: ", 2, 43);
        vaTest(true, false, false);
    }
}
