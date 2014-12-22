package shildt.book.exampleEnum;

/**
 * Created by luchkovsky on 22.12.14.
 */
class EnumDemo {
    public static void main(String args[]){
        Apple ap;

        ap = Apple.RedDel;

        //Выхов значения enum
        System.out.println("Значение ap: " + ap);
        System.out.println();

        ap = Apple.Cortland;
        //Сравнение двух перечисленных значений
        if (ap == Apple.Cortland){
            System.out.println("ap содержит Cortland.\n");
        }

        //Применение enum для управления оператором switch
        switch (ap){
            case Jonathan:
                System.out.println("Jonathan крассный");
                break;
            case GoldtnDel:
                System.out.println("GoldtnDel желтый");
                break;
            case RedDel:
                System.out.println("RedDel синий");
                break;
            case Winessap:
                System.out.println("Winessap белый");
                break;
            case Cortland:
                System.out.println("Cortland зеленый");
                break;
        }
    }
}
