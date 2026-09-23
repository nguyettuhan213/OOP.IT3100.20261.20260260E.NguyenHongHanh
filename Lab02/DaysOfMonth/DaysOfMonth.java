import java.util.Scanner;

public class DaysOfMonth {
    private static int promptValidMonth(Scanner scanner) {
        while (true) {
            System.out.print("Enter month: ");
            String rawMonth = scanner.nextLine();
            int month = YearMonthHelper.parseMonth(rawMonth);
            if (month != -1) {
                return month;
            }
            System.out.println("Invalid month! Please enter again.");
        }
    }

    private static int promptValidYear(Scanner scanner) {
        while (true) {
            System.out.print("Enter year: ");
            String rawYear = scanner.nextLine().trim();
            if (rawYear.matches("\\d{4}")) {
                try {
                    int year = Integer.parseInt(rawYear);
                    if (year >= 0) {
                        return year;
                    }
                } catch (NumberFormatException ignored) {
                }
            }
            System.out.println("Invalid year! Please enter a 4-digit non-negative number.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int month = promptValidMonth(scanner);
        int year = promptValidYear(scanner);

        YearMonthHelper helper = new YearMonthHelper(month, year);
        int days = helper.getNumberOfDays();

        System.out.println("Number of days: " + days);

        scanner.close();
    }
}