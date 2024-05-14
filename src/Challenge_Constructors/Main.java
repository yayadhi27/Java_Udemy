package Challenge_Constructors;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("jaya",2000,"jaya@gmail.com");
        System.out.println(customer.getName());
        System.out.println(customer.getEmialAddress());
        System.out.println(customer.getCreditLimit());
    }
}
