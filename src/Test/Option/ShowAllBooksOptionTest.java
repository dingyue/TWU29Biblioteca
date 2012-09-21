package Option;

import Main.Book.BookList;
import Main.Option.ShowAllBooksOption;
import Main.User.User;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.verify;

public class ShowAllBooksOptionTest {
    @Test
    public void should_return_the_number_of_all_books() {
        assertThat(BookList.getBooks().size(), is(4));
    }

    @Test
    public void should_return_accurate_Book_id() {
        assertThat(BookList.getBooks().get(0).getId(), is(1));
    }

    @Test
    public void should_return_accurate_Book_name() {
        assertThat(BookList.getBooks().get(2).getName(), is("ruby"));
    }
    @Mock
    private ShowAllBooksOption showAllBooksOption;
    private User user;

    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);
        showAllBooksOption = new ShowAllBooksOption();
    }
    @Test
    public void should_show_books_when_user_select_show_all_books_option(){
        verify(showAllBooksOption).execute(user);
    }

}

