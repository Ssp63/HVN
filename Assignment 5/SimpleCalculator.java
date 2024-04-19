import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// This class represents a simple calculator with addition, subtraction, multiplication, and division operations
public class SimpleCalculator extends JFrame implements ActionListener {

    // Declare and initialize the text fields and buttons for the calculator
    private JTextField numField1, numField2, resultField;
    private JButton addButton, subButton, mulButton, divButton;

    // Constructor for the SimpleCalculator class
    public SimpleCalculator() {
        // Set the title, size, and default close operation for the JFrame
        setTitle("Simple Calculator");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2));

        // Initialize the text fields and result field
        numField1 = new JTextField();
        numField2 = new JTextField();
        resultField = new JTextField();
        resultField.setEditable(false);

        // Initialize the buttons and add action listeners
        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");

        addButton.addActionListener(this);
        subButton.addActionListener(this);
        mulButton.addActionListener(this);
        divButton.addActionListener(this);

        // Add the components to the JFrame
        add(new JLabel("Number 1: "));
        add(numField1);
        add(new JLabel("Number 2: "));
        add(numField2);
        add(new JLabel("Result: "));
        add(resultField);
        add(addButton);
        add(subButton);
        add(mulButton);
        add(divButton);

        // Set the JFrame to be visible
        setVisible(true);
    }

    // This method is called when a button is clicked
    public void actionPerformed(ActionEvent e) {
        try {
            // Parse the text from the text fields as doubles
            double num1 = Double.parseDouble(numField1.getText());
            double num2 = Double.parseDouble(numField2.getText());

            // Initialize the result variable
            double result = 0;

            // Calculate the result based on the button clicked
            if (e.getSource() == addButton)
                result = num1 + num2;
            else if (e.getSource() == subButton)
                result = num1 - num2;
            else if (e.getSource() == mulButton)
                result = num1 * num2;
            else if (e.getSource() == divButton)
                result = num1 / num2;

            // Set the result text field to display the result
            resultField.setText(String.valueOf(result));
        } catch (NumberFormatException ex) {
            // Display an error message if the input is invalid
            JOptionPane.showMessageDialog(this, "Invalid input. Please enter valid numbers.");
        } catch (ArithmeticException ex) {
            // Display an error message if there is an arithmetic error
            JOptionPane.showMessageDialog(this, "Arithmetic Error: " + ex.getMessage());
        }
    }

    // The main method to run the SimpleCalculator application
    public static void main(String[] args) {
        // Create a new instance of the SimpleCalculator class
        new SimpleCalculator();
    }
}