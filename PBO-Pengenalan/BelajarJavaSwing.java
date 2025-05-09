import javax.swing.*;

public class BelajarJavaSwing {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Belajar JAVA");
        JTextArea textArea = new JTextArea();

        textArea.setText("Belajar JAVA\nSangat mudah sekali\n dan sangat menyenangkan");
        textArea.setEditable(false);

        frame.add(textArea);
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
