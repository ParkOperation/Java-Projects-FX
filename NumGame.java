import java.util.Scanner;
import java.util.Random;
public class NumGame {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    int maxnum = 101;
    int RandomNumber = random.nextInt(maxnum);
    int UserInput = 0;
    System.out.println("Welcome to the Number Guessing game, the system has generated a number between 1 and 100 and you must guess it, good luck!");
    while (UserInput != RandomNumber){
    System.out.println("Guess the secret number!");
    UserInput = scanner.nextInt();
    if (RandomNumber > UserInput){
        System.out.print("Try Higher! ");
    }
    else if (RandomNumber < UserInput){
        System.out.println("Try Lower! ");
    }
    else{
        System.out.println("Congratulations, you guessed the number!");
    }
    }
    scanner.close();
    }
    }


