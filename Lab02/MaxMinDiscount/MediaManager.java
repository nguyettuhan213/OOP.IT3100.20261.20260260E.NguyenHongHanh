public class MediaManager {
    private String[] titles;
    private double[] costs;

    public MediaManager(String[] titles, double[] costs) {
        this.titles = titles;
        this.costs = costs;
    }

    public int getIndexOfMaxCost() {
        int maxIndex = 0;
        for (int i = 1; i < costs.length; i++) {
            if (costs[i] > costs[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public int getIndexOfMinCost() {
        int minIndex = 0;
        for (int i = 1; i < costs.length; i++) {
            if (costs[i] < costs[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    public double calculateTotalCost() {
        double total = 0.0;
        for (int i = 0; i < costs.length; i++) {
            if (costs[i] > 20.0) {
                total += costs[i] * 0.9;
            } else {
                total += costs[i];
            }
        }
        return total;
    }

    public String getTitleAt(int index) {
        return titles[index];
    }

    public double getCostAt(int index) {
        return costs[index];
    }
}