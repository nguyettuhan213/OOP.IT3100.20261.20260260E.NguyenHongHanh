public class QuadraticEquation {

    private LinearEquation linearEquation = new LinearEquation();

    public String solve(double a, double b, double c) {

        // Truong hop a = 0
        if (a == 0) {
            return linearEquation.solve(b, c);
        }

        // Tinh delta
        double delta = b * b - 4 * a * c;

        // Vo nghiem
        if (delta < 0) {
            return "Vo nghiem";
        }

        // Nghiem kep
        if (delta == 0) {

            double x = -b / (2 * a);

            return "Nghiem kep x = " + x;
        }

        // Hai nghiem phan biet
        double x1 = (-b + Math.sqrt(delta)) / (2 * a);

        double x2 = (-b - Math.sqrt(delta)) / (2 * a);

        return "x1 = " + x1 + "\n"
                + "x2 = " + x2;
    }
}