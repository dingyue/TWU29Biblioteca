package Main.Option;

import Main.ColorOutput;
import Main.Console;
import Main.User.User;
import Main.User.UserList;

import java.awt.*;

public class LoginOption extends Option {
    String userInputLibraryNumber;
    String userInputPassword;
    boolean userLoginStatus = false;

    @Override
    public void execute(User currentUser) {
//        UserList.initUserList();
        userInputLibraryNumber = Console.getNextString("input your library number pls!");
        if (isValidUsername()) {
            userInputPassword = Console.getNextString("input your password pls!");
            if (isValidPassword()) {
                new User(userInputLibraryNumber, userInputPassword);
                userLoginStatus = true;
                ColorOutput.println("you have logged in!", Color.GREEN, Color.BLACK);
            }
        }
//
//        if (isValidUsername() && isValidPassword() ) {
//            new User(userInputLibraryNumber, userInputPassword);
//            userLoginStatus = true;
//            ColorOutput.println("you have logged in!", Color.GREEN, Color.BLACK);
//        }
    }

    private boolean isValidUsername() {
        for (User user : UserList.getUserList()) {
            if (user.getLibraryNumber().equals(userInputLibraryNumber))
                return true;
        }
        ColorOutput.println("wrong libriary number! try again!", Color.RED, Color.BLACK);
        return false;
    }

    private boolean isValidPassword() {
        for (User user : UserList.getUserList()) {
            if (user.getPassword().equals(userInputPassword))
                return true;
        }
        ColorOutput.println("wrong password! try again!", Color.RED, Color.BLACK);
        return false;
    }

    public boolean isUserLoginStatus() {
        return userLoginStatus;
    }


}
