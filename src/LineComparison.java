import java.util.Scanner;

/**
 * The LineComparison class calculates the length of a line segment
 * using Cartesian coordinates (x, y) based on user input. It also
 * provides a method to compare two lines based on their lengths.
 */
public class LineComparison implements Comparable<LineComparison> {
    private final int x1, x2, y1, y2;

    /**
     * Constructs a LineComparison object with the specified endpoints.
     *
     * @param x1 The x-coordinate of the first endpoint.
     * @param y1 The y-coordinate of the first endpoint.
     * @param x2 The x-coordinate of the second endpoint.
     * @param y2 The y-coordinate of the second endpoint.
     */
    public LineComparison(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    /**
     * Calculates the length of the line segment using Cartesian coordinates.
     *
     * @return The length of the line segment.
     */
    public double calculateLength() {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    /**
     * Compares two lines based on their lengths.
     *
     * @param otherLine The other LineComparison object to compare.
     * @return 0 if the lines are equal, a positive value if this line is greater,
     *         a negative value if this line is smaller.
     */
    @Override
    public int compareTo(LineComparison otherLine) {
        double thisLength = this.calculateLength();
        double otherLength = otherLine.calculateLength();

        // Compare lengths
        return Double.compare(thisLength, otherLength);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");

        // Input for the first line
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the endpoints of the first line:");
        System.out.print("x1: ");
        int x1 = sc.nextInt();
        System.out.print("y1: ");
        int y1 = sc.nextInt();
        System.out.print("x2: ");
        int x2 = sc.nextInt();
        System.out.print("y2: ");
        int y2 = sc.nextInt();

        LineComparison line1 = new LineComparison(x1, y1, x2, y2);

        // Input for the second line
        System.out.println("Enter the endpoints of the second line:");
        System.out.print("x1: ");
        int x3 = sc.nextInt();
        System.out.print("y1: ");
        int y3 = sc.nextInt();
        System.out.print("x2: ");
        int x4 = sc.nextInt();
        System.out.print("y2: ");
        int y4 = sc.nextInt();

        LineComparison line2 = new LineComparison(x3, y3, x4, y4);

        // Compare lengths of lines
        int result = line1.compareTo(line2);

        // Display the result of the comparison
        if (result == 0) {
            System.out.println("Both lines are equal in length.");
        } else if (result > 0) {
            System.out.println("Line 1 is greater than Line 2 in length.");
        } else {
            System.out.println("Line 1 is smaller than Line 2 in length.");
        }
    }
}
