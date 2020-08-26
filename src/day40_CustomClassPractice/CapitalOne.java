package day40_CustomClassPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class CapitalOne {

    public static void main(String[] args) {

        BankAccount Beslan = new BankAccount();

        BankAccount Ahmet = new BankAccount();
        BankAccount Viorel = new BankAccount();
        BankAccount Nurmamet = new BankAccount();
        BankAccount Wagar = new BankAccount();

        Beslan.setAccountInfo("Checking", "Beslan", "4444332221");
        Ahmet.setAccountInfo("Checking", "Ahmet", "98729847293");
        Viorel.setAccountInfo("Checking", "Viorel", "9887788988");
        Nurmamet.setAccountInfo("Checking", "Nurmamet", "77777777744");
        Wagar.setAccountInfo("Checking", "Wagar", "66677778888");

        ArrayList<BankAccount> accounts = new ArrayList<>();
        accounts.addAll(Arrays.asList(Beslan, Ahmet, Viorel, Nurmamet, Wagar));
        //                              0       1       2       3        4


        for (BankAccount each : accounts) {
            each.deposit(500);
            each.getAccountInfo();
        }

        accounts.get(3).deposit(300);
        accounts.get(3).checkBalance();
        accounts.get(3).withDraw(200);
        accounts.get(3).checkBalance();

        accounts.get(4).deposit(600);
        accounts.get(4).checkBalance();

        System.out.println("====================================================");
        accounts.removeIf( each -> each.balance < 1000 ); // if the balance less then 1000 will be removed
        for (BankAccount each : accounts){
            each.getAccountInfo();
        }



    }
}
