public class LinearEquation {

    public String solve(double a, double b) {

        if (a == 0) {
            if (b == 0) {
                return "Vo so nghiem";
            } else {
                return "Vo nghiem";
            }
        }

        double x = -b / a;

        return "x = " + x;
    }
}