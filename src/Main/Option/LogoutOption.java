package Main.Option;

import Main.User.User;

public class LogoutOption extends Option {

    @Override
    public void execute(User currentUser) {
        System.exit(-1);
    }
}
