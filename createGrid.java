import java.awt.*;
import javax.swing.*;
import java.awt.GridLayout;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.random.*;
import java.util.Collections;
class createGrid {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Minesweeper");
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
        int x = 9; //length
        int y = 9; //width
        int z = x*y; //no. of tiles
        int bombCount = 10; //no. of bombs
        GridLayout grid = new GridLayout(x, y, 0, 0);
        panel.setLayout(grid);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < z; i++) {
            numbers.add(i);
        }
        Collections.shuffle(numbers);
        List<Integer> bombPlacements = new ArrayList<Integer>();
        bombPlacements = numbers.subList(0, bombCount);
        for (int j = 0; j < z; j++) {
            if (bombPlacements.contains(j) == true) {
             JButton bomb = new JButton("Bomb");
            panel.add(bomb);   
            }
            else {
                JButton safe = new JButton();
                panel.add(safe);
            }
        }
        frame.add(panel);
        frame.setSize(1000, 1000);
        frame.setVisible(true);
    }
}