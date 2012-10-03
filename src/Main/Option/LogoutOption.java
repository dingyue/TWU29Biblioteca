package main.option;

import main.user.User;

public class LogoutOption extends Option {

    @Override
    public boolean shouldExecute(int optNum) {
        return optNum == LOGOUT;
    }

    @Override
    public void execute(User currentUser) {
        System.exit(0);
    }
}
