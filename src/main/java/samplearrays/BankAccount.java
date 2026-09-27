package samplearrays;

public class BankAccount {

    String name;
    double currentBalance;
    //TO-DO: Initialize an Array with 1000 in size that stores Double called 'transactions' to keep track of the user's transactions
    double[] transactions=new double[1000];
    int currentIndex=1;
    public BankAccount(String name, int startingBalance){
        currentBalance=startingBalance;
        this.name=name;
    }
    public void deposit(double amount){
        if(amount>0 ) {
            currentBalance += amount;
            transactions[currentIndex++]=amount;
            System.out.println("Depositor : "+ name+", deposited amount = "+amount+", the new balance : "+currentBalance);
        }
        else System.out.println("Unsuccessful deposits");
    }
    public void withdraw(double amount){
        if(amount<0 && currentBalance>=amount) {
            currentBalance += amount;
            transactions[currentIndex++]=amount;
        }
        else System.out.println("Unsuccessful withdrawal");

    }




    public void displayTransactions(){
        for (int i=0;i<=currentIndex;i++){
            System.out.println("Transaction "+i+" : "+transactions[i]);
        }
    }

    public void displayBalance(){
        System.out.println("The current balance : "+currentBalance);
    }

    public static void main(String[] args) {

        BankAccount john = new BankAccount("John Doe", 100);

        // ----- DO NOT CHANGE -----

        //Testing..
        john.displayBalance();
        john.deposit(0.25);
        john.withdraw(100.50);
        john.withdraw(40.90);
        john.deposit(-90.55);
        john.deposit(3000);
        john.displayTransactions();
        john.displayBalance();

        // ----- DO NOT CHANGE -----

    }

}

