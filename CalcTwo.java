import java.util.Scanner;

public class CalcTwo {
    private String choice;
    private double a, b, c, h; 
    private double area; 

    public CalcTwo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Only a quadrat, a rectangle and a triangle can be typed in (the first letter suffices). Please specify the geometric shape of the object whose area should be calculated: ");
        String choice = sc.nextLine();

        switch (choice) {
            case "q":
                System.out.println("Please provide the a variable: ");
                a = sc.nextDouble();
                area = a*a;
                System.out.println("The area equals " + area);
            case "r":
                System.out.println("Please provide the variable a: ");
                a = sc.nextDouble();
                System.out.println("Please provide the variable b: ");
                b = sc.nextDouble();
                area = a*b;
                System.out.println("The area equals " + area);
            case "t":
                System.out.println("Please provide the length of the base line, c: ");
                c = sc.nextDouble();
                System.out.println("Please provide the height of the triangle, h: ");
                h = sc.nextDouble();
                area =  0.5 * c * h;
                System.out.println("The area equals " + area);
        }
        sc.close(); // memory leak prevention
        System.exit(1); // exits
    }
}