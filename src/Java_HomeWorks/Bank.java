package Java_HomeWorks;

public class Bank {
    public static void main(String[] args) {
        Customer c1=new Customer("checking",200,"Guzel","123-45-9867");
        c1.balance();
        c1.openNewAccount(107, "checking",7);
        c1.deposit(60);
        c1.withdraw(90);
        c1.balance();

    }
}

