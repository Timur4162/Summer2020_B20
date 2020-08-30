package day48_Inheritance;

public class BofA {
    public static void main(String[] args) {
        BankAccount obj = new BankAccount("Jeemy", "Chonka");
        obj.setAccountHolder( obj.firstName+" "+obj.lastNAme );
        obj.setAccountNumber(123456678);
        obj.setBalance(50);

        obj.availableBalance();
        obj.deposit(500);

        obj.withdraw(700);

        obj.withdraw(300);
        System.out.println(obj);
        obj.deposit(1000000);
        System.out.println(obj);
    }
}
