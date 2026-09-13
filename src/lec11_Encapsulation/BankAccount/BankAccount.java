package lec11_Encapsulation.BankAccount;

import java.util.Scanner;

public class BankAccount {

    private String accountNumber;
    private String owner;
    private int balance;

    public BankAccount() {
    }

    public BankAccount(String accountNumber, String owner, int balance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public int getBalance() {
        return balance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void deposit(int amount) {

        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposit successful");
        } else {
            System.out.println("Invalid amount");
        }
    }

    public boolean withdraw(int amount) {

        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            return true;
        }

        return false;
    }

    public void display() {
        System.out.println("Account number = " + getAccountNumber());
        System.out.println("Owner = " + getOwner());
        System.out.println("Balance = " + getBalance());
    }

    public void addInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter account number = ");
        setAccountNumber(scanner.nextLine());
        System.out.println("Enter owner = ");
        setOwner(scanner.nextLine());
        System.out.println("Enter balance = ");
        setBalance(scanner.nextInt());
    }
}
