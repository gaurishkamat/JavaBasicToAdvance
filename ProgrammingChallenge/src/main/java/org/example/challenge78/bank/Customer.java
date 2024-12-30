package org.example.challenge78.bank;

public class Customer {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("910500219667687", "John Wick");
        account.deposit(2000000);
        account.withdrawMoney(5000);

        System.out.println(account.toString());
    }
}
