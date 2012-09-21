package Option;

import Main.Option.ReserveABookOption;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ReserveABookOptionTest {
    @Test
    public void should_return_true_when_book_exist(){
        assertThat(ReserveABookOption.isBookExist(2),is(true));
    }
}
