package main.option;


import main.ColorOutput;
import main.Console;
import main.book.BookList;
import main.user.User;

import java.awt.*;
import java.io.PrintStream;

public class ReserveABookOption extends Option {
    private static final String INPUT_THE_BOOK_ID_WHEN_RESERVE = "Input the book number you want to reserve:";
    private static final String BOOK_IS_NOT_AVAILABLE_INFO = "Sorry we don't have that book yet.";
    private static final String RESERVE_BOOK_SUCCESS_INFO = "Thank You! Enjoy the book.";
    private static final String NOT_LOG_IN_INFO = "You can reserve book only when you login in!Login first pls!";


    private void reserveBook() {
        int bookNumber = getInputCommand(new Console(System.in, new PrintStream(System.out)));
        if (!isBookExist(bookNumber)) {
            ColorOutput.println(BOOK_IS_NOT_AVAILABLE_INFO, Color.RED, Color.BLACK);
        } else {
            reserveTheBookSelected(bookNumber);
        }
    }

    private static boolean isBookExist(int bookNumber) {
        return bookNumber > 0 && bookNumber <= BookList.getBooks().size();
    }

    private void reserveTheBookSelected(int bookNumber) {
        User user = new User(null, null, null, null, false);
        user.addBookToCollection(bookNumber);
        ColorOutput.println(RESERVE_BOOK_SUCCESS_INFO, Color.GREEN, Color.BLACK);
    }

    private int getInputCommand(Console console) {
        return console.getNextInt(INPUT_THE_BOOK_ID_WHEN_RESERVE + "from 1 to " + BookList.getBooks().size());
    }

    @Override
    public boolean shouldExecute(int optNum) {
        return optNum == RESERVE_A_BOOK;
    }

    @Override
    public void execute(User currentUser) {
        if (!currentUser.isUserLoginStatus()) {
            ColorOutput.println(NOT_LOG_IN_INFO, Color.RED, Color.BLACK);
        } else {
            reserveBook();
        }
    }


}
