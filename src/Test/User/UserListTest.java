package User;

import Main.User.User;
import Main.User.UserList;
import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.hasItem;

public class UserListTest {
    @Test
    public void should_add_default_users_when_init_the_userList(){
        User user = new User("111-1111","dingyue","yding@thoughtworks.com","13991871507",false);
        UserList userList = new UserList();
        assertThat(userList.users,hasItem(user));
    }
}
