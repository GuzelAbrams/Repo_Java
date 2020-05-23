package Java_HomeWorks;

import com.sun.tools.javac.comp.Resolve;

public class Account {
   String accType;
    double amount;
    double balance;
    static int accNum;
    int quantityOfAccount;

    public Account(String accType,int amount){
        this.accType = accType;
        this.amount = amount;
    }

    public void openNewAccount( double amount, String accType, int quantityOfAccount){
        this.amount=amount;
        this.accType=accType;
        if (amount>=1000 && accType =="Checking or Saving" && quantityOfAccount<5){
            System.out.println("Based on your qualifications, you can open a checking and/or savings account ");
        } else {
            System.out.println("you do not qualify for an account");
        }
    }


    public double deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Unable to deposit - Invalid transaction");
        }
        return balance;
    }


    public double withdraw(double amount){
        if (amount>0 && amount<balance){
            balance-=amount;
        }else {
            System.out.println("Unable to withdraw - Invalid transaction");
        }return balance;
    }

    }


