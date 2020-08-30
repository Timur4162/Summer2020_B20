package day10_ifStatements;

public class Character_Identify {
    public static void main(String[] args) {

        char character = 'g';
                            // 65 <= character <= 90      ||    97<= character <= 122
        boolean isAlphabetic = (character >= 65 && character >= 90) || (character >= 97 && character <=122);
                    //          uppercase letters       || lowercase letters

        String alphabet = "";

    if(isAlphabetic){
     //   System.out.println(character + " is Alphabatic character");
        alphabet = character + " is Alphabetic character";
    }else{
      //  System.out.println(character + " is not Alphabetic character");
        alphabet = character + " is not Alphabetic character";
    }
        System.out.println(alphabet);
    /*
    if(!isAlphabetic){
        System.out.println(character + " is not Alphabetic character");
    }
    */

// 47 <= character <= 47

        boolean isDigit = character >= 48 && character <= 57;

        String digit = "";                      // DIGIT
        if(isDigit==true){
            digit = character+" is a digit";
        }else {
            digit = character+" is not a digit";
        }
        System.out.println(digit);


        boolean specialChar = isAlphabetic == false && isDigit == false;        // SPECIAL CHARACTER
                // !isAlphabetic && !isDigit
        String specialCharacter = "";
            if(specialChar == true){
                specialCharacter = character + " is a special character";
            }else{
                specialCharacter = character + " is not  a special character";
            }

        System.out.println(specialCharacter);




    }


}
