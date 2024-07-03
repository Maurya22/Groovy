package com.globalpayex.banking

class Account {
    String accNumber
    String accountType
    Double balance
    List contactNos = []
    Double withdraw(Double amt){
        this.balance -= amt

    }
    Double deposite(Double amt){
        this.balance += amt
    }

    String getDetails(){
        "AccNumber : $accNumber\nAccType : $accountType\nBalance : $balance"
    }

    Double minus(Double amt){
        this.withdraw(amt)
    }

    Double plus(Double amt){
        this.deposite(amt)
    }

    Account leftShift(Long cont){
        this.contactNos << cont
    }



}
