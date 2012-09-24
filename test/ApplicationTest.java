import org.mockito.Mock;
import org.junit.Test;

import java.io.Console;

public class ApplicationTest {
    @Mock
    private Console mockConsole;
    @Test
    public void should_show_welcome_when_user_start_application(){
        //verify(mockConsole).show(WELCOME_MESSAGE);
    }

}
