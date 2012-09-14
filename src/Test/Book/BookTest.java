package Test.Book;

import Main.Book.Book;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BookTest {

    @Test
    public void should_get_accurate_book_id() {
        Book book = new Book(1, "java Book");
        assertThat(book.getId(), is(1));

    }

    @Test
    public void should_get_accurate_book_name() {
        Book book = new Book(1, "java Book");
        assertThat(book.getName(), is("java Book"));
    }

    @Test
    public void testToString(){
        Book book = new Book(1, "java Book");
        assertThat(book.toString(), is("id:1 name:java Book"));
    }
}
