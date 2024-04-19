import java.util.Scanner;

public class math{
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Give me number: ");
    int number = scanner.nextInt();
    if (number > 0){
        System.out.println("Your number is positive.");
    }
    else if (number < 0){
        System.out.println("Your number is negative.");
    }
    else{
        System.out.println("Your number is 0.");
    }
    scanner.close();


    

    }
}