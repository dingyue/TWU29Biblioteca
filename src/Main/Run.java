package Main;

import java.awt.*;

public class Run {

    public static final String WELCOME_MESSAGE = "Welcome to Bangalore Public Library System!";

    private static BibliotecaController biblioteca;

    static {
        biblioteca = new BibliotecaController();
    }

    private static void showWelcome() {
        ColorOutput.println(WELCOME_MESSAGE, Color.MAGENTA, Color.BLACK);
    }

    public static void main(String[] args) {
        showWelcome();
        while (true) {
            biblioteca.bibliotecaStart();
            }
    }

}
