import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentRegistration extends JFrame implements ActionListener {
    private JTextField nameField, ageField, addressField;
    private JButton submitButton;

    public StudentRegistration() {
        setTitle("Student Registration Form");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2));

        nameField = new JTextField(10);
        ageField = new JTextField(10);
        addressField = new JTextField(10);

        submitButton = new JButton("Submit");
        submitButton.addActionListener(this); // Adding ActionListener to the submitButton

        add(new JLabel("Name: "));
        add(nameField);
        add(new JLabel("Age: "));
        add(ageField);
        add(new JLabel("Address: "));
        add(addressField);
        add(new JLabel());
        add(submitButton); // Adding the submitButton

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            String name = nameField.getText();
            int age = Integer.parseInt(ageField.getText());
            String address = addressField.getText();

            // Code to process the registration (e.g., save to database) would go here
            JOptionPane.showMessageDialog(this, "Registration Successful!");
        }
    }

    public static void main(String[] args) {
        new StudentRegistration();
    }
}
