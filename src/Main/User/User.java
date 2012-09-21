package Main.User;

import Main.Book.Book;
import Main.Book.BookList;

import java.util.ArrayList;
import java.util.List;

public class User {
    protected String libraryNumber;
    protected String password;
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
        collectionList.add(BookList.getBooks().get(bookNumber - 1));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (libraryNumber != null ? !libraryNumber.equals(user.libraryNumber) : user.libraryNumber != null)
            return false;
        if (password != null ? !password.equals(user.password) : user.password != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = libraryNumber != null ? libraryNumber.hashCode() : 0;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }

}
