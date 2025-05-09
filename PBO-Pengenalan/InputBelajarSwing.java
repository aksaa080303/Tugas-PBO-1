import javax.swing.*;

public class InputBelajarSwing {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Anda sedang belajar apa?", "Input", JOptionPane.QUESTION_MESSAGE);

        if (input != null && !input.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Belajar " + input + " sangat mudah", "Message", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Tidak ada input yang diberikan", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
    }
}
