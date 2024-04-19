import java.util.*;

public class methodsassignment{
    static void NoParameters(){ // NO PARAMETERS
        System.out.println("No parameter function");
    }
    static int sum(int x , int y){ // WITH PARAMETERS
        System.out.println(x + y);
        return x + y;
    }
    static String greeting(){ // WITH RETURN VALUE
        return "Hello Sir";

    }
    static int division(int x , int y){ // DIVISION WITH RETURN VALUE
        return x / y;
    }
    static void NoReturn(){ // NO RETURN VALUE
        System.out.println("No return value.");
    }
    static double sum(double x, double y){ // Method Overload
        double result = x + y;
        return result;

    }
    public static void main(String[] args) {
        int intsum = sum(8, 5);
        double doublesum = sum(4.3, 6.26);
        System.out.println("int: " + intsum);
        System.out.println("double: " + doublesum);

        NoParameters();
        greeting();
        division(10, 2);
        NoReturn();
    }
}