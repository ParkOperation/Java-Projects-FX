import java.util.Scanner;

public class Subtract {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tell me your first number for a subtraction: ");
        int number1 = scanner.nextInt();
        System.out.println("Tell me the second number of your subtraction: ");
        int number2 = scanner.nextInt();
        System.out.println("Your result is: " + (number1 - number2));
        scanner.close();
    }

    
}
