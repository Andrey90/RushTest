package javable.lesson3;

/**
 * Created by luchkovsky on 29.09.2015.
 */
public class SymbolTest {
    public static void main(String[] args) {
        int a = 5;

        for (int i = 0; i < a; i++){
            char c = (char)(Math.random() * 26 + 'a');
            System.out.print(c + ": ");

            switch (c){
                case 'a':case 'e':case 'i':case 'o':case 'u':
                    System.out.println("glasnaya");
                    break;
                case 'y':case 'w':
                    System.out.println("inogda glasnaya");
                    break;
                default:
                    System.out.println("soglasnaya");
            }
        }
    }
}
