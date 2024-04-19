import javax.swing.*;

public class LoginApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login");
        JPanel panel = new JPanel();
        
        JLabel userLabel = new JLabel("Username:");
        JTextField userField = new JTextField(20);
        
        JLabel passLabel = new JLabel("Password:");
        JPasswordField passField = new JPasswordField(20);
        
        JButton loginButton = new JButton("Login");

        panel.add(userLabel);
        panel.add(userField);
        panel.add(passLabel);
        panel.add(passField);
        panel.add(loginButton);
        
        loginButton.addActionListener(e -> {
            String username = userField.getText();
            String password = new String(passField.getPassword());
            
            // Add your logic for checking username and password here
            // For demonstration purpose, let's assume username = "admin" and password = "admin123"
            if (username.equals("admin") && password.equals("admin123")) {
                JOptionPane.showMessageDialog(null, "Login successful!");
                // Display user information or perform further actions
            } else {
                JOptionPane.showMessageDialog(null, "Wrong username or password!");
            }
        });
        
        frame.add(panel);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

