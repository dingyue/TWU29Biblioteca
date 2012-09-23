package Main.Option;

import Main.ColorOutput;
import Main.User.User;
import Main.User.UserList;

import java.awt.*;

public class CheckLibraryNumberOption extends Option {
    private static final String THE_USER_DOES_NOT_IN_THE_USER_LIST_INFO = "Please talk to Librarian.Thank you.";

    @Override
    public void execute(User currentUser) {

        if (!currentUser.isUserLoginStatus()) {
            showHaveNotLoginInfo();
        } else {
            returnEmailAndPhoneNumber(currentUser);
            showUserDetailsInfoWhenLogin(currentUser);

        }
    }

    public void showUserDetailsInfoWhenLogin(User currentUser) {
        ColorOutput.println("Welcome " + currentUser.getLibraryNumber() + " " + currentUser.getEmail() + " " + currentUser.getPhoneNumber(), Color.RED, Color.BLACK);
    }

    public void showHaveNotLoginInfo() {
        ColorOutput.println(THE_USER_DOES_NOT_IN_THE_USER_LIST_INFO, Color.RED, Color.BLACK);
    }

    private void returnEmailAndPhoneNumber(User currentUser) {
        for (User user : UserList.getUserList()) {
            if (user.getLibraryNumber().equals(currentUser.getLibraryNumber())) {
                currentUser.setEmail(user.getEmail());
                currentUser.setPhoneNumber(user.getPhoneNumber());
            }
        }
    }
}
