package main;

import enigma.console.TextAttributes;
import enigma.core.Enigma;

import java.awt.*;

public class ColorOutput {


    private static final enigma.console.Console s_console;

    static {
        s_console = Enigma.getConsole();
    }

    public static void println(String str, Color frontColor, Color backgroundColor) {
        TextAttributes textAttributes = new TextAttributes(frontColor, backgroundColor);
        s_console.setTextAttributes(textAttributes);
        System.out.println(str);
        s_console.setTextAttributes(new TextAttributes(Color.WHITE, Color.BLACK));
    }

}
