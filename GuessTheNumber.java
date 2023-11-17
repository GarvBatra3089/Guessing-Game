import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        int num = rand.nextInt(100) + 1;
        System.out.println("Guess the number between 1 and 100!");
        int guess;
        int guesses = 0;

        do {
            guess = Integer.parseInt(scan.nextLine());
            guesses++;
            if (guess > num) {
                System.out.println("Your guess is too big!");
            } else if (guess < num) {
                System.out.println("Your guess is too small!");
            }
        } while (guess != num);

        System.out.println(String.format("Congrats! You guessed the number in %s attempts", guesses));
    }
}
