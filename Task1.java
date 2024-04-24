import java.util.Random;
import java.util.Scanner;
class Task1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int minR = 1;
        int maxR = 100;
        int maxAttempt = 7;
        int score = 0;

        System.out.println("Welcome to Guess the Number!");
        System.out.println("I have selected a random number between " + minR + " and " + maxR + ". Try to guess it!");

        boolean play = true;
        while (play) {
            int randomNumber = random.nextInt(maxR - minR + 1) + minR;
            int attempt = 0;
            boolean guessedCorrectly = false;

            while (attempt < maxAttempt) {
                System.out.print("Enter your guess (Attempt " + (attempt + 1) + "/" + maxAttempt + "): ");
                int guess = scanner.nextInt();
                attempt++;

                if (guess == randomNumber) {
                    System.out.println("Congratulations! You guessed the correct number.");
                    guessedCorrectly = true;
                    score++;
                    break;
                } else if (guess < randomNumber) {
                    System.out.println("Too low. Try again.");
                } else {
                    System.out.println("Too high. Try again.");
                }
            }

            if (!guessedCorrectly) {
                System.out.println("Sorry, you've used all your attempts. The correct number was: " + randomNumber);
            }


        }

        System.out.println("Your final score: " + score);
        System.out.println("Thank you for playing!");

    }
}