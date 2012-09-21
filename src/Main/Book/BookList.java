package Main.Book;

import java.util.ArrayList;
import java.util.List;

public class BookList {


    public static List<Book> books;

    public BookList() {
        books = new ArrayList<Book>();
        books.add(new Book(1, "java"));
        books.add(new Book(2, "c#"));
        books.add(new Book(3, "ruby"));
        books.add(new Book(4, "python"));
    }

    public static List<Book> getBooks() {
        return new BookList().books;
    }

}
