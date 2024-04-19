import java.util.Scanner;
public class Calculator {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the calculator! Press \" + \" for a sum, Press \" - \" for a subtraction.");
        System.out.println("Press \" * \" for a multiplication, and \" / \" for a division.");
        String operation = scanner.nextLine();

        if (operation.equals("-")){
        System.out.println("Tell me your first number for a subtraction: ");
        int number1 = scanner.nextInt();
        System.out.println("Tell me the second number of your subtraction: ");
        int number2 = scanner.nextInt();
        System.out.println("Your result is: " + (number1 - number2));
        }
        else if (operation.equals("+")){
        System.out.println("Tell me your first number for a addition: ");
        int number1 = scanner.nextInt();
        System.out.println("Tell me the second number of your addition: ");
        int number2 = scanner.nextInt();
        System.out.println("Your result is: " + (number1 + number2));
        }
        else if (operation.equals("*")){
        System.out.println("Tell me your first number for a multiplication: ");
        int number1 = scanner.nextInt();
        System.out.println("Tell me the second number of your multiplication: ");
        int number2 = scanner.nextInt();
        System.out.println("Your result is: " + (number1 * number2));
        }
        else if (operation.equals("-")){
        System.out.println("Tell me your first number for a division: ");
        int number1 = scanner.nextInt();
        System.out.println("Tell me the second number of your division: ");
        int number2 = scanner.nextInt();
        System.out.println("Your result is: " + (number1 / number2));
        }
        else{
            System.out.println("Invalid Input");
        }
        scanner.close();

    }
    
}
