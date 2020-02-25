package come.epam.hometask;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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

        System.out.println("-------------------------------------------------------");
        books.sortByAuthor();
        System.out.println("-------------------------------------------------------");
        books.sortByPublishing_House();
        System.out.println("-------------------------------------------------------");
        books.sortByPrice();

        System.out.println("-------------------------------------------------------");
        Serializator serializator = new Serializator();
        serializator.serialization(books);
        books.printBooks();
        System.out.println("-------------------------------------------------------");

        System.out.println("Введите полный путь сохранения файла и его названиe:");
        String file = scanner.next();
        WriteRead writeRead = new WriteRead(file);
        writeRead.write(books);
        }
    }

