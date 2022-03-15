package session6;

public class Account {
    String accountNumber;
    String accountHolderName;
    String accountType;
    double balace;


    public Account(){
        System.out.println("Default Construtor Invoked.");
    }

    public Account(String accNo, String name, String accType, double bal) {
         System.out.println("Parameterized Constructor Invoked");
         accountNumber = accNo;
         accountHolderName = name;
         accountType = accType;
         balace = bal;
    }
}
