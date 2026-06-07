
import java.util.Random;
import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int score = 0;
        int round = 1;

        System.out.println("Guess The Number Game");

        boolean play = true;

        while (play) {

            int num = r.nextInt(100) + 1;

            int maxAttempts = 7;
            int attempt = 0;

            boolean won = false;

            System.out.println("\nRound " + round);
            System.out.println("Guess number between 1 to 100");
            System.out.println("You have " + maxAttempts + " attempts");

            while (attempt < maxAttempts) {

                System.out.print("Enter guess: ");

                if (!sc.hasNextInt()) {
                    System.out.println("Enter valid number");
                    sc.next();
                    continue;
                }

                int guess = sc.nextInt();

                attempt++;

                if (guess == num) {

                    System.out.println("Correct Guess!");

                    int points = (maxAttempts - attempt + 1) * 10;

                    score += points;

                    System.out.println("Points earned: " + points);

                    won = true;

                    break;
                }

                else if (guess > num) {
                    System.out.println("Too High");
                }

                else {
                    System.out.println("Too Low");
                }

                System.out.println("Attempts left: " + (maxAttempts - attempt));
            }

            if (!won) {
                System.out.println("You lost");
                System.out.println("Correct number was: " + num);
            }

            System.out.println("Total Score: " + score);

            System.out.print("Play again? (yes/no): ");
            String ch = sc.next();

            if (!ch.equalsIgnoreCase("yes")) {
                play = false;
            }

            round++;
        }

        System.out.println("Game Over");
        System.out.println("Rounds Played: " + (round - 1));
        System.out.println("Final Score: " + score);

        sc.close();
    }
}

