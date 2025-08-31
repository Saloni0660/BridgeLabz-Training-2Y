import java.util.Scanner;

public class Quadratic {

    public static double[] findRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c;
        
        if (delta > 0) {
            // Two distinct roots
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2};
        } else if (delta == 0) {
            // One root
            double root = -b / (2 * a);
            return new double[]{root};
        } else {
            // No real roots, return empty array
            return new double[]{};
        }
    }

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
                  
        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();
        
        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();
        
        double[] roots = findRoots(a, b, c);
        
        if (roots.length == 2) {
            System.out.println("Roots are: " + roots[0] + " and " + roots[1]);
        } else if (roots.length == 1) {
            System.out.println("Root is: " + roots[0]);
        } else {
            System.out.println("No real roots.");
        }

        }
    }
}
