package com.example.ATMApp.model;

import java.util.Objects;


public class Account {

    private final String number;
    private double balance;

    private final double openingBalance;

    public Account(String number, double openingBalance) {
             this.number = Objects.requireNonNull(number, "Numer konta nie moze byc cos tam");
             this.openingBalance = 0;
             Objects.requireNonNull(openingBalance, "Saldo początkowe nie moze byc cos tam");
             if (openingBalance < 0) {
                throw new IllegalArgumentException("Nie mozna wyjąć pieniędzy z konta ujemnego");

             }

             this.balance = openingBalance;


    }

    public String getNumber() {
        return number;
    }

    public void deposit(amount) {
        requirePositive(amount);
        balance = balance.add(amount);

    }

    public void withdraw(amount) {
        requirePositive(amount);

        if (amount.compareTo(balance) > 0 {
            throw new IllegalArgumentException("Brak srodkow");
        }

        balance = balance.subtract(amount);
    }

    private void requirePositive(amount) {
        Objects.requireNonNull(amount, "Kwota nie moze byc jakas tam");

        if (amount.signum() <= 0)

            throw new IllegalArgumentException("Kwota musi być dodatnia");

        }
    }

}