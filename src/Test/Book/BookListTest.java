package Book;

import Main.Book.Book;
import Main.Book.BookList;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.hasItem;

public class BookListTest {

    private List<Book> bookList;

    @Test
    public void should_return_book_id_when_get_one_book_which_is_in_booklist() {
        bookList = BookList.getBooks();
        assertThat(bookList.get(0).getId(), is(1));
    }

    @Test
    public void should_return_book_name_when_get_one_book_which_is_in_booklist() {
        bookList = BookList.getBooks();
        assertThat(bookList.get(0).getName(), is("java"));
    }

    @Test
    public void should_return_accurate_bookListSize() {
        bookList = BookList.getBooks();
        assertThat(bookList.size(), is(4));
    }
    @Test
    public void should_add_default_books_when_init_the_bookList() {
        Book book = new Book(1, "java");
        BookList bookList = new BookList();
        assertThat(bookList.books, hasItem(book));
    }

}
