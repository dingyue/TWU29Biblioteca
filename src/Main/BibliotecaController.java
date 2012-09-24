package Main;

import Main.Option.Option;
import Main.User.User;

import java.awt.*;

public class BibliotecaController {
    private Option option;
    public User user = new User(null, null, null, null, false);

    void bibliotecaStart() {
        showAllMenuOption();
        createSelectedMenuOption();
        runSelectedMenuOption();
    }

    public void runSelectedMenuOption() {
        option.execute(user);
    }

    private static void showAllMenuOption() {
        ColorOutput.println("1: LOGIN", Color.YELLOW, Color.BLACK);
        ColorOutput.println("2: SHOW_All_BOOKS", Color.YELLOW, Color.BLACK);
        ColorOutput.println("3: RESERVE_A_BOOK", Color.YELLOW, Color.BLACK);
        ColorOutput.println("4: CHECK_LIBRARY_NUMBER", Color.YELLOW, Color.BLACK);
        ColorOutput.println("5: SHOW_All_MOVIES", Color.YELLOW, Color.BLACK);
        ColorOutput.println("6: LOGOUT", Color.YELLOW, Color.BLACK);
    }

    public void createSelectedMenuOption() {
        option = Option.buildOption(getOptionNumber(new Console()));
    }

    public int getOptionNumber(Console console) {
        int inputNumber = console.getNextInt("You are able to select a menu option:");
        while (!isValidOption(inputNumber))
            inputNumber = Console.getNextInt("Select a valid option!!");
        return inputNumber;
    }

    //when input "-""+" something like this ,it has a inner exception ,I will solve it later
    boolean isValidOption(int inputNumber) {
        return inputNumber > 0 && inputNumber <= Option.LOGOUT;
    }

}

