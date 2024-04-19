import java.util.Scanner;

public class PasswordMaker{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean AllConditionsMet = false;
    while (!AllConditionsMet) {
        System.out.println("Type your password.");
        String PasswordInput = scanner.nextLine();
        try {
        if (PasswordInput.length() < 10) {
            throw new Exception("Your password must have at least 10 characters.");
        }
        if (!PasswordInput.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\",.<>/?].*")){
                // .* means the match of any character after or before each character
                // [] is a character class 
                throw new Exception("Your password must have a special character.");
        } 
        if (!PasswordInput.matches(".*[0123456789].*")){
                throw new Exception("Your password must have numbers.");
            
        }
        if (!PasswordInput.matches(".*[ABCDEFGHIJKLMNOPQRSTUVWXYZ].*")){
                throw new Exception("Your password must have capital letters.");
        }
        if (!PasswordInput.matches(".*[abcdefghijklmnopqrstuvwxyz].*")){
                throw new Exception("Your password must have lowercase letters.");
        }
        // If all my conditions are met, set the thing to true.
        AllConditionsMet = true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    System.out.println("Felicidades bro hiciste tu password");
    

    

    }

}