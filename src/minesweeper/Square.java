package minesweeper;

/**
 * Square class will define a square on the playing board - KC
 * @author Kelley Craft
 */
public abstract class Square {
    /*These variables declare all possible statuses of a square.  A square either is a mine or is not a mine.  Mine squares will have an isMine value of true.  
    
    Also, squares are either have been opened or they have not. (represented by isClicked)
    Open squares will either be a mine that ends the game or reveal the numTouching.  
    closed squares can be flagged or unflagged.
    */
    
    boolean isFlagged;// declares if the square is flagged
    boolean isClicked; // declares if square is open(true) or closed (false)
    boolean isMine; //declares if square is a mine(true) or not(false)
    int numTouching;
    //these variables are needed for game tracking purposes
    int goodFlags; //flags on squares that are mines needed for tracking game progress
    int totalFlags; // total flags needed to compare if player has flagged extra squares that are not                           mines
    int numMines; // number of mines in game set during initial game board setup
    
    //Abstract functions  -- to be defined in subclasses
    public abstract void onClick(); //Defines behaviour when square is clicked
    public abstract boolean getIsMine();
    
    /*
    * Getter for isClicked
    */
    public boolean getIsClicked(){
      return isClicked;
    }

    
    /*
    * Setter for isMine, also takes action if the
    * clicked status is changed to true
    */
    public void setIsClicked(boolean click){
      isClicked = click;
      if (isClicked)
        onClick();
    }
    
   /*
  * Setter for numTouching
  */
  public void setNumTouching(int touching){
    numTouching = touching;
  }
    
    /*
    * Getter for isFlagged
    */
    public boolean getIsFlagged(){
      return isFlagged;
    }
    
    /*
    * Setter for isFlagged
    */
    public void setIsFlagged(boolean flag){
      isFlagged = flag;
    }
       
    /**
     *This function allows the status of the square to be retrieved
     **/     
    public void SquareMineStatus(){
        System.out.println("status of isFlagged = " + isFlagged);
        System.out.println("status of isClicked = " + isClicked);
    }  
 
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
        gameStatus = (boolean)(goodFlags == totalFlags && totalFlags == numMines);
    
      
      System.out.println("game is won =" + gameStatus); //primarily for testing
      return gameStatus;      //returns the value for gameIsWon() to where it was called from

    }
    
}
