import Main.Console;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ConsoleTest {
    private Console mockedConsole;
    private Console console;
    private ByteArrayInputStream bis;
    private ByteArrayOutputStream bos;

    @Before
    public void setUp() {
        mockedConsole = Mockito.mock(Console.class);
    }

//    @Test   //I don't know whether mock is necessary here?
//    public void return_corresponding_option_number_or_when_select_one_option() {
//        when(mockedConsole.getNextInt("You are able to select a menu option:")).thenReturn(5);
//        assertThat(Run.biblioteca.getOptionNumber(mockedConsole), is(5));
//
//        when(mockedConsole.getNextInt("Select a valid option!!")).thenReturn(10);
//        assertThat(Run.biblioteca.getOptionNumber(mockedConsole), is(10));
//    }

    @Test
    public void should_get_user_input_string_from_console() {
        String input = "1";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        assertThat(console.getNextInt("You are able to select a menu option:"), is(1));
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
