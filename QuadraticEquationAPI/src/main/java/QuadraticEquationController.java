import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/quadratic-equation")
public class QuadraticEquationController {
    private final QuadraticEquationSolver solver;

    public QuadraticEquationController() {
        this.solver = new QuadraticEquationSolver();
    }

    @PostMapping("/solve")
    public ResponseEntity<String> solveQuadraticEquation(@RequestBody QuadraticEquationDTO equation) {
        QuadraticEquationSolver solver = new QuadraticEquationSolver();
        String solution = solver.solveQuadraticEquation(equation);
        return ResponseEntity.ok(solution);
    }
}
