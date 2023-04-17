package org.program;

import arithmetics.Addition;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int option;

        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        menu.showBoard();

        option = scanner.nextInt();

        if (option == 1) {

            System.out.println("Introduce your first parameter (1/2): ");
            double x = scanner.nextInt();
            System.out.println("Introduce your second parameter (2/2): ");
            double y = scanner.nextInt();

            Addition addition = new Addition(x, y);
            addition.showResult();
        }
    }
}