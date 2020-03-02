package come.epam.hometask;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Все книги:");
        Books books = new Books();
        books.printBooks();
        System.out.println("-------------------------------------------------------");

        System.out.print("Введите год для отбора книги: ");
        try {
            int number_year = scanner.nextInt();
            System.out.println("-------------------------------------------------------");
            Validator.checkYearOfChosenBook(number_year);
            Books booksNumber_year = new Books();
            booksNumber_year.setBooks(books.searchBooks(number_year));
            System.out.println("Книги, после выбраного года: ");
            booksNumber_year.printBooks();
        } catch (Exception a) {
            System.err.println("Книг, выбранного года нету. Введите год издания книги с 2010 по 2020");
        }

        System.out.print("Введите автора :");
        Scanner scanner1 = new Scanner(System.in);
        String author = scanner1.nextLine();
        System.out.println("-------------------------------------------------------");

        Books booksAuthor = new Books();
        booksAuthor.setBooks(books.searchAuthor(author));
        booksAuthor.printBooks();

        System.out.print("Введите значения процента для изменения стоимости книг: ");
        try {
            int number_percent = scanner.nextInt();
            System.out.println("-------------------------------------------------------");
            Validator.checkNumberPercent(number_percent);
            books.revaluation(number_percent);
            System.out.println("Книги, стоимость которых увеличена на: " + number_percent + " % :");
            books.printBooks();
        } catch (Exception e) {
            System.err.println("Ограничение процента (от 1 до 100), введите валидный процент");
        }

        System.out.println("-------------------------------------------------------\n" +
                "Книги, отсортированные по автору:");
        books.sortByAuthor();
        System.out.println("-------------------------------------------------------\n" +
                "Книги, отсортированные по издательству:");
        books.sortByPublishing_House();
        System.out.println("-------------------------------------------------------\n" +
                "Книги, отсортированные по цене:");
        books.sortByPrice();
        System.out.println("-------------------------------------------------------\n" +
                "Введите полный путь сохранения файла и его названиe:");
        Scanner file1 = new Scanner(System.in);
        String fileName = scanner1.nextLine();
        WriteRead.read();
        WriteRead.write(fileName);
        String file = "books.txt";
        Serializator ser = new Serializator();
        String fileName1 = scanner.nextLine();
        Book book = new Book(108, "Selenium", "Lovik", "Lviv", 2011, 800, 400);
        ser.serialization(book, fileName1);
        boolean b = ser.serialization(book, file);
        Book res = null;
        try {
            res = ser.deserialization(file);
        } catch (InvalidObjectException e) {

            e.printStackTrace();
        }
        System.out.println(res);
    }
}