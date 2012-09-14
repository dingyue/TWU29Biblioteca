package Main.Option;


import Main.Book.BookList;
import Main.ColorOutput;
import Main.Console;
import Main.User.User;

import java.awt.*;

public class ReserveABookOption extends Option {
    public static final String INPUT_THE_BOOK_ID_WHEN_RESERVE = "Input the book number you want to reserve:";
    public static final String BOOK_IS_NOT_AVAILABLE_INFO = "Sorry we don't have that book yet.";
    public static final String RESERVE_BOOK_SUCCESS_INFO = "Thank You! Enjoy the book.";

    private void reserveBook() {
        int bookNumber = getInputCommand(new Console());
        if (!isBookExist(bookNumber)) {
            ColorOutput.println(BOOK_IS_NOT_AVAILABLE_INFO, Color.RED, Color.BLACK);
        } else {
            reserveTheBookSelected(bookNumber);
        }
    }

    public static boolean isBookExist(int bookNumber) {
        return bookNumber > 0 && bookNumber <= BookList.getBookList().size();
    }

    private void reserveTheBookSelected(int bookNumber) {
        User user = new User(null,null);
        user.addBookToCollection(bookNumber);
        ColorOutput.println(RESERVE_BOOK_SUCCESS_INFO, Color.GREEN, Color.BLACK);

    }

    private int getInputCommand(Console console) {
        return console.getNextInt(INPUT_THE_BOOK_ID_WHEN_RESERVE + "from 1 to " + BookList.getBookList().size());
    }

    @Override
    public void execute(User currentUser) {
        reserveBook();
    }


}
