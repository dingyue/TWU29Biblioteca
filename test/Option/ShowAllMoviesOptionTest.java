package Option;

import Main.Option.ShowAllMoviesOption;
import Main.User.User;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.verify;

public class ShowAllMoviesOptionTest {
    @Mock
    private ShowAllMoviesOption showAllMoviesOption;
    private User user;

    @Before
    public void setUp(){
        showAllMoviesOption = new ShowAllMoviesOption();
        MockitoAnnotations.initMocks(this);
    }

    @Test //verify showAllMoviesOption behaviour
    public void should_return_all_movies_from_console() {
        showAllMoviesOption.execute(user);
        verify(showAllMoviesOption).execute(user);
    }
}
