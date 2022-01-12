package com.tosan.example3;

import java.util.Calendar;

public class Deposit {
    private String depositNumber;
    private int balance;

    public boolean equals(Object obj){
        if(obj == null){
            return false;
        }
        if(obj instanceof Deposit){
            Deposit deposit = (Deposit) obj;
            if(this.depositNumber.equals(deposit.getDepositNumber())){
                if (this.balance == deposit.getBalance()){
                    return true;
                }
            }
            return false;
        }
        else {
            return false;
        }
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getDepositNumber() {
        return depositNumber;
    }

    public void setDepositNumber(String depositNumber) {
        this.depositNumber = depositNumber;
    }

    public int getBalance() {
        return balance;
    }
}
