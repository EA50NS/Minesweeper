package game;

import javax.swing.*;
import java.awt.GridLayout;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class createGrid {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Minesweeper");
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
        int x = 9;                                  // length
        int y = 9;                                  // width
        int z = x*y;                                // no. of tiles
        int flagCount, bombCount = 10;              // no. of bombs and flags

        Cell[][] game_grid = new Cell[x][y];        // backend manager
        JButton[][] buttons = new JButton[x][y];    // visual button display
        boolean[][] bombs = new boolean[x][y];      // bomb locations

        GridLayout view_grid = new GridLayout(x, y, 0, 0);
        panel.setLayout(view_grid);

        // setting up backend board
        for (int i = 0; i < x; i++){
            for (int j = 0; j < y; j++){
                game_grid[i][j] = new Cell(i, j);
            }
        }


        // Placing bombs on the board
        int placed_bombs = 0;
        while(placed_bombs < bombCount){
            int row = (int) (Math.random() * x);
            int col = (int) (Math.random() * y);

            // if x is the horizontal axis, then it must be col
            if (!bombs[col][row]){
                bombs[col][row] = true;
                game_grid[col][row].is_bomb = true; // back end update
                placed_bombs++;
            }
        }

        for (int i = 0; i < x; i++){
            for (int j = 0; j < y; j++){
                if (!bombs[i][j]){
                    buttons[i][j] = new JButton();
                }
                else{
                    buttons[i][j] = new JButton("Bomb");
                }
                panel.add(buttons[i][j]);
            }
        }

        frame.add(panel);
        frame.setSize(1000, 1000);
        frame.setVisible(true);

    }
}