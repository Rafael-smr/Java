package entities;

public class Bank {
    private int accountNumber;
    private String accountHolder;
    private double totalValue = 0;

    public Bank() {
    }

    public Bank(int accountNumber, String accountHolder, double totalValue) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.totalValue = totalValue;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }

    public double enterDeposit(double value){
        return this.totalValue += value;
    }

    public double withdraw(double value){
        return this.totalValue -= value + 5.00;
    }

    public String toString(){
        return "Account " + getAccountNumber() + ", Holder: "
                + getAccountHolder() + ", Balance: $ " + getTotalValue();
    }
}
