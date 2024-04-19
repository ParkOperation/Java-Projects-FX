import java.util.Random;
import java.util.Scanner;

public class rps {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int HumanScore = 0;
        int ComputerScore = 0;
        String PlayerChoice = "";
        String ComputerChoiceString = "";

        while (true) {
            System.out.println("Welcome to the rock paper scissors game, please type Rock, Paper, or Scissors! Capital Sensitive! You can also say exit to stop.");
            try {
                PlayerChoice = scanner.nextLine();
                if (PlayerChoice.equals("exit")) {
                    break;
                }
                if (!PlayerChoice.equals("Rock") && !PlayerChoice.equals("Paper") && !PlayerChoice.equals("Scissors")) {
                    throw new Exception("Invalid Input");
                } else {
                    int ComputerChoice = random.nextInt(3);

                    switch (ComputerChoice) {
                        case 0:
                            ComputerChoiceString = "Rock";
                            break;
                        case 1:
                            ComputerChoiceString = "Paper";
                            break;
                        case 2:
                            ComputerChoiceString = "Scissors";
                            break;
                    }

                    System.out.println("Computer chose: " + ComputerChoiceString);

                    if (ComputerChoiceString.equals(PlayerChoice)) {
                        System.out.println("It's a tie!");
                    } else if ((PlayerChoice.equals("Rock") && ComputerChoiceString.equals("Scissors"))
                            || (PlayerChoice.equals("Scissors") && ComputerChoiceString.equals("Paper"))
                            || (PlayerChoice.equals("Paper") && ComputerChoiceString.equals("Rock"))) {
                        System.out.println("You win!");
                        HumanScore++;
                    } else {
                        System.out.println("Computer wins!");
                        ComputerScore++;
                    }
                    System.out.println("Current score: " + HumanScore + "-" + ComputerScore);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        scanner.close();
    }
}
