public class BankAccount {

    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double depositamount) {

        balance += depositamount;
    }

    public void withdraw(double withdrawamount) {

        balance -= withdrawamount;
    }
  
}
