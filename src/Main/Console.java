package Main;

import java.util.Scanner;

public class Console {

    //used for option number
    public static int getNextInt(String notifyMessage) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(notifyMessage);
        return scanner.nextInt();
    }

    //uesd for login library number and password
    public static String getNextString(String notifyMessage) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(notifyMessage);
        return scanner.next();
    }

}
