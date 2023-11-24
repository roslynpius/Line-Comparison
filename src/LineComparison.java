import java.util.Scanner;

/**
 * The LineComparison class calculates the length of a line segment
 * using Cartesian coordinates (x, y) based on user input. It also
 * provides a method to check the equality of two lines based on their endpoints.
 */
public class LineComparison {
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
     * Checks the equality of two lines based on their endpoints.
     *
     * @param otherLine The other LineComparison object to compare.
     * @return true if the lines have the same endpoints, false otherwise.
     */
    public boolean isEqual(LineComparison otherLine) {
        return this.x1 == otherLine.x1 && this.y1 == otherLine.y1 &&
                this.x2 == otherLine.x2 && this.y2 == otherLine.y2;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        LineComparison that = (LineComparison) obj;
        return x1 == that.x1 && x2 == that.x2 && y1 == that.y1 && y2 == that.y2;
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

        // Calculate and display the lengths of both lines
        double length1 = line1.calculateLength();
        double length2 = line2.calculateLength();
        System.out.println("Length of Line 1: " + length1);
        System.out.println("Length of Line 2: " + length2);

        // Check equality of lines
        if (line1.isEqual(line2)) {
            System.out.println("Both lines have the same endpoints.");
        } else {
            System.out.println("Lines do not have the same endpoints.");
        }
    }
}
