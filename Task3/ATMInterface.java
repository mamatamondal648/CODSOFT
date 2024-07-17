import java.util.Scanner;

public class ATMInterface {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        BankAccount amount = new BankAccount(2000);
        ATM atm = new ATM(amount);

        boolean exit = false;
        while (!exit) {
            atm.displayMenu();
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    atm.checkBalance();
                    break;

                case 2:    
                    System.out.println("Enter The Deposit Amount: ");
                    double depositAmount = sc.nextDouble();
                    atm.deposit(depositAmount);
                    break;

                case 3:
                    System.out.println("Enter The Withdrawal Amount: ");
                    double withdrawAmount = sc.nextDouble();
                    atm.withdraw(withdrawAmount);
                    break;

                case 4:
                    exit = true;
                    System.out.println("Thank you for using the ATM.");
                    break;
            
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }

        sc.close();

    }
}



