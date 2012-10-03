package option;

import main.ColorOutput;
import main.option.CheckLibraryNumberOption;
import main.user.User;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.awt.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class CheckLibraryNumberOptionTest {
    @Mock
    private CheckLibraryNumberOption checkLibraryNumberOption;
    private User user;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        checkLibraryNumberOption = new CheckLibraryNumberOption();
    }

    @Test
    public void should_return_info_when_user_not_login() {
        user = new User(null, null, null, null, false);
        checkLibraryNumberOption.execute(user);
        verify(mock(ColorOutput.class)).println("Please talk to Librarian.Thank you.", Color.RED, Color.BLACK);
    }


}
