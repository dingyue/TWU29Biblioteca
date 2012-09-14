package Main;

import java.util.Scanner;

public class Console {
    public static int getNextInt(String notifyMessage) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(notifyMessage);
        return scanner.nextInt();
    }
}
