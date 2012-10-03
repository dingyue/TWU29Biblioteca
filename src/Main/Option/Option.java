package main.option;

import main.user.User;

public abstract class Option {
    public static final int LOGIN = 1;
    public static final int SHOW_All_BOOKS = 2;
    public static final int RESERVE_A_BOOK = 3;
    public static final int CHECK_LIBRARY_NUMBER = 4;
    public static final int SHOW_All_MOVIES = 5;
    public static final int LOGOUT = 6;

    public abstract boolean shouldExecute(int optNum);

    public abstract void execute(User currentUser);

}
