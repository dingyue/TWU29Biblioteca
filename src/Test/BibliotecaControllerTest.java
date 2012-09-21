import Main.BibliotecaController;
import org.junit.Test;

public class BibliotecaControllerTest {
    private BibliotecaController bibliotecaController;
    @Test
    public void setup(){
        bibliotecaController = new BibliotecaController();
    }
//    @Test
//    public void test_show_all_books_option(){
//        Console mockedConsole = Mockito.mock(Console.class);
//        ShowAllBooksOption mockedShowAllBooksOption = Mockito.mock(ShowAllBooksOption.class);
//        bibliotecaController.getOptionNumber(mockedConsole);
//
//        bibliotecaController.buildOption(mockedShowAllBooksOption);
//        verify(mockedShowAllBooksOption).execute(bibliotecaController.user);
//    }


}
