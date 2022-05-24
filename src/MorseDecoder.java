
//morse code decoder class

/**
 * MorseDecoder Class Variables
 * english : String that holds the english code.
 * morse : String that holds the morse code.
 * morseArray : char array that holds the morse code.
 * validity : must be true for a proper conversion
 * m :
 */
public class MorseDecoder {
    //initialize instance variables
    private String english;
    private String morse;
    private char[] morseArray;
    private boolean validity = true;

    //string input constructor

    /**
     * constructor : initializes instance variables and creates useful variables.
     * @param m : input is a string which contains the morse code to convert.
     */
    public MorseDecoder(String m){
        //set english code to blank and morse code to the string input
        english = "";
        morse = m;


        //initialize the length of the morsearray which will hold the morse code
        //must add 5 to length, otherwise the mdecode method will create an arrayoutofboundsexception
        morseArray = new char[m.length() + 5];

        //convert the string morsecode to an array for easier use
        for(int i = 0; i < m.length(); i++){
            morseArray[i] = m.charAt(i);
        }

        //call morsedecoder method
        mDecode();

        //error message if code is not valid
        if(validity == false){
            english = "INVALID TEXT ENTRY: UNRECOGNIZED MORSE CODE." +
                    "\n Remember letters must end with a space\n and words must end with three spaces!";
        }
    }
    //getter methods

    /**
     * getMorse
     * @return : returns the Morse code.
     */
    public String getMorse(){return morse;}

    /**
     * getEnglish
     * @return : returns the English code.
     */
    public String getEnglish(){return english;}

    //morsedecoder method converts the morsecode to english code

