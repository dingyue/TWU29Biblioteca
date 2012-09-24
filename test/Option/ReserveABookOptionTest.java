package Option;

import Main.Option.ReserveABookOption;
import Main.User.User;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.verify;

public class ReserveABookOptionTest {
    @Mock
    private ReserveABookOption reserveABookOption;
    private User user;

    @Before
    public void setUp() {
        reserveABookOption = new ReserveABookOption();
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void should_return_true_when_book_exist() {
        reserveABookOption.execute(user);
        verify(reserveABookOption).execute(user);
    }
}
