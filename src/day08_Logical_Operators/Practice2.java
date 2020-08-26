package day08_Logical_Operators;

public class Practice2 {
    public static void main(String[] args) {
        int age = 18;
        String citizenShip1 = "USA";
        String citizenShip2 = "France";
        String firstName = "Aron";
        String lastName = "Daniel";
        String fullName = firstName + " " + lastName;

        boolean eligibleAge = age >=18;
                        // 12 >= 18 ==> false
        boolean usCitizen = citizenShip1 == "USA" || citizenShip2 == "USA";
                    // "USA" == "USA" || "France" == "France"
                    //     true       ||     false ==> true

        boolean eligibleToVote = eligibleAge && usCitizen;
        //                          false    && true


        System.out.println(fullName + " is eligible to vote for Trump: " + eligibleToVote);



    }

}
