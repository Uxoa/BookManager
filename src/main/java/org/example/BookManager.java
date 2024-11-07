package org.example;

import java.util.ArrayList;

public class BookManager {
    private final ArrayList<Book> bookList = new ArrayList<>();

    public void createBook(String isbn, String title, String author) {
        // Validación de formato del ISBN: Una letra mayúscula seguida de tres números
        if (!isbn.matches("^[A-Z]\\d{3}$")) {
            throw new IllegalArgumentException("El ISBN debe comenzar con una letra mayúscula seguida de tres números (por ejemplo, A123)");
        }

        // Comprobar si el ISBN ya existe en la lista de libros
        if (bookList.stream().anyMatch(book -> book.getIsbn().equals(isbn))) {
            throw new IllegalArgumentException("Este libro ya existe");
        }

        // Crear y añadir el libro a la lista si pasa la validación
        Book newBook = new Book(isbn, title, author);
        bookList.add(newBook);
    }

    public void deleteByIsbn(String isbnToDelete) {
        bookList.removeIf(book -> book.getIsbn().equals(isbnToDelete));
    }

    public ArrayList<Book> getAllBooks() {
        return new ArrayList<>(bookList);
    }
}
