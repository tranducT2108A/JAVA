package session7;

import java.security.PrivateKey;

public class Account2 {
    private  String accountNumber;
    private  String accountHolderName;
    private String accountType;
    private  double balace;

    public Account2(){
        System.out.println("Default Consttructor Invoked..");
        accountNumber = "Not Specified";
        accountHolderName = "Not Specified";
        accountType = "Not Specified";
        balace = 0.0;

    }

    public Account2(String accountNumber, String accountHolderName,String accountType, double balace){
        System.out.println("Parameterized Construtor Invoked");

        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountType = accountType;
        this.balace = balace;
    }

    public String getAccountNumber(){
        return  accountNumber;

    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getBalace() {
        return balace;
    }

    public void setBalace(double balace) {
        this.balace = balace;
    }
}
