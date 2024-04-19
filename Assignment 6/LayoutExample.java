import javax.swing.*;
import java.awt.*;

public class LayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Layout Example");
        JPanel panel = new JPanel();

        // FlowLayout
        panel.setLayout(new FlowLayout());
        panel.add(new JButton("Button 1"));
        panel.add(new JButton("Button 2"));
        panel.add(new JButton("Button 3"));

        frame.add(panel);

        // BorderLayout
        JPanel panel2 = new JPanel(new BorderLayout());
        panel2.add(new JButton("North"), BorderLayout.NORTH);
        panel2.add(new JButton("South"), BorderLayout.SOUTH);
        panel2.add(new JButton("East"), BorderLayout.EAST);
        panel2.add(new JButton("West"), BorderLayout.WEST);
        panel2.add(new JButton("Center"), BorderLayout.CENTER);

        frame.add(panel2, BorderLayout.SOUTH);

        // GridLayout
        JPanel panel3 = new JPanel(new GridLayout(2, 2));
        panel3.add(new JButton("Button 1"));
        panel3.add(new JButton("Button 2"));
        panel3.add(new JButton("Button 3"));
        panel3.add(new JButton("Button 4"));

        frame.add(panel3, BorderLayout.CENTER);

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
