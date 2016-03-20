package shildt.book.exampleCollections;

import java.io.*;
import java.util.Properties;

/**
 * Created by luchkovsky on 24.02.2016.
 */
public class PropertiesLoaderDemo {
    public static void main(String[] args) throws IOException {
        Properties ht = new Properties();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String name, number;
        FileInputStream fin = null;
        boolean changed = false;

        //to try open file phonebook.dat
        try {
            fin = new FileInputStream("phonebook.bat");
        }
        catch (FileNotFoundException e){
            //ignore not found file
        }

        //if this phonebook is present, we download it is numbers
        try {
            if (fin != null){
                ht.load(fin);
                fin.close();
            }
        }
        catch (IOException e){
            System.out.println("Error of reading file");
        }
        //add new names and numbers
        do {
            System.out.println("Enter name: " + " ('quit' for stop): ");
            name = br.readLine();
            if (name.equals("quit")){
                continue;
            }else {
                System.out.println("Enter number: ");
                number = br.readLine();
                ht.put(name, number);
                changed = true;
            }
        }
        while (!name.equals("quit"));

        if (changed){
            FileOutputStream fout = new FileOutputStream("phonebook.bat");
            ht.store(fout, "Phonebook");
            fout.close();
        }
        //Find number to name
        do {
            System.out.println("Enter name for find" + " ('quit' for stop): ");
            name = br.readLine();
            if (name.equals("quit"))continue;
            number = (String) ht.get(name);
            System.out.println(number);
        }
        while (!name.equals("quit"));
    }
}
