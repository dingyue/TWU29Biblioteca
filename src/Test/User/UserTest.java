package User;

import Main.User.User;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class UserTest {

    @Test
    public void should_return_accurate_userinfo() throws Exception {
        User user = new User("DY1987","123456");
        assertThat(user.getLibraryNumber(),is("DY1987"));
        assertThat(user.getPassword(),is("123456"));
    }
}
