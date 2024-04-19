import java.util.Scanner;

public class Logic2 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first num: ");
        int number1 = scanner.nextInt();
        System.out.println("Enter second num: ");
        int number2 = scanner.nextInt();

        if (number1 > number2){
             System.out.println("The first number is the greatest");
        }

        else{
            System.out.println("The second number is the greatest");
        }
        scanner.close();

     


    }
    
}
