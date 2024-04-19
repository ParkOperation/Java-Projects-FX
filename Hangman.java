import java.util.*;

public class Hangman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] wordBank = {
            "football", "basketball", "soccer", "baseball", "tennis",
            "volleyball", "golf", "hockey", "cricket", "swimming",
            "athletics", "cycling", "boxing", "rugby", "wrestling",
            "surfing", "skiing", "karate", "badminton", "running"
        };

        int wins = 0;
        int losses = 0;
        boolean continuePlaying = true;

        while (continuePlaying) {
            String word = wordBank[random.nextInt(wordBank.length)];
            int lives = 6;
            char[] currentWordState = new char[word.length()];
            Arrays.fill(currentWordState, '_');
            Set<Character> incorrectGuesses = new HashSet<>();

            while (lives > 0) {
                System.out.println("Current Word: " + String.valueOf(currentWordState));
                System.out.println("Incorrect Guesses: " + incorrectGuesses);
                System.out.println("Attempts Left: " + lives);

                System.out.print("Enter a lowercase letter: ");
                char input = scanner.next().charAt(0);

                if (!Character.isLetter(input) || !Character.isLowerCase(input)) {
                    System.out.println("Please enter a valid lowercase letter.");
                    continue;
                }

                if (incorrectGuesses.contains(input) || Arrays.toString(currentWordState).contains(String.valueOf(input))) {
                    System.out.println("You've already guessed that letter. Try again.");
                    continue;
                }

                boolean correctGuess = false;
                for (int j = 0; j < word.length(); j++) {
                    if (word.charAt(j) == input) {
                        currentWordState[j] = input;
                        correctGuess = true;
                    }
                }

                if (!correctGuess) {
                    lives--;
                    incorrectGuesses.add(input);
                    System.out.println("Incorrect guess! Your attempts left: " + lives);
                }

                if (Arrays.equals(word.toCharArray(), currentWordState)) {
                    System.out.println("Congratulations! You guessed the word: " + word);
                    wins++;
                    break;
                }
            }

            if (lives == 0) {
                System.out.println("Sorry, you lost because you ran out of attempts. The hidden word is: " + word);
                losses++;
            }

            System.out.println("Wins: " + wins + " Losses: " + losses);
            System.out.print("Do you want to play again? (Yes/No): ");
            String playAgain = scanner.next().toLowerCase();
            if (!playAgain.equals("yes")) {
                continuePlaying = false;
            }
        }

        System.out.println("Thanks for playing man!");
        scanner.close();
    }
}