    /**
     * mDecode : decodes the english code and stores both variables in the instance variables.
     */
    public void mDecode(){
        int i = 0;

        //hardcode the conversions
        while(i < morseArray.length){

            if(morseArray[i] == '.' &&
            morseArray[i + 1] == '-' &&
            morseArray[i + 2] == ' '){
                i += 3;
                english += "A";
            }

            else if(     morseArray[i] == '-' &&
                    morseArray[i + 1] == '.' &&
                    morseArray[i + 2] == '.' &&
                    morseArray[i + 3] == '.' &&
                    morseArray[i + 4] == ' '){
                i += 5;
                english += "B";
            }

            else if(     morseArray[i] == '-' &&
                    morseArray[i + 1] == '.' &&
                    morseArray[i + 2] == '-' &&
                    morseArray[i + 3] == '.' &&
                    morseArray[i + 4] == ' '){
                i += 5;
                english += "C";
            }

            else if(     morseArray[i] == '-' &&
                    morseArray[i + 1] == '.' &&
                    morseArray[i + 2] == '.' &&
                    morseArray[i + 3] == ' '){
                i += 4;
                english += "D";
            }

            else if(     morseArray[i] == '.' &&
                    morseArray[i + 1] == ' '){
                i += 2;
                english += "E";
            }

            else if(     morseArray[i] == '.' &&
                    morseArray[i + 1] == '.' &&
                    morseArray[i + 2] == '-' &&
                    morseArray[i + 3] == '.' &&
                    morseArray[i + 4] == ' '){
                i += 5;
                english += "F";
            }

            else if(     morseArray[i] == '-' &&
                    morseArray[i + 1] == '-' &&
                    morseArray[i + 2] == '.' &&
                    morseArray[i + 3] == ' '){
                i += 4;
                english += "G";
            }

            else if(     morseArray[i] == '.' &&
                    morseArray[i + 1] == '.' &&
                    morseArray[i + 2] == '.' &&
                    morseArray[i + 3] == '.' &&
                    morseArray[i + 4] == ' '){
                i += 5;
                english += "H";
            }

            else if(     morseArray[i] == '.' &&
                    morseArray[i + 1] == '.' &&
                    morseArray[i + 2] == ' '){
                i += 3;
                english += "I";
            }

            else if(     morseArray[i] == '.' &&
                    morseArray[i + 1] == '-' &&
                    morseArray[i + 2] == '-' &&
                    morseArray[i + 3] == '-' &&
                    morseArray[i + 4] == ' '){
                i += 5;
                english += "J";
            }

            else if(     morseArray[i] == '-' &&
                    morseArray[i + 1] == '.' &&
                    morseArray[i + 2] == '-' &&
                    morseArray[i + 3] == ' '){
                i += 4;
                english += "K";
            }

            else if(     morseArray[i] == '.' &&
                    morseArray[i + 1] == '-' &&
                    morseArray[i + 2] == '.' &&
                    morseArray[i + 3] == '.' &&
                    morseArray[i + 4] == ' '){
                i += 5;
                english += "L";
            }

            else if(     morseArray[i] == '-' &&
                    morseArray[i + 1] == '-' &&
                    morseArray[i + 2] == ' '){
                i += 3;
                english += "M";
            }

            else if(     morseArray[i] == '-' &&
                    morseArray[i + 1] == '.' &&
                    morseArray[i + 2] == ' '){
                i += 3;
                english += "N";
            }

            else if(     morseArray[i] == '-' &&
                    morseArray[i + 1] == '-' &&
                    morseArray[i + 2] == '-' &&
                    morseArray[i + 3] == ' '){
                i += 4;
                english += "O";
            }

            else if(     morseArray[i] == '.' &&
                    morseArray[i + 1] == '-' &&
                    morseArray[i + 2] == '-' &&
                    morseArray[i + 3] == '.' &&
                    morseArray[i + 4] == ' '){
                i += 5;
                english += "P";
            }

            else if(     morseArray[i] == '-' &&
                    morseArray[i + 1] == '-' &&
                    morseArray[i + 2] == '.' &&
                    morseArray[i + 3] == '-' &&
                    morseArray[i + 4] == ' '){
                i += 5;
                english += "Q";
            }

            else if(     morseArray[i] == '.' &&
                    morseArray[i + 1] == '-' &&
                    morseArray[i + 2] == '.' &&
                    morseArray[i + 3] == ' '){
                i += 4;
                english += "R";
            }

            else if(     morseArray[i] == '.' &&
                    morseArray[i + 1] == '.' &&
                    morseArray[i + 2] == '.' &&
                    morseArray[i + 3] == ' '){
                i += 4;
                english += "S";
            }

            else if(     morseArray[i] == '-' &&
                    morseArray[i + 1] == ' '){
                i += 2;
                english += "T";
            }

            else if(     morseArray[i] == '.' &&
                    morseArray[i + 1] == '.' &&
                    morseArray[i + 2] == '-' &&
                    morseArray[i + 3] == ' '){
                i += 4;
                english += "U";
            }

            else if(     morseArray[i] == '.' &&
                    morseArray[i + 1] == '.' &&
                    morseArray[i + 2] == '.' &&
                    morseArray[i + 3] == '-' &&
                    morseArray[i + 4] == ' '){
                i += 5;
                english += "V";
            }

            else if(     morseArray[i] == '.' &&
                    morseArray[i + 1] == '-' &&
                    morseArray[i + 2] == '-' &&
                    morseArray[i + 3] == ' '){
                i += 4;
                english += "W";
            }

            else if(     morseArray[i] == '-' &&
                    morseArray[i + 1] == '.' &&
                    morseArray[i + 2] == '.' &&
                    morseArray[i + 3] == '-' &&
                    morseArray[i + 4] == ' '){
                i += 5;
                english += "X";
            }

            else if(     morseArray[i] == '-' &&
                    morseArray[i + 1] == '.' &&
                    morseArray[i + 2] == '-' &&
                    morseArray[i + 3] == '-' &&
                    morseArray[i + 4] == ' '){
                i += 5;
                english += "Y";
            }

            else if(     morseArray[i] == '-' &&
                    morseArray[i + 1] == '-' &&
                    morseArray[i + 2] == '.' &&
                    morseArray[i + 3] == '.' &&
                    morseArray[i + 4] == ' '){
                i += 5;
                english += "Z";
            }

            else if(     morseArray[i] == '.' &&
                    morseArray[i + 1] == '-' &&
                    morseArray[i + 2] == '-' &&
                    morseArray[i + 3] == '-' &&
                    morseArray[i + 4] == '-' &&
                    morseArray[i + 5] == ' '){
                i += 6;
                english += "1";
            }

            else if(     morseArray[i] == '.' &&
                    morseArray[i + 1] == '.' &&
                    morseArray[i + 2] == '-' &&
                    morseArray[i + 3] == '-' &&
                    morseArray[i + 4] == '-' &&
                    morseArray[i + 5] == ' '){
                i += 6;
                english += "2";
            }

            else if(     morseArray[i] == '.' &&
                    morseArray[i + 1] == '.' &&
                    morseArray[i + 2] == '.' &&
                    morseArray[i + 3] == '-' &&
                    morseArray[i + 4] == '-' &&
                    morseArray[i + 5] == ' '){
                i += 6;
                english += "3";
            }

            else if(     morseArray[i] == '.' &&
                    morseArray[i + 1] == '.' &&
                    morseArray[i + 2] == '.' &&
                    morseArray[i + 3] == '.' &&
                    morseArray[i + 4] == '-' &&
                    morseArray[i + 5] == ' '){
                i += 6;
                english += "4";
            }

            else if(     morseArray[i] == '.' &&
                    morseArray[i + 1] == '.' &&
                    morseArray[i + 2] == '.' &&
                    morseArray[i + 3] == '.' &&
                    morseArray[i + 4] == '.' &&
                    morseArray[i + 5] == ' '){
                i += 6;
                english += "5";
            }

            else if(     morseArray[i] == '-' &&
                    morseArray[i + 1] == '.' &&
                    morseArray[i + 2] == '.' &&
                    morseArray[i + 3] == '.' &&
                    morseArray[i + 4] == '.' &&
                    morseArray[i + 5] == ' '){
                i += 6;
                english += "6";
            }

            else if(     morseArray[i] == '-' &&
                    morseArray[i + 1] == '-' &&
                    morseArray[i + 2] == '.' &&
                    morseArray[i + 3] == '.' &&
                    morseArray[i + 4] == '.' &&
                    morseArray[i + 5] == ' '){
                i += 6;
                english += "7";
            }

            else if(     morseArray[i] == '-' &&
                    morseArray[i + 1] == '-' &&
                    morseArray[i + 2] == '-' &&
                    morseArray[i + 3] == '.' &&
                    morseArray[i + 4] == '.' &&
                    morseArray[i + 5] == ' '){
                i += 6;
                english += "8";
            }

            else if(     morseArray[i] == '-' &&
                    morseArray[i + 1] == '-' &&
                    morseArray[i + 2] == '-' &&
                    morseArray[i + 3] == '-' &&
                    morseArray[i + 4] == '.' &&
                    morseArray[i + 5] == ' '){
                i += 6;
                english += "9";
            }

            else if(     morseArray[i] == '-' &&
                    morseArray[i + 1] == '-' &&
                    morseArray[i + 2] == '-' &&
                    morseArray[i + 3] == '-' &&
                    morseArray[i + 4] == '-' &&
                    morseArray[i + 5] == ' '){
                i += 6;
                english += "0";
            }

            else if(     morseArray[i] == ' ' &&
                    morseArray[i + 1] == ' ' ){
                i += 2;
                english += " ";
            }

            else if(morseArray[i] == '\n'){
                i++;
                english += "\n";
            }

            else if(morseArray[i] == '\u0000'){
                break;
            }

            //if the morse code is not any of these then it must be invalid
            //return invalid
            else{
                validity = false;
                return;
            }

        }
    }

}
