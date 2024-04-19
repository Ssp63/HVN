import javax.swing.*;

public class AdmissionForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Admission Form");
        JPanel panel = new JPanel();
        
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField(20);
        
        JLabel ageLabel = new JLabel("Age:");
        JTextField ageField = new JTextField(5);
        
        JLabel courseLabel = new JLabel("Course:");
        String[] courses = {"Engineering", "Medical", "Commerce", "Arts"};
        JComboBox<String> courseComboBox = new JComboBox<>(courses);
        
        JButton submitButton = new JButton("Submit");

        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(ageLabel);
        panel.add(ageField);
        panel.add(courseLabel);
        panel.add(courseComboBox);
        panel.add(submitButton);
        
        frame.add(panel);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
