package com.example.todo;

class BankAccount {
    private String holderName;
    private double balance;

    public BankAccount(String name, double initialBalance) {
        this.holderName = name;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds");
        } else {
            balance -= amount;
        }
    }

    public void printBalance() {
        System.out.println(holderName + "'s Balance: " + balance);
    }
}

public class App {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Dhinesh", 5000);
        acc.deposit(1500);
        acc.withdraw(2000);
        acc.printBalance();
    }
}

