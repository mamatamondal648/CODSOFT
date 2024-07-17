public class ATM {
    
    private BankAccount account;

    public ATM(BankAccount account) {
        this.account = account;
    }

    public void displayMenu() {

        System.out.println("Welcome to the ATM!..");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }

    public void checkBalance() {

        System.out.println("Your Current Balance is: " + account.getBalance());
    }

    public void deposit(double depositamount) {

        if (depositamount > 0) {

            account.deposit(depositamount);
            System.out.println("You have Successfully deposited " + depositamount);

        } else {

            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double withdrawamount) {

        if (withdrawamount > 0 && withdrawamount < account.getBalance() ) {
            
            account.withdraw(withdrawamount);
            System.out.println("You have successfully withdrawn " + withdrawamount);

        } else if (withdrawamount > account.getBalance()) {
            
            System.out.println("Insufficient Balance");
        } else {
            
            System.out.println("Invalid withdrawal amount");
        }
    }

}


