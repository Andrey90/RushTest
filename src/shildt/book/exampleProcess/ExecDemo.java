package shildt.book.exampleProcess;

/**
 * Created by luchkovsky on 22.06.15.
 */
public class ExecDemo {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        Process p = null;
        try {
            p = r.exec("notepad");
        }
        catch (Exception e){
            System.out.println("Error of run notepad");
        }
    }
}
