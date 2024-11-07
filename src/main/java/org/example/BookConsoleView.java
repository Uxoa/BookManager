package org.example;

import java.util.Scanner;

public class BookConsoleView {
    private final BookManager bookManager;
    private final Scanner scanner;

    public BookConsoleView(BookManager bookManager, Scanner scanner) {
        this.bookManager = bookManager;
        this.scanner = scanner;
    }

    public void showMainMenu() {
        System.out.println("1. Añadir libro");
        System.out.println("2. Ver todos los libros");
        System.out.println("3. Borrar libro");
        System.out.println("4. Salir");
        System.out.print("Elige una opción: ");
    }

    public void printAddBookMenu() {
        System.out.print("Añade el título: ");
        String title = scanner.nextLine();
        System.out.print("Añade el autor: ");
        String author = scanner.nextLine();
        System.out.print("Añade el ISBN (una letra mayúscula seguida de tres números): ");
        String isbn = scanner.nextLine();

        try {
            bookManager.createBook(isbn, title, author);
            System.out.println("El libro se ha creado.");
        } catch (IllegalArgumentException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public void printBookList() {
        if (bookManager.getAllBooks().isEmpty()) {
            System.out.println("No hay libros");
        } else {
            bookManager.getAllBooks().forEach(book -> System.out.println(book));
        }
    }

    public void printRemoveBookMenu() {
        System.out.print("ISBN del libro a borrar: ");
        String isbnToDelete = scanner.nextLine();
        bookManager.deleteByIsbn(isbnToDelete);
        System.out.println("Se ha eliminado el libro: " + isbnToDelete);
    }
}
