package book;

import main.book.Book;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BookTest {

    @Test
    public void should_get_accurate_book_id() {
        Book book = new Book(1, "java book");
        assertThat(book.getId(), is(1));

    }

    @Test
    public void should_get_accurate_book_name() {
        Book book = new Book(1, "java book");
        assertThat(book.getName(), is("java book"));
    }

    @Test
    public void testToString(){
        Book book = new Book(1, "java book");
        assertThat(book.toString(), is("id:1 name:java book"));
    }
    @Test
    public void testEquals(){
        Book book1 = new Book(1,"java book");
        Book book2 = new Book(1,"java book");
        Book book3 = new Book(2,"java book");
        Book book4 = new Book(1,"c++ book");
        assertThat(book1.equals(book2),is(true));
        assertThat(book1.equals(book3),is(false));
        assertThat(book1.equals(book4),is(false));

    }
}
