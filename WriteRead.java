package come.epam.hometask;
import java.io.*;

public class WriteRead {
    private final String file;
    public WriteRead(String file) { this.file = file; }

    public void write (Books books){
        File fileNew = new File(file);
            try (ObjectOutputStream booksOutputStream = new ObjectOutputStream(new FileOutputStream(fileNew))) {
                booksOutputStream.writeObject(books);
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
}