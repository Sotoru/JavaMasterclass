package com.company;
public class Main {

    public static void main (String[] args) {

   /*     Bank Paolo = new Bank();

        Paolo.setName("Paul");
        System.out.println(Paolo.getName());

        Paolo.setBalance(300);
        System.out.println(Paolo.getBalance());

        Paolo.depositFunds(20);
        System.out.println(Paolo.getBalance());

        Paolo.withdrawFunds(340);
        System.out.println(Paolo.getBalance());

        Bank Simona = new Bank(1234,4055,"simona","simona.outlook",123456);
        System.out.println(Paolo.getAccountNumber() + " name " + Paolo.getName());*/


        VipCustomer Paolo = new VipCustomer("Paolo",20000);
        System.out.println(Paolo.getEmail());

    }
}

