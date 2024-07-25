import java.util.Scanner;

public class CurrencyConverter {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double usdToINRRate = 83.66;  // Rate of USD to INR on 22/07/24

        System.out.println(" Enter the Base Currency (e.g. USD): ");
        String baseCurrency = sc.nextLine().toUpperCase();

        System.out.println(" Enter the Target Currency (e.g. INR): ");
        String targetCurrency = sc.nextLine().toUpperCase();

        System.out.println(" Enter the amount to convert: ");
        double amount = sc.nextDouble();

        double convertAmount = amount * usdToINRRate;
        System.out.println("The Converted Amount from " + baseCurrency + " to " + targetCurrency + " is " + convertAmount);

        sc.close();

    }
    
}
