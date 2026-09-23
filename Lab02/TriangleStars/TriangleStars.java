import java.util.Scanner;

public class TriangleStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;

        while (true) {
            System.out.print("Enter height n: ");
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n > 0) {
                    break;
                } else {
                    System.out.println("Please enter a positive integer greater than 0.");
                }
            } else {
                System.out.println("Invalid input! Please enter an integer, not a string.");
                scanner.next();
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}