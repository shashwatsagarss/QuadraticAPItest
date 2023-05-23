import java.util.ArrayList;
import java.util.List;

public class QuadraticEquationSolver {
    public String solveQuadraticEquation(QuadraticEquationDTO equation) {
        double a = equation.getA();
        double b = equation.getB();
        double c = equation.getC();

        // Calculate the discriminant
        double discriminant = b * b - 4 * a * c;

        List<Double> solutions = new ArrayList<>();

        if (discriminant > 0) {
            // Two distinct real solutions
            double sqrtDiscriminant = Math.sqrt(discriminant);
            double x1 = (-b + sqrtDiscriminant) / (2 * a);
            double x2 = (-b - sqrtDiscriminant) / (2 * a);
            solutions.add(x1);
            solutions.add(x2);
        } else if (discriminant == 0) {
            // One real solution (repeated root)
            double x = -b / (2 * a);
            solutions.add(x);
        }

        // Format the solutions as a string
        String solutionString;
        if (solutions.isEmpty()) {
            solutionString = "No real solutions";
        } else {
            solutionString = solutions.toString();
        }

        return solutionString;
    }
}
