package Challenge_Constructors;

public class Customer {
    private String name;
    private double creditLimit;
    private String emialAddress;

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmialAddress() {
        return emialAddress;
    }

    public Customer(String name, double creditLimit, String emialAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emialAddress = emialAddress;
    }
    public Customer(String name, String emialAddress) {
        this.name = name;
        this.emialAddress = emialAddress;
        this.creditLimit = 0;
    }

    public Customer() {
        this("Nobody",0,"nobody@gmail.com");
    }

}
