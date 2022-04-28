package com.company;

import java.util.Scanner;

public /*final keyword is put after public*/ class BankAccount {
    // the information that needs to be supplied while creating a bank account should be specified in the
    // parameterised constructor.
    //the properties inside this class are called instance properties. They are not normal properties.
    //The methods in this class are called instance methods, because they will come coupled with the objects.

    private boolean isActive; // this specifies if this account is active or not.

    private String accountHolderName;
    //    private String gender;
    private long accountNumber;
    private double balance;
    private String accountHolderAddress;

    private long phoneNumber;
    //public void setRateForBank(); we cannot declare a method like this. this means that the method has no body which is not possible.
    //the correct way for that is given below.
    //public abstract void setRateForBank();//this shows no error. but for this to be correct, the class must be declared as abstract class.

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public BankAccount(String accountHolderName, long accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
    }

    public BankAccount(String accountHolderName, long accountNumber, long phoneNumber) {
//        this.accountHolderName = accountHolderName;
//        this.accountNumber = accountNumber;
        this(accountHolderName, accountNumber);//this is an important line. it eliminates the repetition of code in the
        //above line
        //this is also called constructor chaining, that is making a call to another constructor from a constructor.
        // this line has to be the first line inside the constructor.
        // also, we can only chain one constructor at a time.
        this.phoneNumber = phoneNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void depositAmount(double amount) {
        balance = balance + amount;
    }

    public double withdraw(double withdrawAmount) {
        if (withdrawAmount > balance) {
            System.out.println("your balance is less than given amount. Please enter a valid amount");

        } else

            return withdrawAmount;
        return withdrawAmount;
    }

    ;


    @Override
    public String toString() {
        return "BankAccount{" +
                "isActive=" + isActive +
                ", accountHolderName='" + accountHolderName + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                ", accountHolderAddress='" + accountHolderAddress + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
