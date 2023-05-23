import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;

import static org.junit.jupiter.api.Assertions.assertEquals;

class QuadraticEquationControllerTest {

    private QuadraticEquationController controller;

    @BeforeEach
    void setUp() {
        controller = new QuadraticEquationController();
    }

    @Test
    void solveQuadraticEquation_ShouldReturnSolutions() {
        QuadraticEquationDTO equation = new QuadraticEquationDTO(1, -5, 6);
        String expectedSolution = "[3.0, 2.0]";

        String actualSolution = controller.solveQuadraticEquation(equation).getBody();

        assertEquals(expectedSolution, actualSolution);
    }

    @Test
    void solveQuadraticEquation_ShouldReturnNoSolutions() {
        QuadraticEquationDTO equation = new QuadraticEquationDTO(2, 1, 2);
        String expectedSolution = "No real solutions";

        String actualSolution = controller.solveQuadraticEquation(equation).getBody();

        assertEquals(expectedSolution, actualSolution);
    }


}
