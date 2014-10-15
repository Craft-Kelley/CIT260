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
    String instructions = "Welcome to the game of Minesweeper. \n"
            + "You will be playing individually. The objective of the game \n "
            + "is to find the empty squares while avoiding the mines.\n "
            + "Good Luck!";
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {      
      HelpMenuView helpMenuView = new HelpMenuView();
      helpMenuView.displayOptions();
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
    
    public void getName(){
      System.out.println(name);
    }
   
    public void displayHelp(){
      System.out.println(instructions);
    }
    
        /*These variables declare all possible statuses of a square.  A square either is a mine or is not a mine.  Mine squares will have an isMine value of true.  
    
    Also, squares are either have been opened or they have not. (represented by isClicked)
    Open squares will either be a mine that ends the game or reveal the numTouching.  
    closed squares can be flagged or unflagged.
    */
    
    boolean isFlagged;// declares if the square is flagged
    boolean isClicked; // declares if square is open(true) or closed (false)
    boolean isMine; //declares if square is a mine(true) or not(false)
  
    //these variables are needed for game tracking purposes
    int goodFlags; //flags on squares that are mines needed for tracking game progress
    int totalFlags; // total flags needed to compare if player has flagged extra squares that are not                           mines
    int numMines; // number of mines in game set during initial game board setup
    
        /**
     * This function calculates game progress by comparing the number of correctly flagged 
     * squares to the number of mines set in the game.  If all mines are flagged, but extra
     * squares are also flagged, it will print an error message.  
     * gameIsWon is a boolean value
     * @return gameIsWon
     * @author Kelley
     */
    
    public boolean gameIsWon(){
    /** determines if a square is a mine and then appropriately adds one count to either good or bad         flag count. */
         if (isMine == true){
          goodFlags++;
          totalFlags++;
      }
        else {
          totalFlags++;
        }
       
        
        /**
        * calculates badFlags to meet requirements for lesson03.  Can be removed later
        */
         
       float badFlags;
       badFlags = (float)(totalFlags-goodFlags);
       
       
       
      //determines if the player has flagged more squares than mines
      //prints message to warn player if they exceed the number of mines
      if (totalFlags > numMines){
          System.out.print("\tThere are only " + numMines + "mines in the game.\n"
                  + "\t You have " + totalFlags + "squares flagged.");
      }
       boolean gameStatus;
        gameStatus = (boolean)(goodFlags == totalFlags & totalFlags == numMines);
    
      
      System.out.println("game is won =" + gameStatus); //primarily for testing
      return gameStatus;      //returns the value for gameIsWon() to where it was called from

    }
}
