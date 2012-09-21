package Main.User;

import java.util.ArrayList;
import java.util.List;

public class UserList {
    public static List<User> users;

//    public static void initUserList() {
//        users = new ArrayList<User>();
//        users.add(new User("111-1111","ding yue"));
//        users.add(new User("111-1112","zhang yaxuan"));
//    }


    public UserList() {
        users = new ArrayList<User>();
        users.add(new User("111-1111","dingyue"));
        users.add(new User("111-1112","zhangyaxuan"));
    }

    public static List<User> getUserList() {
        return new UserList().users;

    }

}
