package Main.User;

import Main.Book.Book;
import Main.Book.BookList;

import java.util.ArrayList;
import java.util.List;

public class User {
    protected String libraryNumber;
    private String password;
    private List<Book> collectionList = new ArrayList<Book>();


    public User(String libraryNumber, String password) {
        this.libraryNumber = libraryNumber;
        this.password = password;
    }

    public String getLibraryNumber() {
        return libraryNumber;
    }

    public String getPassword() {
        return password;
    }

    public void addBookToCollection(int bookNumber) {
        collectionList.add(BookList.getBookList().get(bookNumber - 1));
    }


}
