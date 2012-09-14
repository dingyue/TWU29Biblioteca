package Main.Option;

import Main.ColorOutput;
import Main.User.User;

import java.awt.*;

public class CheckLibraryNumberOption extends Option {
    private User user;

    @Override
    public void execute(User currentUser) {

        if (user == null) {
            ColorOutput.println("Please talk to Librarian.Thank you.", Color.RED, Color.BLACK);
        } else {
            ColorOutput.println(currentUser.getLibraryNumber(), Color.RED, Color.BLACK);

        }
    }
}
