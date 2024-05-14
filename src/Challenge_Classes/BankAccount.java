package Challenge_Classes;

public class BankAccount {
    private Integer accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private Integer phoneNumber;

    public void deposit(double depositAmount){

        accountBalance += depositAmount;
        System.out.println("Balance after deposit " + accountBalance);
    }

    public void withdraw(double withdrawAmount){

        if(accountBalance - withdrawAmount < 0){
            System.out.println("Insufficient Balance");
        }
        else{
            accountBalance -= withdrawAmount;
            System.out.println("Balance after withdraw " + accountBalance);
        }

    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(Integer accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(Integer accountNumber, double accountBalance, String customerName, String email, Integer phoneNumber) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

}
