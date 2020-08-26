package day35_ArrayList;

/*
 2. write a program that can return the sum of all the digits from a string
            ex:
                input: "a1b2c3"
                output: 6
                    (1+2+3= 6)
                input: "Today's date is 04/27/2020"
                output: 17
                    (0+4+2+7+2+0+2+0=17)
            HINT: on ascii table, the characters between #48 ~ #57 are digits

 */
public class SumOfDigits {
    public static void main(String[] args) {

        String str = "a1b2c3"; // doesn't matter if increase like d4e5f6 == cos the logic is LENGTH-1
        int sum = 0;

        for (int i = 0; i <= str.length() - 1; i++) {  // int i = each of the String str

            char each = str.charAt(i);  // a 1 b 2 c 3 <= will be assign one by one to a char/  1 is a character/ see ASCII
            // / if it's a DIGITS it means = true (executes), if FALSE = won't Execute

            if (each >= 48 && each <= 57) {   //  if the char is between 48 till 57 = then its DIGIT === CONDITION
                sum += Integer.parseInt(each + "");  // parse convert the Character to INT then adds to the SUM
           // sum += each - 48  <== another way
            }

        }
            System.out.println(sum);

    }

}
