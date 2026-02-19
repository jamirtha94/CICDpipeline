package com.qa.mystepdefs;
import java.util.*;

class Account {
    private int balance;
    public void displayType() {

        System.out.println("This is a bank account" + balance);
    }
    public void setBalance(int balance){
        if(balance> 0){
            this.balance = balance;
        }
    }
}

class SavingsAccount extends Account {
    public void interestRate() {
        System.out.println("Interest rate: 5%");
    }
    int balance = 1000;
    @Override
    public void displayType() {

        System.out.println("This is a bank account" + balance);
    }



}
