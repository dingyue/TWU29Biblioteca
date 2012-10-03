package main.user;

import java.util.ArrayList;
import java.util.List;

public class UserList {
    public static List<User> users;

    public UserList() {
        users = new ArrayList<User>();
        users.add(new User("111-1111","dingyue","yding@thoughtworks.com","13991871507",true));
        users.add(new User("111-1112","zhangyaxuan","yaxuan@163.com","15923571830",true));
    }

    public static List<User> getUserList() {
        return new UserList().users;

    }

}
