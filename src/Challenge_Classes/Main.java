package Challenge_Classes;

public class Main {
    public static void main(String[] args) {
        BankAccount Acc1 = new BankAccount(102030,3000,"Jaya","jaya@gmail.com",89398653);
        System.out.println("Transaction by "+ Acc1.getCustomerName());
        Acc1.deposit(100);
        BankAccount Acc2 = new BankAccount(10000,2000,"yayadhi","yaya@gmail.com",909892728);
        System.out.println("Transaction by "+ Acc2.getCustomerName());
        Acc2.withdraw(2001);
    }

}
