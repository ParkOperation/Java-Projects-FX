import java.util.Scanner;

public class InfAdd {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type numbers and I will add them, to finish, type 0.");
        int Number = 0;
        int NumberInput;
        do{
        NumberInput = scanner.nextInt();
        Number = (Number + NumberInput);
        System.out.println(Number);
        }   
        while (NumberInput != 0);{
        }
        scanner.close();

    }
    
}

