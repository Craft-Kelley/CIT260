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
    String name = "John Doe";
    static Player player;
    static int boardRows = 3;
    static int boardCols = 3;
    static int gameLevel = 1;
    static Minesweeper instance = new Minesweeper();
        
    /*
    * Singleton -- maintains only one instance of the 
    *              Minesweeper class
    */
    public static Minesweeper getInstance(){
      return instance;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
//Display main menu
      MainMenuView mainMenu = new MainMenuView();
      player = new Player();
      
      if (mainMenu.getInput(player, instance));
        startGame();
      
        
    }
        
    /*
    * StartGame provides startup protocols for a new game
    */
    public static void startGame(){
      player = new Player();
      
      System.out.println("Hit P to access pause menu");
      System.out.println("Hit R to give up and reveal the board");
      
      GameBoard board = new GameBoard(boardRows, boardCols, gameLevel);
      board.buildBoard();
      board.displayBoard();
      
      //while loop -- get input
      
      //input options include P - pause, R - reveal board, Q - quit, G - guess square
      // (use game menu)
      
    }
    
    public void getName(){
      System.out.println(name);
    }
   
    public static void displayInstructions(){
      System.out.println("*****************************************************");
      System.out.println("*  Welcome to the game of Minesweeper. \n"
            + "*  You will be playing individually. The objective of the game \n"
            + "*  is to find the empty squares while avoiding the mines.\n");
      System.out.println("*****************************************************");
    }
    
    /*
    * Setter
    */
    public void setBoardRows(int rows){
      boardRows = rows;
    }
    
    /*
    * Setter
    */
    public void setBoardCols(int cols){
      boardCols = cols;
    }
    
    /*
    * Setter
    */
    public void setGameLevel(int level){
      gameLevel = level;
    }
}
