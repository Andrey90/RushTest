package shildt.book.exampleProcess;

/**
 * Created by luchkovsky on 22.06.15.
 */
public class ExecDemoFini {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        Process process = null;

        try {
            process = runtime.exec("notepad");
            process.waitFor();
        }
        catch (Exception e){
            System.out.println("Error of run notepad");
        }
        System.out.println("Notepad return: " + process.exitValue());
    }
}
