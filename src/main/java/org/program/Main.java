package org.program;

import java.util.Scanner;
import static utilities.Utilities.continueOperation;

public class Main {
    public static void main(String[] args) {

        int option;
        boolean exit;

        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();

        do {
            menu.showBoard();
            option = scanner.nextInt();
            menu.optionHandler(option);
            exit = continueOperation();
        } while (!exit);
    }
}