package Option;

import Main.Console;
import Main.Option.LoginOption;
import Main.User.User;

import org.junit.Test;
import org.mockito.Mockito;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

public class LoginOptionTest {
    LoginOption loginOption;
    User user;

    @Test
    public void should_login_when_user_input_accurate_library_number_and_password(){

        Console mockedConsole = Mockito.mock(Console.class);
        when(mockedConsole.getNextString("input your library number pls!")).thenReturn("111-1111");
        user.setLibraryNumber(mockedConsole.getNextString("input your library number pls!"));
        when(mockedConsole.getNextString("input your password pls!")).thenReturn("ding yue");
        user.setPassword(mockedConsole.getNextString("input your library number pls!"));
        assertThat(user,is(new User("111-1111","ding yue",null,null,true)));
        loginOption.execute(user);
        assertThat(user.isUserLoginStatus(),is(true));
    }
}
