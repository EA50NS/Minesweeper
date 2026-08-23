package game;

import javax.swing.*;
import java.awt.GridLayout;


class CreateGrid {
    public final int x = 9;
    public final int y = 9;
    public int flagCount, bombCount = 10;

    public Cell[][] game_grid = new Cell[x][y];        // backend manager
    public JButton[][] buttons = new JButton[x][y];    // visual button display
    public boolean[][] bombs = new boolean[x][y];      // bomb locations

    public void start_game(){
        JFrame frame = new JFrame("Minesweeper");
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));

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

        // render the buttons
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