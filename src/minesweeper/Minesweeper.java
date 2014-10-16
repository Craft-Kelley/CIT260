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
        
    /*
    * Singleton -- maintains only one instance of the 
    *              Minesweeper class
    */
    Minesweeper getInstance(){
      return this;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {      
      HelpMenuView helpMenuView = new HelpMenuView();
      helpMenuView.displayOptions();

      
      //Display main menu
      MainMenuView mainMenu = new MainMenuView();
      player = new Player();
      
      if (mainMenu.getInput(player, boardRows, boardCols, gameLevel));
        startGame();
      
    }
    
    /*
    * StartGame provides startup protocols for a new game
    */
    public static void startGame(){
      player = new Player();
      
      
      
      GameBoard board = new GameBoard(boardRows, boardCols, gameLevel);
      board.buildBoard();
      board.displayBoard();
      
      //Redirect based on menu selections
    }
    
    public void getName(){
      System.out.println(name);
    }
   
    public void displayHelp(){
      System.out.println("Welcome to the game of Minesweeper. \n"
            + "You will be playing individually. The objective of the game \n "
            + "is to find the empty squares while avoiding the mines.\n ");
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
