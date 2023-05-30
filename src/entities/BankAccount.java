package entities;

public class BankAccount {
    private String accountNumber;
    private String name;
    private double value;

    public BankAccount(String accountNumber, String name, double value) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.value = value;
    }

    public BankAccount(String accountNumber, String name) {
        this.accountNumber = accountNumber;
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addBalance(double amount) {
        value += amount;
    }

    public void deductBalance(double amount){
        value -= (amount + 5);
    }

    public String toString(){
        return (
                "Account "
                + accountNumber
                + ", Holder: "
                + name
                + ", Balance: $ "
                + String.format("%.2f", value)
        );
    }

}
