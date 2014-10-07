package minesweeper;

/**
 *  Project: Minesweeper
 * 
 *  Authors:
 *    Kelley Craft
 *    Jacky Northgrave
 *    Summer Smith
 *    Jonathan Crawford
 *    Casey Ames
 * 
 *  Summary:
 *    This is a simple game ... (INSERT GAME SUMMARY HERE)
 */
public class Minesweeper {
    public String level;
    private int minesLeft;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      GameBoard board = new GameBoard(3, 3, 1);
      board.buildBoard();
      board.displayBoard();
    }
    
    /*
    * StartGame provides startup protocols for a new game
    */
    public static void startGame(){
      Player player1 = new Player();
      
      //Logic:
      //Display main menu
      //Redirect based on menu selections
    }
}
