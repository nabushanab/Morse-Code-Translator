import javax.swing.*;

public class MorseCodeDriver {
    public static void main(String[] args) {
        //create new window
        MorseCodeTranslator morse = new MorseCodeTranslator();
        morse.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        morse.setVisible(true);
        morse.setSize(800,400);
    }
}
