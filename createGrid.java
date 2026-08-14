import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;
class createGrid {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Minesweeper");
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
        int x = 9;
        int y = 9;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                JButton button = new JButton("Bomb");
                button.setBounds(100, 100, 100, 100);
                panel.add(button);
            }
            
        }
        panel.setBackground(Color.CYAN);
        frame.add(panel);
        frame.setSize(1000, 1000);
        frame.setVisible(true);
    }
}