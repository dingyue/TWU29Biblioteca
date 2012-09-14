package Main.Book;

import java.util.ArrayList;
import java.util.List;

public class BookList {


    private static List<Book> bookList;

    private BookList() {
        bookList = new ArrayList<Book>();
        bookList.add(new Book(1, "java"));
        bookList.add(new Book(2, "c#"));
        bookList.add(new Book(3, "ruby"));
        bookList.add(new Book(4, "python"));
    }

    public static List<Book> getBookList() {
        return new BookList().bookList;
    }

}
