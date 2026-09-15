import javax.swing.JOptionPane;

public class CalculateTwoNumbers {
    public static void main(String[] args) {

        double num1 = Double.parseDouble(
            JOptionPane.showInputDialog("Enter first number:")
        );

        double num2 = Double.parseDouble(
            JOptionPane.showInputDialog("Enter second number:")
        );

        Calculator calculator = new Calculator();

        double sum = calculator.sum(num1, num2);
        double difference = calculator.difference(num1, num2);
        double product = calculator.product(num1, num2);

        String result = "Sum: " + sum + "\nDifference: " + difference + "\nProduct: " + product;

        if (num2 != 0) {
            result += "\nQuotient: " + calculator.quotient(num1, num2);
        } else {
            result += "\nCannot divide by zero.";
        }

        JOptionPane.showMessageDialog(null, result);
    }
}