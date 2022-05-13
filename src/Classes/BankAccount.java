package Classes;

public class BankAccount {

    private double balance;
    private int accountNumber;
    private String name;

    public BankAccount(double balance,int accountNumber, String name) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.name = name;
    }

    public BankAccount(){}

    public void deposit(double amount) {
        this.balance += amount;
    }

    public double withdrawal(double amount) {
        return this.balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "My account balance: " + this.balance;
    }

    public void transfer (BankAccount account2, double amount){
        balance-=amount;
        account2.deposit(amount);
        System.out.println("The name on the account number is : "+this.name+" and they have a balance of "+this.balance);
        System.out.println("The name on the account number is : "+account2.name+" and they have a balance of "+account2.balance);

    }

}
