import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionLesson {
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);

    try{
        System.out.println("Give me a number between 1-10");
        int[] list = {0,1,2,3,4,5,6,7,8,9,10,};
        int numberselection = input.nextInt();
        if (numberselection < 1 || numberselection > 10){
            throw new ArrayIndexOutOfBoundsException("That number is not between 1-10");
            
        }
    }
    catch (InputMismatchException error){
        System.out.println("etupido");

    }
    catch (ArrayIndexOutOfBoundsException error){
        System.out.println("That number is not between 1-10");
    }
    finally{
        System.out.println("Thanks");

    }
}
}