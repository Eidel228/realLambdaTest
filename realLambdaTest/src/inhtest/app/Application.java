package inhtest.app;


import javax.swing.*;

public class Application {
    public static void run() {

        ConsolePrinter printer = new ConsolePrinter();
        Timer timer = new Timer(3000, printer);
        timer.start();

        JOptionPane.showMessageDialog(null, "Stop?");

    }
}
