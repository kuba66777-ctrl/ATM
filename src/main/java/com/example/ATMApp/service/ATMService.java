package com.example.ATMApp.service;

import com.example.ATMApp.model.Account;

public class ATMService {


    private final Account account;
    
    public ATMService(Account account) {
    this.account = account;
    }
    
    public void deposit(amount) {
        account.deposit(amount);
    }
    
    public void withdraw(amount) {
        account.withdraw(amount);
    }
    


}
