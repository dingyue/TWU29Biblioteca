package main.option;

import main.ColorOutput;
import main.Console;
import main.user.User;
import main.user.UserList;

import java.awt.*;
import java.io.PrintStream;

public class LoginOption extends Option {
    public static final String INPUT_LIBRARY_NUMBER_REMAIND = "input your library number pls!";
    public static final String INPUT_PASSWORD_REMAIND = "input your password pls!";
    private static final String LOGIN_SUCCESSFUL_INFO = "you have logged in!";
    private static final String WRONG_LIBRARY_NUMBER_INFO = "wrong libriary number! try again!";
    private static final String WRONG_PASSWARD_INFO = "wrong password! try again!";
    String userInputLibraryNumber;
    String userInputPassword;


    @Override
    public boolean shouldExecute(int optNum) {
        return optNum == LOGIN;
    }

    @Override
    public void execute(User currentUser) {
        Console console = new Console(System.in, new PrintStream(System.out));
        userInputLibraryNumber = console.getNextString(INPUT_LIBRARY_NUMBER_REMAIND);
        if (isValidUsername()) {
            userInputPassword = console.getNextString(INPUT_PASSWORD_REMAIND);
            if (isValidPassword()) {
                currentUser.setLibraryNumber(userInputLibraryNumber);
                currentUser.setPassword(userInputPassword);
                currentUser.setUserLoginStatus(true);
                ColorOutput.println(LOGIN_SUCCESSFUL_INFO, Color.GREEN, Color.BLACK);
            }
        }
    }

    public boolean isValidUsername() {
        for (User user : UserList.getUserList()) {
            if (user.getLibraryNumber().equals(userInputLibraryNumber))
                return true;
        }
        ColorOutput.println(WRONG_LIBRARY_NUMBER_INFO, Color.RED, Color.BLACK);
        return false;
    }

    public boolean isValidPassword() {
        for (User user : UserList.getUserList()) {
            if (user.getPassword().equals(userInputPassword))
                return true;
        }
        ColorOutput.println(WRONG_PASSWARD_INFO, Color.RED, Color.BLACK);
        return false;
    }
}
