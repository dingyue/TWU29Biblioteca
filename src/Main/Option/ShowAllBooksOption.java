package main.option;

import main.ColorOutput;
import main.book.Book;
import main.book.BookList;
import main.user.User;

import java.awt.*;

public class ShowAllBooksOption extends Option {
    private static final String BOOKS_INFO = "Below is the booklist:";


    public void showAllBooks() {
        int bookId = 1;
        for (Book book : BookList.getBooks()) {

            ColorOutput.println("<" + bookId + ">" + ":" + book.getName(), Color.RED, Color.BLACK);
            bookId++;
        }
    }

    @Override
    public boolean shouldExecute(int optNum) {
        return optNum == SHOW_All_BOOKS;
    }

    @Override
    public void execute(User currentUser) {
        ColorOutput.println(BOOKS_INFO, Color.CYAN, Color.BLACK);
        showAllBooks();
    }
}
