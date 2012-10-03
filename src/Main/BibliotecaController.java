package main;

import main.option.*;
import main.user.User;

import java.awt.*;
import java.io.PrintStream;

public class BibliotecaController {
    public static final String LOGIN = "1: LOGIN";
    public static final String SHOW_ALL_BOOKS = "2: SHOW_All_BOOKS";
    public static final String RESERVE_A_BOOK = "3: RESERVE_A_BOOK";
    public static final String CHECK_LIBRARY_NUMBER = "4: CHECK_LIBRARY_NUMBER";
    public static final String SHOW_ALL_MOVIES = "5: SHOW_All_MOVIES";
    public static final String LOGOUT = "6: LOGOUT";
    public static final String SELECT_OPTION = "You are able to select a menu option:";
    public static final String OPTION_OUT_OF_RANGE = "Select a valid option! Try again!";
    public static final String NOTIFY_OPTION_NOT_INT = "should be int! Try again!";
    public User user = new User(null, null, null, null, false);
    int optNum = 0;
    Option[] os = null;

    void bibliotecaStart() {
        showAllMenuOption();
        createSelectedMenuOption();
        runSelectedMenuOption(optNum, os);
    }

    public static void showAllMenuOption() {
        ColorOutput.println(LOGIN, Color.YELLOW, Color.BLACK);
        ColorOutput.println(SHOW_ALL_BOOKS, Color.YELLOW, Color.BLACK);
        ColorOutput.println(RESERVE_A_BOOK, Color.YELLOW, Color.BLACK);
        ColorOutput.println(CHECK_LIBRARY_NUMBER, Color.YELLOW, Color.BLACK);
        ColorOutput.println(SHOW_ALL_MOVIES, Color.YELLOW, Color.BLACK);
        ColorOutput.println(LOGOUT, Color.YELLOW, Color.BLACK);
    }

    public void createSelectedMenuOption() {

        optNum = getOptionNumber(new Console(System.in, new PrintStream(System.out)));
        os = new Option[]{new ShowAllBooksOption(),
                new ReserveABookOption(),
                new CheckLibraryNumberOption(),
                new ShowAllMoviesOption(),
                new LoginOption(),
                new LogoutOption()};
    }

    private void runSelectedMenuOption(int optNum, Option[] os) {
        for (Option o : os) {
            if (o.shouldExecute(optNum)) {
                o.execute(user);
            }
        }
    }

    public int getOptionNumber(Console console) {
        try {
            int inputNumber = console.getNextInt(SELECT_OPTION);
            while (!isValidOption(inputNumber))
                inputNumber = console.getNextInt(OPTION_OUT_OF_RANGE);
            return inputNumber;
        } catch (Exception e) {
            ColorOutput.println(NOTIFY_OPTION_NOT_INT, Color.RED, Color.BLACK);
            return 0;
        }
    }

    boolean isValidOption(int inputNumber) {
        return inputNumber > 0 && inputNumber <= Option.LOGOUT;
    }

}

