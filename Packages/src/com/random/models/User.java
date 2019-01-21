package com.random.models;

public class User {

    public int age;
    private double bankBalance;
    protected int otp;
    String name;

    private void printData(){
        System.out.println("Age: "+this.age);
        System.out.println("BankBalance: "+this.bankBalance);
    }

    public void test(){
        printData();
    }


}
