package Main;

import Main.Option.Option;
import Main.User.User;

import java.awt.*;

public class BibliotecaController {
    private Option option;
    User user = new User(null, null);

    void bibliotecaStart() {
        showAllMenuOption();
        createSelectedMenuOption();
        runSelectedMenuOption();
    }

    void runSelectedMenuOption() {
        option.execute(user);
    }

    private static void showAllMenuOption() {
        ColorOutput.println("1: SHOW_All_BOOKS", Color.YELLOW, Color.BLACK);
        ColorOutput.println("2: RESERVE_A_BOOK", Color.YELLOW, Color.BLACK);
        ColorOutput.println("3: CHECK_LIBRARY_NUMBER", Color.YELLOW, Color.BLACK);
        ColorOutput.println("4: LOGOUT", Color.YELLOW, Color.BLACK);
    }

    private void createSelectedMenuOption() {
        option = Option.buildOption(getOptionNumber(new Console()));
    }

    int getOptionNumber(Console console) {
        int inputNumber = console.getNextInt("You are able to select a menu option:");
        while (!isValidOption(inputNumber))
            inputNumber = Console.getNextInt("Select a valid option!!");
        return inputNumber;
    }
    boolean isValidOption(int inputNumber) {
        return inputNumber > 0 && inputNumber <= Option.LOGOUT;
    }
}

