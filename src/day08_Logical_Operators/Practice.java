package day08_Logical_Operators;

public class Practice {
    public static void main(String[] args) {
        String firstName = "Aron";
        String lastName = "Daniel";
        String fullName = firstName + " " + lastName;
        int age = 34;
        String citizenShip = "USA";

        boolean eligibleToVote = age >= 18 && citizenShip == "USA";
        //                        19 >= 18 &&  "China" == "USA"
        //                          true   &&   false


        System.out.println(fullName + " is eligible to vote: " + eligibleToVote);

    }



}
