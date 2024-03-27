import java.awt.*;
import javax.swing.*;


public class SimpleCalculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextField textField = new JTextField(16);
        frame.add(textField, BorderLayout.NORTH);

        String buttons[] = { "7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", ".", "=", "+" };
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));

        for (int i = 0; i < buttons.length; i++) {
            JButton button = new JButton(buttons[i]);
            panel.add(button);
        }

        frame.add(panel, BorderLayout.CENTER);
        frame.setBounds(800, 400, 500, 500);
        // frame.setSize(200, 200);
        frame.setVisible(true);
        frame.setResizable(false);
    }
}
