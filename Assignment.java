import java.util.*;

public class Assignment {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{



        System.out.println("Give me 3 numbers and i'll give you the average.");
        double Num1 = scanner.nextDouble();
        double Num2 = scanner.nextDouble();
        double Num3 = scanner.nextDouble();
        double average = (Num1 + Num2 + Num3) / 3;
        System.out.println("Average of numbers: " + average);




        System.out.println("Choose the conversion you want:\n1) Celsius to Fahrenheit\n2) Fahrenheit to Celsius");
        int input = scanner.nextInt();
        if (input == 1) {
            System.out.println("Give me your temperature in Celsius.");
            double c = scanner.nextDouble();
            double f = (c * 9 / 5) + 32;
            System.out.println("Temperature in Fahrenheit: " + f);
        } else if (input == 2) {
            System.out.println("Give me your temperature in Fahrenheit.");
            double f = scanner.nextDouble();
            double c = (f - 32) * 5 / 9;
            System.out.println("Temperature in Celsius: " + c);
        } else {
            System.out.println("Invalid input");
        }



        System.out.println("Give me 2 numbers and i'll swap them.");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println("Before swapping: x = " + x + ", y = " + y);
        int change = x;
        x = y;
        y = change;
        System.out.println("After swapping: x = " + x + ", y = " + y);




        System.out.println("First 30 natural numbers:");
        for (int i = 1; i <= 30; i++) {
            System.out.print(i + ", ");
        }
        System.out.println();



        System.out.println("Give me a number and i'll give you the multiplication table for it.");
        int mult = scanner.nextInt();
        System.out.println("Multiplication table for " + mult + ":");
        for (int i = 1; i <= 12; i++) {
            System.out.println(mult + " x " + i + " = " + (mult * i));
        }



        System.out.println("Give me length and width of a rectangle.");
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();
        double RectangleArea = length * width;
        System.out.println("Area of rectangle: " + RectangleArea);



        System.out.println("Give me radius of a circle.");
        double r = scanner.nextDouble();
        double CircleArea = Math.PI * Math.pow(r, 2);
        System.out.println("Area of circle: " + CircleArea);



        System.out.println("Give me the length of one of the sides of a square.");
        double SideLength = scanner.nextDouble();
        double SquareArea = Math.pow(SideLength, 2);
        System.out.println("Area of square: " + SquareArea);



        System.out.println("Give me the base and height of a triangle.");
        double base = scanner.nextDouble();
        double HeightTriangle = scanner.nextDouble();
        double TriangleArea = 0.5 * base * HeightTriangle;
        System.out.println("Area of triangle: " + TriangleArea);



        System.out.println("Give me a year and i'll tell you if it's leap or not.");
        int yr = scanner.nextInt();
        boolean LeapYearTF = (yr % 4 == 0 && yr % 100 != 0) || (yr % 400 == 0);
        System.out.println("Is it a leap year? " + LeapYearTF);
    }
    catch (Exception e){
        System.out.println("Something went wrong.");
    }

        scanner.close();
    }
}
