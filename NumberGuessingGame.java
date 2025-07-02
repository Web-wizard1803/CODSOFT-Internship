package pack_CODSOFT;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame
{
//region Mechanism
    public void mechanism()
    {
        Scanner sc = new Scanner(System.in);

        Random random = new Random();

        int numToGuess = random.nextInt(100);
        int attempt = 0 , maxAttempts = 10 ;

        while (attempt < maxAttempts)
        {

            System.out.println("Enter a number (1-100) :");
            int userGuess = sc.nextInt();
            attempt++;


            if (numToGuess == userGuess)
            {
                System.out.println("Congratulations! You guessed the correct number.");
                System.out.println("You took " +attempt+ " attempts to guess correctly.");
                break;
            }
            else if (attempt == maxAttempts)
            {
                System.out.println("Sorry! You have reached the maximum attempts.The correct number was " + numToGuess);
            }
            else if (numToGuess > userGuess)
            {
                System.out.println("Your guess is too low!! Guess again.");
            }
            else
            {
                System.out.println("Your guess is too high!! Guess again.");
            }
        }
    }
//endregion

    //region Main
    public static void main(String[] args)
    {
            Scanner sc = new Scanner(System.in);
            System.out.println("Welcome to the number guessing game!!");
            System.out.println("I have selected a number between 1 and 100.");

            NumberGuessingGame obj = new NumberGuessingGame();
            int choice = 1;

            while (true) {
                obj.mechanism();  // Play the game

                System.out.println("Do you want to play again?\n1. YES\n2. NO");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        break;
                    case 2:
                        System.out.println("Thank you for playing the game.");
                        return;
                    default:
                        System.out.println("Invalid choice. Please enter 1 for YES or 2 for NO.");
                        break;
                }
            }

    }
}
//end region