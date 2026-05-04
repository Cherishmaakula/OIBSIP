import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        Random rand = new Random();

        char playAgain;

        do {
            int number = rand.nextInt(100) + 1;
            int guess = 0;
            int attempts = 0;

            System.out.println("\n--- Number Guessing Game ---");
            System.out.println("Guess the number between 1 and 100");

            while (guess != number) {
                System.out.print("Enter your guess: ");
                guess = sc.nextInt();
                attempts++;

                if (guess < number) {
                    System.out.println("Too low!");
                } else if (guess > number) {
                    System.out.println("Too high!");
                } else {
                    System.out.println("Correct! You guessed the number.");
                    System.out.println("Total attempts: " + attempts);
                }
            }

            System.out.print("Do you want to play again? (y/n): ");
            playAgain = sc.next().charAt(0);

        } while (playAgain == 'y' || playAgain == 'Y');

        System.out.println("Thanks for playing!");
        sc.close();
    }
}