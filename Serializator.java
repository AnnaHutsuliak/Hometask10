package come.epam.hometask;

import java.io.*;

public class Serializator {

    public void serialization(Books books) {

        ObjectOutputStream ann = null;
        try {
            File file = new File("D:/books.txt");
            FileOutputStream nna = new FileOutputStream(file);
            if (nna != null) {
                ann = new ObjectOutputStream(nna);
                ann.writeObject(books);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (ann != null) {
                try {
                    ann.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}