import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class guiJava extends JFrame {
    private JTextField textField1, textField2;
    private JButton calculateButton;
    private JLabel resultLabel;

    public guiJava() {
        // Set up the frame
        setTitle("Sum Calculator");
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create components
        textField1 = new JTextField(10);
        textField2 = new JTextField(10);
        calculateButton = new JButton("Calculate");
        resultLabel = new JLabel("Result: ");

        // Add action listener to the button
        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int value1 = Integer.parseInt(textField1.getText());
                    int value2 = Integer.parseInt(textField2.getText());
                    int sum = value1 + value2;
                    resultLabel.setText("Result: " + sum);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Result: Invalid input");
                }
            }
        });

        // Set layout
        setLayout(new FlowLayout());

        // Add components to the frame
        add(new JLabel("Enter value 1:"));
        add(textField1);
        add(new JLabel("Enter value 2:"));
        add(textField2);
        add(calculateButton);
        add(resultLabel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new guiJava().setVisible(true);
            }
        });
    }
}
