package com.qa.mystepdefs;

public class Main {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount();
        sa.setBalance(500);
        sa.displayType();   // inherited method
        sa.interestRate();  // own method

    }
}