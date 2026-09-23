public class CostArrayHelper {
    private double[] costs;

    public CostArrayHelper(double[] costs) {
        this.costs = costs;
    }

    public void sortAscending() {
        for (int i = 0; i < costs.length - 1; i++) {
            for (int j = i + 1; j < costs.length; j++) {
                if (costs[i] > costs[j]) {
                    double temp = costs[i];
                    costs[i] = costs[j];
                    costs[j] = temp;
                }
            }
        }
    }

    public double calculateSum() {
        double sum = 0.0;
        for (int i = 0; i < costs.length; i++) {
            sum += costs[i];
        }
        return sum;
    }

    public double calculateAverage() {
        return calculateSum() / costs.length;
    }

    public void printArray() {
        System.out.print("[");
        for (int i = 0; i < costs.length; i++) {
            System.out.print(costs[i]);
            if (i < costs.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}