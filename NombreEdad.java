import java.util.InputMismatchException;
import java.util.Scanner;

public class NombreEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Dame tu nombre");
            String name = scanner.nextLine();

            System.out.println("Dame tu edad");
            int age = scanner.nextInt();

            if (age < 0) {
                throw new IllegalArgumentException("La edad no puede ser negativa");
            }

            System.out.println("Bienvenido, " + name + " , tu edad es " + age);
        } catch (InputMismatchException e) {
            System.out.println("Debes ingresar un número entero para la edad.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Se ha producido un error: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Gracias");
        }
    }
}
