package day06_ComparisonOperators;

public class RelationalOperator {

    // result is always BOOLEAN;
    public static void main(String[] args) {
        boolean r1 = 10 > 9;
        System.out.println(r1); //true;
        boolean r2 = 100 < 99;
        System.out.println(r2); //false;
        // >= greater than or equal;
        boolean r3 = 87 >= 85;
        System.out.println(r3); //true;
        boolean r4 = 877 >= 878;
        System.out.println(r4); //false;
        // <=  less than or equal;
        boolean r5 = 200 <= 300;
        System.out.println(r5);
        //==:EQUAL
        boolean r6 = 900 == 800;
        System.out.println(r6);
        boolean r7 = true == false;
        System.out.println(r7);
        boolean r8 = "Muhtar" == "Muhtar";
        System.out.println(r8);
        boolean r9 = "muhtar" == "MUHTAR"; //false, because Java is case sensitive language;
        System.out.println(r9);
        //boolean r10 = "123" == 123; won't work.
        //!= NOT EQUAL
        boolean r11 = "Muhtar" != "Bad Guy";
        System.out.println(r11);
        boolean r12 = true != false;
        System.out.println(r12);
        boolean result1 = 'A' == 65 + 1 + 2; // false 65 not equal to 68
        System.out.println(result1);
        boolean result2 = 100 == 100.0; //$100 $100.0
        System.out.println(result2);
        boolean result3 = 10 == (int) 10.999999999; //become true because of int, gives whole number 10 on the right
        System.out.println(result3);
        boolean result4 = "100" == "100.0"; //when comparing text, needs to have same amount of letters/digits.
        System.out.println(result4);
        //100
        //even: 100%2 if remainder is equal to == 0
        //odd: 100%3 if remainder is not equal to !=0
        int number = 100;
        boolean even = number % 2 == 0;
        System.out.println(even);
        int number1 = 101;
        boolean odd = number1 % 2 != 0;
        System.out.println(odd);
        int x = 1000;
        //odd:x%2!=0 ==>false
        //even:x%2 ==0 ==>true
        //divisible by3: if 1000%3 == 0 ==>false
        //divisible by5: if 1000%5 == 0 ==>true
        //divisible by10: if 1000%10 ==0 ==>true


    }


}