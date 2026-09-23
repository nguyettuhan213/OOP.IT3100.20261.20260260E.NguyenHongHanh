import java.util.Scanner;

public class SortCostArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 0;

        while (true) {
            System.out.print("Enter number of elements: ");
            if (scanner.hasNextInt()) {
                size = scanner.nextInt();
                if (size > 0) {
                    break;
                }
                System.out.println("Size must be greater than 0.");
            } else {
                System.out.println("Invalid input! Please enter an integer.");
                scanner.next();
            }
        }

        double[] costs = new double[size];
        System.out.println("Enter the cost elements:");
        for (int i = 0; i < size; i++) {
            while (true) {
                System.out.print("Element [" + i + "]: ");
                if (scanner.hasNextDouble()) {
                    costs[i] = scanner.nextDouble();
                    break;
                } else {
                    System.out.println("Invalid input! Please enter a number.");
                    scanner.next();
                }
            }
        }

        CostArrayHelper helper = new CostArrayHelper(costs);

        System.out.print("\nOriginal array: ");
        helper.printArray();

        helper.sortAscending();

        System.out.print("Sorted array: ");
        helper.printArray();

        System.out.printf("Sum: %.2f\n", helper.calculateSum());
        System.out.printf("Average: %.2f\n", helper.calculateAverage());

        scanner.close();
    }
}