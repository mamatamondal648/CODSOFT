import java.util.Scanner;

public class NumberGuessingGame {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int totalScore = 0;

        int maxAttempts = 10;

        boolean playAgain = true;

        while (playAgain) {

            //generate random number and typecasting to integer
            int randomNumberGuess = (int) ((Math.random() *100)+1);

            int numberOfAttempts = 0;

            boolean guessCorrect = false;

            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("Guess a number between 1 to 100");
            System.out.println("You have only " + maxAttempts + " attempts to guess it.");

            while (!guessCorrect && numberOfAttempts < maxAttempts) {

                System.out.println("Enter your Guess Number: ");

                int userNumberGuess = sc.nextInt();
                numberOfAttempts++;

                if (userNumberGuess == randomNumberGuess) {
                    
                    totalScore += maxAttempts - numberOfAttempts + 1; // Calculate score
                    guessCorrect = true;
                    System.out.println("Congratulations! You guessed the number in " + numberOfAttempts + " attempts.");

                } else if (userNumberGuess > randomNumberGuess) {
                    
                    System.out.println("Your guess is too high. Try again.");

                } else {
                    System.out.println("Your guess is too low. Try again.");
                }

                
            }

            if (!guessCorrect) {
                
                System.out.println("You ran out of attempts. The correct number was " + randomNumberGuess);
            }

            // Ask to play again
            System.out.println("Do you want to play again? (yes/no)");
            String userResponse = sc.next();
            playAgain = userResponse.equalsIgnoreCase("yes");

            if (!playAgain) {
                System.out.println("Your total score is: " + totalScore);
            }

        }

        System.out.println("Thank you for playing!");
        sc.close();
        
    }
}
