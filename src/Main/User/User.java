package main.user;

import main.book.Book;
import main.book.BookList;

import java.util.ArrayList;
import java.util.List;

public class User {
    protected String libraryNumber;
    protected String password;
    protected String email;
    protected String phoneNumber;
    private  boolean userLoginStatus;

    public boolean isUserLoginStatus() {
        return userLoginStatus;
    }

    public void setUserLoginStatus(boolean userLoginStatus) {
        this.userLoginStatus = userLoginStatus;
    }

    private List<Book> collectionList = new ArrayList<Book>();


    public void setLibraryNumber(String libraryNumber) {
        this.libraryNumber = libraryNumber;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public User(String libraryNumber, String password, String email, String phoneNumber, boolean userLoginStatus) {
        this.libraryNumber = libraryNumber;
        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.userLoginStatus = userLoginStatus;
    }

//    public user(String libraryNumber, String password, boolean userLoginStatus) {
//        this.libraryNumber = libraryNumber;
//        this.password = password;
//        this.userLoginStatus = userLoginStatus;
//
//    }

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

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
