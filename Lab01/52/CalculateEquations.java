import javax.swing.JOptionPane;

public class CalculateEquations {

    public static void main(String[] args) {

        LinearEquation linear = new LinearEquation();
        LinearSystem system = new LinearSystem();
        QuadraticEquation quadratic = new QuadraticEquation();

        String choice = JOptionPane.showInputDialog(
                "CHON BAI TOAN\n"
                + "1. Phuong trinh bac nhat\n"
                + "2. He phuong trinh bac nhat hai an\n"
                + "3. Phuong trinh bac hai\n\n"
                + "Nhap lua chon (1-3):"
        );

        if (choice == null) {
            return;
        }

        int option = Integer.parseInt(choice);

        switch (option) {

            case 1:

                double a = Double.parseDouble(
                        JOptionPane.showInputDialog("Nhap a:")
                );

                double b = Double.parseDouble(
                        JOptionPane.showInputDialog("Nhap b:")
                );

                String result1 = linear.solve(a, b);

                JOptionPane.showMessageDialog(
                        null,
                        "Phuong trinh bac nhat:\n" + result1
                );

                break;

            case 2:

                double a11 = Double.parseDouble(
                        JOptionPane.showInputDialog("Nhap a11:")
                );

                double a12 = Double.parseDouble(
                        JOptionPane.showInputDialog("Nhap a12:")
                );

                double b1 = Double.parseDouble(
                        JOptionPane.showInputDialog("Nhap b1:")
                );

                double a21 = Double.parseDouble(
                        JOptionPane.showInputDialog("Nhap a21:")
                );

                double a22 = Double.parseDouble(
                        JOptionPane.showInputDialog("Nhap a22:")
                );

                double b2 = Double.parseDouble(
                        JOptionPane.showInputDialog("Nhap b2:")
                );

                String result2 = system.solve(
                        a11, a12, b1,
                        a21, a22, b2
                );

                JOptionPane.showMessageDialog(
                        null,
                        "He phuong trinh:\n" + result2
                );

                break;

            case 3:

                double qa = Double.parseDouble(
                        JOptionPane.showInputDialog("Nhap a:")
                );

                double qb = Double.parseDouble(
                        JOptionPane.showInputDialog("Nhap b:")
                );

                double qc = Double.parseDouble(
                        JOptionPane.showInputDialog("Nhap c:")
                );

                String result3 = quadratic.solve(qa, qb, qc);

                JOptionPane.showMessageDialog(
                        null,
                        "Phuong trinh bac hai:\n" + result3
                );

                break;

            default:

                JOptionPane.showMessageDialog(
                        null,
                        "Lua chon khong hop le!"
                );
        }
    }
}