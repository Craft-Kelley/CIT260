package minesweeper;

/**
 * This class manages the game board.
 *  
 * To run debugging code:
     GameBoard board = new GameBoard(3, 3, 1);
     board.buildBoard();
     board.displayBoard();
 */

import java.io.Serializable;
import minesweeper.frames.GameFrame;
import minesweeper.exceptions.MenuExceptions;

public class GameBoard implements Serializable{
  private int numCols;
  GameFrame gameFrame;
  private int numRows;
  private int gameLevel; //the level the game is on
  private int numMines;
  public Square[][] board;
  //these variables are needed for game tracking purposes
  private int goodFlags; //flags on squares that are mines needed for tracking game progress
  private int totalFlags; // total flags needed to compare if player has flagged extra squares that are notmines
  
  /*
  * Constructor with parameters
  */
  public GameBoard(int cols, int rows, int level){
    numCols = cols;
    numRows = rows;
    gameLevel = level;
  }
  
  @Override
  public String toString(){
    String theString = "duh";
    
    return theString;
  } 
 
  /*
  *getter for numCols 
  */
  public int getNumCols(){
  return numCols;
  }
  
  /*
  *getter for numRows
  */
  public int getNumRows(){
  return numRows;
  }
  
  /*
  * Calculates the number of mines that should
  * be placed on the board, based on the level
  * of difficulty the user has selected.
  */
  private int calcNumMines() throws MenuExceptions{
    //beginner
    if (gameLevel == 1){
      double calcNumMine = (double) (25.0 *(numCols * numRows))/100;
      int roundedCalcNumMine = (int)calcNumMine;
          
      return roundedCalcNumMine;
    }
    
    //intermediate
    else if (gameLevel == 2){
      double calcNumMine = (double) (50.0 *(numCols + numRows))/100;
      int roundedCalcNumMine = (int) calcNumMine;
        
      return roundedCalcNumMine;
    }
    
    //expert
    else if (gameLevel == 3){
      double calcNumMine = (double) (75.0 * (numCols + numRows))/100;
      int roundedCalcNumMine = (int) calcNumMine;
        
      return roundedCalcNumMine;
    }
    else{
      throw new MenuExceptions("ERROR: Unable to calculate number of mines");
    }
    
    }

  
  /*
  * This function fills the list of squares with 
  * squares, some of which are assigned to be mines,
  * while others are not mines.
  */
  public void buildBoard(){
      try {
    numMines = calcNumMines();
    int mineRow = 0;
    int mineCol = 0;
    board = new Square[numRows][numCols];
    //Fill the array with nulls
    for (int i = 0; i < numRows; i++){
      for (int j = 0; j < numCols; j++){
        board[i][j] = null;
      }
    }
   
    int k = 0;
    //Place mines
    while (k < numMines){
      // Assign mineRow to a random number, then mod by the number of rows on the
      // board to make sure we stay within board bounds.
      mineRow = (int)(Math.random()*10) % (numRows);
      mineCol = (int)(Math.random()*10) % (numCols);
      
      //if that location on the grid is not already filled...
      if(board[mineRow][mineCol] == null){
        //put a mine in that location.
        board[mineRow][mineCol] = new Mine();
               
        k++; //Only increment if a mine was successfully placed
      }     
    } 
    
    //Fill in empty squares
    for (int i = 0; i < numRows; i++){
      for (int j = 0; j < numCols; j++){
        //If the location on the grid hasn't been filled yet...
        if(board[i][j] == null){
          //put an empty square in it.
          board[i][j] = new EmptySquare();
          //board[i][j].setNumTouching(calcNumTouching(i, j));
        }
      }
    }
      } catch (MenuExceptions E) {
          System.out.println(E.getMessage());
      }
      finally{
          System.out.println("Final");
      }
      

      
       try {
          java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
               gameFrame = new GameFrame();
               gameFrame.setVisible(true);
            }
          });
        }catch (Throwable e){
            System.out.println("Unexpected errpr: " + e.getMessage());
            System.out.println(e.getStackTrace().toString());
        }
        finally{
             System.out.println("Exiting try catch; entering FINALLY");
            
        }
  }
  
  /**
   * This will calculate the number of mines the passed in cell is touching
   * @param row the row of the cell to be checked 
   * @param col the col of the cell to be checked
   * @return count the number of mines the given cell is touching
   */
  private int calcNumTouching(int row, int col){
    int count = 0;
    int rowStart = row - 1;
    int colStart = col - 1;
    int rowFinish = row + 1;
    int colFinish = col + 1;
    
    if (row == 0 )
      rowStart = 0;   
    if (row == numRows - 1)
      rowFinish = row;
   

    if (col == 0)
      colStart = 0;
    if (col == numCols - 1) 
      colFinish = col;

      //Check all squares around given location. 
    for (int i = (rowStart); i <= (rowFinish); i++){
      for (int j = (colStart); j <= (colFinish); j++){          
        //Check mine status
        if(board[i][j].getIsMine())
          count++;
      }      
    }
    
    return count;
  }
  /**
  * This function will find and reveal
  * all of the empty cells adjacent to the 
  * current row and column
  * @param curRow - the row of the cell we are checking around
  * @param curSquare - the col of the cell we are checking around
  */     
  private void findEmptyCells(int curRow, int curCol){
    
    //set block of squares to be checked and account for edges of the board
    
    int rowStart = curRow - 1;
    int colStart = curCol - 1;
    int rowFinish = curRow + 1;
    int colFinish = curCol + 1;
    
    if (curRow == 0 )
      rowStart = 0;   
    if (curRow == numRows - 1)
      rowFinish = curRow;
   

    if (curCol == 0)
      colStart = 0;
    if (curCol == numCols - 1) 
      colFinish = curCol;  
    
     //open all squares surrounding the square with 0 numTouching 
    for (int i = (rowStart); i <= (rowFinish); i++){
      for (int j = (colStart); j <= (colFinish); j++){          
        //change clicked status
          int x = board[i][j].numTouching;
        if(x == 0) {
            board[i][j].isClicked = true;
        }
               
      }  
      displayBoard();
    }
  }  
  
  
  /*
  * This function is mostly for debugging purposes
  */
  public void displayBoard(){
     for (int i = 0; i < numRows; i++){
      for (int j = 0; j < numCols; j++){
        if(board[i][j].isClicked){
            System.out.print(board[i][j].getNumTouching() + " | ");                   
        }
        else if (board[i][j].isFlagged){
          System.out.print(">" + " | ");
        }
        else
          System.out.print(" " + " | ");
      }
      System.out.print("\n");
     }
  }
  
  /*
  * this function reveals the board as true/false squares
  */
  public void revealBoard(){
    for (int i = 0; i < numRows; i++){
      for (int j = 0; j < numCols; j++){
        if (board[i][j].getIsMine() == true)
          System.out.print("t" + " | ");
        else 
          System.out.print("f" + " | ");
      }
      System.out.print("\n");
     }
  }
  
  /**
     * This function calculates game progress by comparing the number of correctly flagged 
     * squares to the number of mines set in the game.  If all mines are flagged, but extra
     * squares are also flagged, it will print an error message.  
     * gameIsWon is a boolean value
     * @param row the row of the square that has been clicked
     * @param col the col of the square that has been clicked
     * @return gameIsWon
     * @author Kelley
     */
    public boolean gameIsWon(){                 
      float badFlags = (float)(totalFlags-goodFlags);
              
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
    
    
    /*
    * Defines behavior when a square is clicked
    * @return true if the game is still in play
    * @return false if the game is over
    */
   public boolean clickSquare(int row, int col){
     if (board[row][col].getIsMine()){
      board[row][col].onClick();
      return false;
     }
     else {
      board[row][col].setNumTouching(calcNumTouching(row, col));
      findEmptyCells(row, col);
      board[row][col].onClick();
     }
     
     return true;
   }
   
   /*
   * Keeps track of flagged squares
   */
   public void flagSquare(int row, int col){
    board[row][col].setIsFlagged(true);
    totalFlags++; 
    
    if (board[row][col].getIsMine())
     goodFlags++;
   }
   
}