package Mains;

import Classes.Book;
import java.util.ArrayList;
import java.util.Scanner;

public class BookMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> bookList = new ArrayList<Book>();

        while (true) {
            System.out.println("What is the name of the book?");
            String name = scanner.nextLine();
            if (name.isBlank()) {
                break;
            }
            System.out.println("How many pages does the book have?");
            int pages = scanner.nextInt();
            System.out.println("What is the publication year?");
            int year = scanner.nextInt();
            scanner.nextLine();

            bookList.add(new Book(name, pages, year));
        }

        System.out.print("What information will be printed?");
        String request = scanner.nextLine();
        print(bookList, request);

    }

    public static void print(ArrayList<Book> bookList, String request) {
        for (Book book : bookList) {
            if (request.equalsIgnoreCase("everything")) {
                System.out.println(book.toString());
            } else if (request.equalsIgnoreCase("name")) {
                System.out.println(book.getTitle());
            } else if (request.equalsIgnoreCase("pages")) {
                System.out.println(book.getPageNumbers() + " pages");
            } else if (request.equalsIgnoreCase("year")) {
                System.out.println(book.getPublicationYear());
            } else if (request.equalsIgnoreCase("name and pages")) {
                System.out.println(book.getTitle() + ", " + book.getPageNumbers() + " pages");
            } else if (request.equalsIgnoreCase("name and year")) {
                System.out.println(book.getTitle() + ", " + book.getPublicationYear());
            } else if (request.equalsIgnoreCase("pages and year")) {
                System.out.println(book.getPageNumbers() + " pages," + book.getPublicationYear());
            } else {
                System.out.println("Please Enter a valid value.\n" +
                        "You can enter:\n"
                        + " 'name', 'pages', 'year' or \n"
                        + "'name and pages', 'name and year', 'pages and year'");
                break;
            }
        }
    }
}