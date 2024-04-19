import javax.swing.*;

public class MenuExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Menu Example");
        JMenuBar menuBar = new JMenuBar();

        JMenu menuA = new JMenu("Menu-A");
        JMenuItem up = new JMenuItem("Up");
        JMenuItem down = new JMenuItem("Down");
        menuA.add(up);
        menuA.add(down);

        JMenu menuB = new JMenu("Menu-B");
        JMenuItem reset = new JMenuItem("Reset");
        menuB.add(reset);

        menuBar.add(menuA);
        menuBar.add(menuB);

        frame.setJMenuBar(menuBar);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
