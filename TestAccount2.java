package session7;

import session7.Account2;

public class TestAccount2 {
    public static void main(String[] args) {
        Account2 objAccount2 = new Account2();

        objAccount2.setAccountNumber("Acc001");
        objAccount2.setAccountHolderName("Nam");
        objAccount2.setAccountType("Savings");
        objAccount2.setBalace(6500.789);


        System.out.println("Account Details");
        System.out.println("Account Number:" +objAccount2.getAccountNumber());
        System.out.println("Account Holder Name:" + objAccount2.getAccountHolderName());
        System.out.println("Account Type:" +objAccount2.getAccountType());
        System.out.println("Balance:" +objAccount2.getBalace());
    }
}
