import java.util.Locale;

//english decoder class converts englishcode to morse code

/**
 * EnglishDecoder Class Variables:
 * english : string that holds the english code
 * morse : string that holds the morse code
 * validity : must be true for conversion to work properly
 */
public class EnglishDecoder {
    //initialize instance varibles
    private String english;
    private String morse;
    private boolean validity = true;

    //single argument constructor
    //inputs the english code as a string to convert

    /**
     * constructor : initializes the instance variables and creates useful variables
     * @param e : String input of the english code to translate
     */
    public EnglishDecoder(String e){
        //change to all uppercase since morsecode is case-insensitive
        e = e.toUpperCase(Locale.ROOT);
        //set englishcode to the string input
        english = e;
        //set morsecode to blank
        morse = "";


        //call edecode method which will decode the english code
        eDecode();
        //if validity returns false:eror message
        if(validity == false){
            morse = "INVALID TEXT ENTRY: ONLY USE A-Z AND 0-9 CHARACTERS.";
        }
    }

    //getter methods

    /**
     * getEnglish
     * @return : returns english code.
     */
    public String getEnglish(){return english;}

    /**
     * getMorse
     * @return : returns the morse code.
     */
    public String getMorse(){return morse;}


    //englishdecoder method

    /**
     * eDecode : decodes the english code
     */
    public void eDecode(){
        //initialize char variable
        char currentChar;

        //hardcode the conversion
        for(int i = 0; i < english.length(); i++){
            currentChar = english.charAt(i);
            if(currentChar == 'A'){
                morse += ".- ";
            }
            else if(currentChar == 'B'){
                morse += "-... ";
            }
            else if(currentChar == 'C'){
                morse += "-.-. ";
            }
            else if(currentChar == 'D'){
                morse += "-.. ";
            }
            else if(currentChar == 'E'){
                morse += ". ";
            }
            else if(currentChar == 'F'){
                morse += "..-. ";
            }
            else if(currentChar == 'G'){
                morse += "--. ";
            }
            else if(currentChar == 'H'){
                morse += ".... ";
            }
            else if(currentChar == 'I'){
                morse += ".. ";
            }
            else if(currentChar == 'J'){
                morse += ".--- ";
            }
            else if(currentChar == 'K'){
                morse += "-.- ";
            }
            else if(currentChar == 'L'){
                morse += ".-.. ";
            }
            else if(currentChar == 'M'){
                morse += "-- ";
            }
            else if(currentChar == 'N'){
                morse += "-. ";
            }
            else if(currentChar == 'O'){
                morse += "--- ";
            }
            else if(currentChar == 'P'){
                morse += ".--. ";
            }
            else if(currentChar == 'Q'){
                morse += "--.- ";
            }
            else if(currentChar == 'R'){
                morse += ".-. ";
            }
            else if(currentChar == 'S'){
                morse += "... ";
            }
            else if(currentChar == 'T'){
                morse += "- ";
            }
            else if(currentChar == 'U'){
                morse += "..- ";
            }
            else if(currentChar == 'V'){
                morse += "...- ";
            }
            else if(currentChar == 'W'){
                morse += ".-- ";
            }
            else if(currentChar == 'X'){
                morse += "-..- ";
            }
            else if(currentChar == 'Y'){
                morse += "-.-- ";
            }
            else if(currentChar == 'Z'){
                morse += "--.. ";
            }
            else if(currentChar == '1'){
                morse += ".---- ";
            }
            else if(currentChar == '2'){
                morse += "..--- ";
            }
            else if(currentChar == '3'){
                morse += "...-- ";
            }
            else if(currentChar == '4'){
                morse += "....- ";
            }
            else if(currentChar == '5'){
                morse += "..... ";
            }
            else if(currentChar == '6'){
                morse += "-.... ";
            }
            else if(currentChar == '7'){
                morse += "--... ";
            }
            else if(currentChar == '8'){
                morse += "---.. ";
            }
            else if(currentChar == '9'){
                morse += "----. ";
            }
            else if(currentChar == '0'){
                morse += "----- ";
            }
            else if(currentChar == ' '){
                morse += "  ";
            }
            else if(currentChar == '\n'){
                morse += "\n";
            }
            //if code doesnt contain these characters then validity is false
            else{
                validity = false;
                return;
            }
        }
    }
}
