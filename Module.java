import java.util.Scanner;

public class Module{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number: ");
        int number = scanner.nextInt();
        int numbertotal = (number % 2);
        if (numbertotal != 0){
            System.out.println("Your number is odd.");
        }
        else{
            System.out.println("Your number is even.");
        }
        scanner.close();
    }
}