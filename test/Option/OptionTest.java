package Option;

import Main.Option.*;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class OptionTest {
    @Test
    public void should_build_show_all_books_option(){
        assertThat(Option.buildOption(1),is(LoginOption.class));
        assertThat(Option.buildOption(2),is(ShowAllBooksOption.class));
        assertThat(Option.buildOption(3),is(ReserveABookOption.class));
        assertThat(Option.buildOption(4),is(CheckLibraryNumberOption.class));
        assertThat(Option.buildOption(5),is(ShowAllMoviesOption.class));
        assertThat(Option.buildOption(6),is(LogoutOption.class));
    }
}