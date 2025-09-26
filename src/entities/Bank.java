package entities;

public class Bank {
    private int accountNumber;
    private String accountHolder;
    private double depositValue = 0;

    public Bank() {
    }

    public Bank(int accountNumber, String accountHolder, double depositValue) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.depositValue = depositValue;
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

    public double getDepositValue() {
        return depositValue;
    }

    public void setDepositValue(double depositValue) {
        this.depositValue = depositValue;
    }

    public String toString(){
        return "Account " + getAccountNumber() + ", Holder: "
                + getAccountHolder() + ", Balance: $ " + getDepositValue();
    }
}
