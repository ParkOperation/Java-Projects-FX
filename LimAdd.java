import java.util.Scanner;

public class LimAdd {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a number and i will add all of the numbers below it.");
        int Number = 0;
        int NumberSum = scanner.nextInt();

        for (int i = NumberSum; i >= 1; i--){
        Number += i;
        }
        System.out.println("Your total is: " + Number);
        scanner.close();
      

    }
    
    
}

