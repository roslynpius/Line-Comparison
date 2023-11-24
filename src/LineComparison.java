import java.util.Scanner;

/**
 * The LineComparison class calculates the length of a line segment
 * using Cartesian coordinates (x, y) based on user input.
 */
public class LineComparison
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to Line Comparison Computation Program");
        int x1,x2,y1,y2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x1 :");
        x1 = sc.nextInt();
        System.out.println("Enter the value of y1 :");
        y1 = sc.nextInt();
        System.out.println("Enter the value of x2 :");
        x2 = sc.nextInt();
        System.out.println("Enter the value of y2 :");
        y2 = sc.nextInt();
        double length = Math.sqrt(Math.pow(x2-x1,2)+ Math.pow(y2-y1,2));
        System.out.println("The length of a line using cartesian system = " +length);

    }
}
