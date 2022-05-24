import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * MorseCodeTranslator Clss Variables :
 * morseCode : allows user to type in a JTextArea
 * englishCode : allows user to type in a JTextArea
 */
public class MorseCodeTranslator extends JFrame {
    private final JTextArea morseCode;
    private final JTextArea englishCode;


    //no argument constructor

    /**
     * Constructor : no inputs
     * initializes the instance variables
     * creates the GUI
     */
    public MorseCodeTranslator(){
        //create title
        super("Morse Code Translator");

        //strings for the initial text in the textboxes
        String m = new String("Type Morse Code here.");
        String e = new String("Type English Code here.");

        //create new text areas and setup the size/text
        morseCode = new JTextArea(m,15,20);
        englishCode = new JTextArea(e,15,20);

        //use boxlayout
        Box box = Box.createHorizontalBox();
        box.add(new JScrollPane(englishCode));
        box.add(new JScrollPane(morseCode));

        //add boxlayout to frame
        add(box);
        //call updatetextbox method
        updateTextBox();
    }

    //updateTextBox method has keylisteners to see when a change was made and calls the correct class accordingly

    /**
     * updateTextBox : no inputs
     * uses keylisteners to see when a change was made and calls the correct class accordingly
     */
    public void updateTextBox(){

        //key listener to see when morsecode text box updates
        morseCode.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent keyEvent) {

            }

            @Override
            public void keyPressed(KeyEvent keyEvent) {

            }

            //once key is released call morsedecode class
            @Override
            public void keyReleased(KeyEvent keyEvent) {
                MorseDecoder m = new MorseDecoder(morseCode.getText());
                englishCode.setText(m.getEnglish());
            }
        });

        //add keylistener for englishcode
        englishCode.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent keyEvent) {

            }

            @Override
            public void keyPressed(KeyEvent keyEvent) {

            }

            //once key is released call englishdecoder class
            @Override
            public void keyReleased(KeyEvent keyEvent) {
                EnglishDecoder e = new EnglishDecoder(englishCode.getText());
                morseCode.setText(e.getMorse());
            }
        });
    }
}
