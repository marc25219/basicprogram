package utilities;
import java.util.Scanner;

public class Utilities {
    public static void clearScreen() {
        try {
            System.out.print("\033[H\033[2J");
            System.out.flush();
        } catch (Exception e) {
            System.out.println("Error al limpiar la pantalla: " + e.getMessage());
        }
    }

    public static boolean continueOperation() {

        System.out.println("Do you want continue? [Y/N]: ");
        Scanner scanner = new Scanner(System.in);
        String userAnswer = scanner.next();

        return !userAnswer.equals("Y");
    }
}
