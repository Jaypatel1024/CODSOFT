import java.util.Scanner;

class RandomNumberGenerator {
    public int generate(int max, int min) {
        return (int) (Math.random() * (max - min + 1) + min);
    }
}

public class Number5Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RandomNumberGenerator generator = new RandomNumberGenerator();
        int totalAttempts = 0;
        int wins = 0;

        while (true) {
            System.out.println("Enter the maximum number:");
            int max = scanner.nextInt();
            System.out.println("Enter the minimum number:");
            int min = scanner.nextInt();

            int correctNumber = generator.generate(max, min);
            int attempts = 0;

            while (true) {
                System.out.printf("Guess a number between %d and %d:%n", min, max);
                int guessedNumber = scanner.nextInt();
                attempts++;

                if (guessedNumber > correctNumber) {
                    System.out.println("Too high, try again!");
                } else if (guessedNumber < correctNumber) {
                    System.out.println("Too low, try again!");
                } else {
                    System.out.println("Congratulations! You guessed the number.");
                    wins++;
                    break;
                }
            }

            totalAttempts += attempts;
            System.out.println("Attempts: " + attempts);
            System.out.println("Wins: " + wins);

            double winRate = (double) wins / totalAttempts * 100;
            System.out.printf("Your win rate is %.2f%%%n", winRate);

            System.out.println("Do you want to play again (yes/no)?");
            String playAgain = scanner.next();
            if (!playAgain.equalsIgnoreCase("yes")) {
                scanner.close();
                System.exit(0);
            }
            scanner.nextLine();
        }
    }
}