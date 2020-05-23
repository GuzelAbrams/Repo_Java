package Java_HomeWorks;

public class Customer extends Account {
    String name;
    String ssn;


    public Customer(String accType, int amount, String name, String ssn) {
        super(accType, amount);
        this.name = name;
        this.ssn = ssn;
    }

    public void balance() {
        System.out.println("Name " + name + " "+
                "SSN " + ssn + " "+
                "Account type " + accType + " "+
                "Balance " + amount);
    }
}

