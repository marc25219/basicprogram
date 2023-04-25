package org.program;
import java.util.Scanner;
import arithmetics.Addition;
import arithmetics.Division;
import arithmetics.Multiplication;
import arithmetics.Subtraction;

import static utilities.Utilities.clearScreen;


public class Menu {
    public static int ADDITION = 1;
    public static int SUBTRACTION = 2;
    public static int MULTIPLICATION = 3;
    public static int DIVISION = 4;

    public Menu() {
    }

    public void showBoard() {
        clearScreen();

        System.out.println("#####################");
        System.out.println("#         MENU      #");
        System.out.println("#-------------------#");
        System.out.println("# 1. Addition       #");
        System.out.println("# 2. Subtraction    #");
        System.out.println("# 3. Multiplication #");
        System.out.println("# 4. Division       #");
        System.out.println("#####################");
    }


    public void optionHandler(int option){

        Scanner scanner = new Scanner(System.in);

        clearScreen();

        System.out.println("Introduce your first parameter (1/2): ");
        double x = scanner.nextDouble();
        System.out.println("Introduce your second parameter (2/2): ");
        double y = scanner.nextDouble();

        if (option == ADDITION) {
            Addition addition = new Addition(x, y);
            addition.showResult();
        } else if (option == SUBTRACTION) {
            Subtraction subtraction = new Subtraction(x, y);
            subtraction.showResult();
        } else if (option == MULTIPLICATION) {
            Multiplication multiplication = new Multiplication(x, y);
            multiplication.showResult();
        } else { // DIVISION
            Division division = new Division(x, y);
            division.showResult();
        }
    }
}
