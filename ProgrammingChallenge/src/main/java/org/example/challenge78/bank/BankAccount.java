package org.example.challenge78.bank;

class BankAccount {
    private final String accountNo;
    private final String name;
    private double balance;

    public BankAccount(String accountNo, String name) {
        this.accountNo = accountNo;
        this.name = name;
    }

    public void deposit(double money){
        this.balance += money;
    }

    public void withdrawMoney(double money){
        if(balance>= money){
                balance -= money;
        }else if(money < 0){
            System.out.println("Invalid withdrawal");
        }else{
            money = balance;
            balance = 0;
        }
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNo='" + accountNo + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
