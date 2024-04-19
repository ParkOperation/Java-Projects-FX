import java.util.Scanner;

public class Logic {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first num: ");
        int number1 = scanner.nextInt();
        System.out.println("Enter second num: ");
        int number2 = scanner.nextInt();
        System.out.println("Enter third num: ");
        int number3 = scanner.nextInt();

        if (number1 > number2 && number1 > number3){
             System.out.println("The first number is the greatest");

        }
        else if (number2 > number1 && number2 > number3){
            System.out.println("The second number is the greatest");
        }
        else if (number1 == number2 && number1 == number3){
            System.out.println("All numbers are the same.");
        }
        else{
            System.out.println("The third number is the greatest");
        }
        scanner.close();

     


    }
    
}
