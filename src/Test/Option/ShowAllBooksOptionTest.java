package Test.Option;

import Main.Book.BookList;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ShowAllBooksOptionTest {
    @Test
    public void should_return_the_number_of_all_books() {
        assertThat(BookList.getBookList().size(), is(4));
    }

    @Test
    public void should_return_accurate_Book_id() {
        assertThat(BookList.getBookList().get(0).getId(), is(1));
    }

    @Test
    public void should_return_accurate_Book_name() {
        assertThat(BookList.getBookList().get(2).getName(), is("ruby"));
    }
}
