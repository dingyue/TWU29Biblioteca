package option;

import main.option.ShowAllBooksOption;
import main.user.User;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.verify;

public class ShowAllBooksOptionTest {

    @Mock
    private ShowAllBooksOption showAllBooksOption;
    private User user;

    @Before
    public void setUp(){
        showAllBooksOption = new ShowAllBooksOption();
        MockitoAnnotations.initMocks(this);
    }
    @Test
    public void should_show_books_when_user_select_show_all_books_option(){
        showAllBooksOption.execute(user);
        verify(showAllBooksOption).execute(user);
    }

}

