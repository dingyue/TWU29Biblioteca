package Option;

import Main.Option.ShowAllMoviesOption;
import Main.User.User;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.verify;

public class ShowAllMoviesOptionTest {
    @Mock
    private ShowAllMoviesOption showAllMoviesOption;
    private User user;

    @Test
    public void should_return_all_movies_from_console() {
        MockitoAnnotations.initMocks(this);
        showAllMoviesOption = new ShowAllMoviesOption();
        verify(showAllMoviesOption).execute(user);
    }
}
