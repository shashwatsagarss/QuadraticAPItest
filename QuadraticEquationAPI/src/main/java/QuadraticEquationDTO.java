import com.fasterxml.jackson.annotation.JsonProperty;

public class QuadraticEquationDTO {
    private double a;
    private double b;
    private double c;

    public QuadraticEquationDTO(@JsonProperty("a") double a,
                                @JsonProperty("b") double b,
                                @JsonProperty("c") double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
}
