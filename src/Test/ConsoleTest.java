package Test;

import Main.Console;
import org.junit.Before;
import org.mockito.Mockito;

public class ConsoleTest {
    private Console consoleMock;
    @Before
    public void setUp(){
        consoleMock = Mockito.mock(Console.class);
    }
}
