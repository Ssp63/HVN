import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FactorialCalculator extends JFrame implements ActionListener {
    private JTextField numField;
    private JTextArea resultArea;
    private JButton calcButton;

    public FactorialCalculator() {
        setTitle("Factorial Calculator");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        numField = new JTextField(10);
        resultArea = new JTextArea(5, 20);
        resultArea.setEditable(false);

        calcButton = new JButton("Calculate");
        calcButton.addActionListener(this);

        add(new JLabel("Enter a number: "));
        add(numField);
        add(calcButton);
        add(new JScrollPane(resultArea));

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int num = Integer.parseInt(numField.getText());
            long factorial = 1;
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
            resultArea.setText("Factorial of " + num + " is: " + factorial);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid input. Please enter a valid integer.");
        }
    }

    public static void main(String[] args) {
        new FactorialCalculator();
    }
}

