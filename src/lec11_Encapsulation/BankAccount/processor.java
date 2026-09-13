package lec11_Encapsulation.BankAccount;

public class processor {

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("123456", "LCB", 1000000);
        account1.display();
        account1.deposit(500000);
        System.out.println("After deposit:");
        account1.display();
        boolean result = account1.withdraw(300000);
        if (result == true) {
            System.out.println("Withdraw successful");
        } else {
            System.out.println("Withdraw failed");
        }
        System.out.println("After withdraw:");
        account1.display();
        BankAccount account2 = new BankAccount();
        account2.addInfo();
        account2.display();
    }
}
