package main;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Console {

    private InputStream is;
    private Scanner scanner;
    private PrintStream out;

    public Console(InputStream is, PrintStream out) {
        this.is = is;
        this.scanner = new Scanner(is);
        this.out = out;
    }

    public int getNextInt(String notifyMessage) {
        Scanner scanner = new Scanner(is);
        out.println(notifyMessage);
        return scanner.nextInt();
    }

    public String getNextString(String notifyMessage) {
        Scanner scanner = new Scanner(is);
        out.println(notifyMessage);
        return scanner.next();
    }


}
