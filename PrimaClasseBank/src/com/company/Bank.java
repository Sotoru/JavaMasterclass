package com.company;

public class Bank {

    private int accountNumber ;
    private int balance;
    private String name;
    private String email;
    private int telNum;

    //constructors
    public Bank(int accountNumber, int balance, String name, String email, int telNum) {
        System.out.println("Constructor with parameters called");
       this.accountNumber= accountNumber;
       this.balance = balance;
       this.name = name;
       this.email = email;
       this.telNum = telNum;
    }

    public  Bank (){
        this(5643, 250, "Default Name", "Default Address", 1111);
        System.out.println("Constructor with no parameters called");
    }

    public Bank(String name, String email, int telNum) {
       this(999999,2000,name,email,telNum);
    }

    // set methods
    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance){
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelNum(int telNum) {
        this.telNum = telNum;
    }


    // get methods
    public int getAccountNumber(){
        return accountNumber;
    }

    public int getBalance (){
        return balance;
    }

    public int getTelNum () {
        return telNum;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }


    // deposit and withdraw methods
    public void depositFunds(int incr){
        this.balance = balance + incr;
    }

    public void withdrawFunds(int with) {
        if ((this.balance - with) < 0) {
            System.out.println("Niente");
        } else {
            this.balance = balance - with;
        }
    }

}
