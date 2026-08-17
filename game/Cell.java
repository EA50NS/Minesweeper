package game;


// This class aims to define all attributes a cell should have in a game of Minesweeper
// - A cell should exist on a board
// - A cell should be able to be revealed when clicked
// - When a cell is revealed, it cannot un-reveal itself
// - When a cell is revealed, it can either be safe or a bomb
//      - If a cell is safe, it must display a number that indicates the number of bombs on its 8 sioes
//      - If a cell is a bomb, it instantly terminates the game, making the player lose
// - A cell can have a flag placed on it, if it does, it cannot be clicked unless the flag is removed
// - If a cell has a flag and is a bomb, internally mark it as 'correct'
// - For player to win, all bombs must have a flag on them

public class Cell {

    int x, y;
    boolean is_revealed = false;
    boolean is_bomb = false;
    boolean has_flag = false;


    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }


    // Cell constructor, takes in x and y to create a default cell with all flags false at specified location
    public Cell(int x, int y){
        this.x = x;
        this.y = y;
        this.is_bomb = false;
        this.is_revealed = false;
        this.has_flag = false;
    }

    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public void reveal_cell(){
        this.is_revealed = true;
    }
    public void set_bomb(){
        this.is_bomb= true;
    }
    public void has_flag(){
        this.has_flag = true;
    }

    // TODO: FINISH THIS
    public int check_neighbour_for_bomb(Cell cell){
        int bombs = 0;
        int myX = cell.getX();
        int myY = cell.getY();
        return bombs;
    }


}
