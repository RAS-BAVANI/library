package com.library.library;
import java.util.*;

public class App {

    static class Book {
        int id;
        String title;
        boolean issued;

        Book(int id, String title) {
            this.id = id;
            this.title = title;
            this.issued = false;
        }
    }

    static List<Book> books = new ArrayList<>();

    public static void addBook(int id, String title) {
        books.add(new Book(id, title));
        System.out.println("Book added!");
    }

    public static void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        for (Book b : books) {
            System.out.println("ID: " + b.id +
                    ", Title: " + b.title +
                    ", Issued: " + (b.issued ? "Yes" : "No"));
        }
    }

    public static void issueBook(int id) {
        for (Book b : books) {
            if (b.id == id) {
                if (!b.issued) {
                    b.issued = true;
                    System.out.println("Book issued!");
                } else {
                    System.out.println("Already issued!");
                }
                return;
            }
        }
        System.out.println("Book not found!");
    }

    public static void returnBook(int id) {
        for (Book b : books) {
            if (b.id == id) {
                if (b.issued) {
                    b.issued = false;
                    System.out.println("Book returned!");
                } else {
                    System.out.println("Not issued!");
                }
                return;
            }
        }
        System.out.println("Book not found!");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();
                    addBook(id, title);
                    break;

                case 2:
                    viewBooks();
                    break;

                case 3:
                    System.out.print("Enter ID: ");
                    issueBook(sc.nextInt());
                    break;

                case 4:
                    System.out.print("Enter ID: ");
                    returnBook(sc.nextInt());
                    break;

                case 5:
                    System.out.println("Exit...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}