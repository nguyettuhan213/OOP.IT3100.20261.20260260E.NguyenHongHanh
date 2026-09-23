import java.util.Scanner;

public class MaxMinDiscount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;

        while (true) {
            System.out.print("Enter number of media items: ");
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n > 0) {
                    scanner.nextLine();
                    break;
                }
                System.out.println("The number of items must be greater than 0.");
            } else {
                System.out.println("Invalid input! Please enter an integer.");
                scanner.next();
            }
        }

        String[] titles = new String[n];
        double[] costs = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nItem " + (i + 1) + ":");
            System.out.print("Enter title: ");
            titles[i] = scanner.nextLine();

            while (true) {
                System.out.print("Enter cost ($): ");
                if (scanner.hasNextDouble()) {
                    costs[i] = scanner.nextDouble();
                    if (costs[i] >= 0) {
                        scanner.nextLine();
                        break;
                    }
                    System.out.println("Cost cannot be negative.");
                } else {
                    System.out.println("Invalid input! Please enter a valid number.");
                    scanner.next();
                }
            }
        }

        MediaManager manager = new MediaManager(titles, costs);

        int maxIdx = manager.getIndexOfMaxCost();
        int minIdx = manager.getIndexOfMinCost();
        double totalCost = manager.calculateTotalCost();

        System.out.println();
        System.out.printf("Max: %s ($%.2f)\n", manager.getTitleAt(maxIdx), manager.getCostAt(maxIdx));
        System.out.printf("Min: %s ($%.2f)\n", manager.getTitleAt(minIdx), manager.getCostAt(minIdx));
        System.out.printf("Total after discount: $%.2f\n", totalCost);

        scanner.close();
    }
}