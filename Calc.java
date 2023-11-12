import java.util.Scanner;

public class Calc {
    private String choice;
    private double a, b, c, h; 
    private double area; 

    public Calc() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Only a square, a rectangle and a triangle can be typed in. Please specify the geometric shape of the object whose area should be calculated: ");

        do {
            String choice = sc.nextLine();
            if (choice.equals("square")) {
            System.out.println("Please provide the a variable: ");
            a = sc.nextDouble();
            area = a*a;
            System.out.println("The area equals " + area);
            System.exit(1);
            } else if (choice.equals("rectangle")) {
            System.out.println("Please provide the variable a: ");
            a = sc.nextDouble();
            System.out.println("Please provide the variable b: ");
            b = sc.nextDouble();
            area = a*b;
            System.out.println("The area equals " + area);
            System.exit(1);
            } else if (choice.equals("triangle")) {
            System.out.println("Please provide the length of the base line, c: ");
            c = sc.nextDouble();
            System.out.println("Please provide the height of the triangle, h: ");
            h = sc.nextDouble();
            area =  0.5 * c * h;
            System.out.println("The area equals " + area);
            System.exit(1);
            } else {
            System.out.println("You did not specify the geometric shape correctly.");
            System.exit(1);
            }
        } while(true);
    }
}