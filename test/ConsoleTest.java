import main.Console;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

public class ConsoleTest {

    private Console console;

    @Test
    public void should_get_user_input_string_from_console() {
        String input = "1";
        Console mockedConsole = Mockito.mock(Console.class);
        when(mockedConsole.getNextInt("You are able to select a menu option:")).thenReturn(1);
        assertThat(mockedConsole.getNextInt("You are able to select a menu option:"), is(1));
    }

    @Test
    public void should_show_app_output_information() {
        String input = "1";
        InputStream stdin = System.in;
        PrintStream stdout = System.out;
        try {
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(new ByteArrayOutputStream()));
        } finally {
            System.setOut(stdout);
            System.setIn(stdin);
        }
    }

}
