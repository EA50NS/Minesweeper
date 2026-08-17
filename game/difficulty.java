package game;

import java.awt.*;

// Driver Class
class Difficulty {
    // Main Function
    Difficulty()
    {
        // Frame Created
        Frame f = new Frame();

        Label l1 = new Label("Select Difficulty:");

        l1.setBounds(100, 50, 120, 80);
        f.add(l1);

        // CheckBox created
        Checkbox c2 = new Checkbox("Easy (9x9 grid, 10 mines)");
        c2.setBounds(100, 150, 200, 50);
        f.add(c2);

        // CheckBox created
        Checkbox c3 = new Checkbox("Medium (16x16 grid, 40 mines)");
        c3.setBounds(100, 200, 200, 50);
        f.add(c3);

        // CheckBox created
        Checkbox c4 = new Checkbox("Hard (30x16 grid, 99 mines)");
        c4.setBounds(100, 250, 200, 50);
        f.add(c4);

        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String ar[]) { new Difficulty(); }
}