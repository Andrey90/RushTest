package shildt.book.exampleIO;

import java.io.*;

/**
 * Created by luchk on 21.03.2016.
 */
public class DataIODemo {
    public static void main(String[] args) {
        //Write data
        try (DataOutputStream dout = new DataOutputStream(new FileOutputStream("Test.dat"))){
            dout.writeDouble(96.25);
            dout.writeInt(23);
            dout.writeBoolean(true);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return;
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Read data
        try (DataInputStream din = new DataInputStream(new FileInputStream("Test.dat"))) {
            double d = din.readDouble();
            int i = din.readInt();
            boolean b = din.readBoolean();

            System.out.println("My data: " + d + " " + i + " " + b);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
