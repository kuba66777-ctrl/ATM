package com.example.ATMApp.model;

import java.util.Objects;


public class Account {

    private int number;
    public double balance;



    public Account(int number, double balance) {
             //this.number = Objects.requireNonNull(number, "Numer konta nie moze byc cos tam");
             this.balance = balance;


    }

    public void setNumber() {this.number = number;}


    public int getNumber() {
        return number;
    }
    public double getBalance() {
        return balance;
    }

    public double deposit(double amount) {
       if (amount > 0) {
           this.balance += amount;

       }else {
            System.out.println("Nie można wpłacić kwoty zerowej bądź ujemnej");
       }
        return balance;
    }

    public double withdraw(double amount) {
        requirePositive(amount);

        if (amount > balance) {
            throw new IllegalArgumentException("Brak srodkow");
        }

        this.balance -= amount;
        return balance;
    }

    private void requirePositive(double amount) {
        Objects.requireNonNull(amount, "Kwota nie moze byc jakas tam");

        if (amount <= 0)

            throw new IllegalArgumentException("Kwota musi być dodatnia");

        }
    }

