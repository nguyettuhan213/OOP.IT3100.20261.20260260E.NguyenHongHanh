public class Calculator {

    public double sum(double a, double b) {
        return a + b;
    }

    public double difference(double a, double b) {
        return a - b;
    }

    public double product(double a, double b) {
        return a * b;
    }

    public double quotient(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }

        return a / b;
    }
}
