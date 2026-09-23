
import javax.swing.JOptionPane;

public class ChoosingOption {

    public static void main(String[] args) {
        String[] customOptions = {"I do", "I don't"};

        int option = JOptionPane.showOptionDialog(
                null,
                "Do you want to change to the first class ticket?",
                "Dialog",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                customOptions,
                customOptions[0]
        );
        JOptionPane.showMessageDialog(null, "You're chosen: " + (option == JOptionPane.YES_OPTION ? "YES" : "NO"));

        System.exit(0);
    }
}
