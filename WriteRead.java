package come.epam.hometask;

import java.io.*;

public class WriteRead implements Serializable {

    public static void read() {
        FileInputStream fis = null;
        int a;

        try {
            fis = new FileInputStream("books.txt");
            fis.read();
            while ((a = fis.read()) != -1) {
                System.out.println((char) a);
                a++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                System.err.println("ошибка закрытия: " + e);
            }
        }
    }

    public static void write(String toSave) {
        FileWriter fr = null;
        try {
            fr = new FileWriter("books.txt");
            fr.write(toSave);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}