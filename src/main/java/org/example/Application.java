package org.example;

import java.util.Scanner;

public class Application {
    private final BookManager bookManager;
    private final BookConsoleView consoleView;
    private final Scanner scanner = new Scanner(System.in);

    public Application() {
        this.bookManager = new BookManager();
        this.consoleView = new BookConsoleView(bookManager, scanner);
    }

    public void printMenu() {
        byte option;
        do {
            consoleView.showMainMenu();
            option = Byte.parseByte(scanner.nextLine());
            optionSelector(option);
        } while (option != 4);
    }

    private void optionSelector(byte option) {
        if (option == 1) {
            this.consoleView.printAddBookMenu();
        }
        if (option == 2) {
            this.consoleView.printBookList();
        }
        if (option == 3) {
            this.consoleView.printRemoveBookMenu();
        }
    }
}
