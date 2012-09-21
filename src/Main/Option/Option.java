package Main.Option;

import Main.User.User;

public abstract class Option {
    public static final int SHOW_All_BOOKS = 1;
    public static final int RESERVE_A_BOOK = 2;
    public static final int CHECK_LIBRARY_NUMBER = 3;
    public static final int LOGOUT = 4;
    public static final int SHOW_All_MOVIES = 5;
    public static final int LOG_IN = 6;


    public static Option buildOption(int optionNumber) {
        switch (optionNumber) {
            case SHOW_All_BOOKS:
                return new ShowAllBooksOption();
            case RESERVE_A_BOOK:
                return new ReserveABookOption();
            case CHECK_LIBRARY_NUMBER:
                return new CheckLibraryNumberOption();
            case SHOW_All_MOVIES:
                return new ShowAllMoviesOption();
            case LOG_IN:
                return new LoginOption();
            case LOGOUT:
                return new LogoutOption();
            default:
                return null;
        }

    }

    public abstract void execute(User currentUser);

}
