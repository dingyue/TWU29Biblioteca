package Main.Option;

import Main.Book.Book;
import Main.Book.BookList;
import Main.ColorOutput;
import Main.User.User;

import java.awt.*;

public class ShowAllBooksOption extends Option{

    public void showAllBooks(){
        int bookId = 1;
        for(Book book : BookList.getBooks()) {

            ColorOutput.println("<" + bookId +">" + ":" +book.getName(),Color.RED,Color.BLACK);
            bookId++;
        }
    }

    @Override
    public void execute(User currentUser) {
        ColorOutput.println("Below is the booklist:",Color.CYAN, Color.BLACK);
        showAllBooks();
    }
}
