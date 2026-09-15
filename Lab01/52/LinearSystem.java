public class LinearSystem {

    public String solve(
            double a11, double a12, double b1,
            double a21, double a22, double b2) {

        double D = a11 * a22 - a21 * a12;

        // Tinh D1
        double D1 = b1 * a22 - b2 * a12;

        // Tinh D2
        double D2 = a11 * b2 - a21 * b1;

        if (D != 0) {

            double x1 = D1 / D;
            double x2 = D2 / D;

            return "x1 = " + x1 + "\n"
                    + "x2 = " + x2;
        }

        if (D1 == 0 && D2 == 0) {
            return "Vo so nghiem";
        }

        return "Vo nghiem";
    }
}