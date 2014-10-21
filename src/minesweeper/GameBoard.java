package minesweeper;

/**
 * This class manages the game board.
 *  
 * To run debugging code:
     GameBoard board = new GameBoard(3, 3, 1);
     board.buildBoard();
     board.displayBoard();
 */

import java.util.ArrayList;
import java.util.Random;

public class GameBoard {
  int numCols;
  int numRows;
  int gameLevel; //the level the game is on
  int numMines;
  Square[][] board;
  //these variables are needed for game tracking purposes
  int goodFlags; //flags on squares that are mines needed for tracking game progress
  int totalFlags; // total flags needed to compare if player has flagged extra squares that are notmines
  
  /*
  * Constructor with parameters
  */
  GameBoard(int cols, int rows, int level){
    numCols = cols;
    numRows = rows;
    gameLevel = level;
  }
  
  /*
  * Calculates the number of mines that should
  * be placed on the board, based on the level
  * of difficulty the user has selected.
  */
  private int calcNumMines(){
    //beginner
    if (gameLevel == 1){
      double calcNumMine = (double) (25.0 *(numCols * numRows))/100;
      int roundedCalcNumMine = (int)calcNumMine;
    
      System.out.println("===================================");
      System.out.println("\tNumber of Mines on beginner Game Board:" + roundedCalcNumMine);
      System.out.println("===================================");
      
      return roundedCalcNumMine;
    }
    
    //intermediate
    else if (gameLevel == 2){
      double calcNumMine = (double) (50.0 *(numCols + numRows))/100;
      int roundedCalcNumMine = (int) calcNumMine;
        
      System.out.println("===================================");
      System.out.println("\tNumber of Mines on beginner Game Board:" + roundedCalcNumMine);
      System.out.println("===================================");
      return roundedCalcNumMine;
    }
    
    //expert
    else if (gameLevel == 3){
      double calcNumMine = (double) (75.0 * (numCols + numRows))/100;
      int roundedCalcNumMine = (int) calcNumMine;
        
      System.out.println("===================================");
      System.out.println("Number of Mines on beginner Game Board:" + roundedCalcNumMine);
      System.out.println("===================================");
      return roundedCalcNumMine;
    }
    else{
      System.out.println("ERROR: Unable to calculate number of mines");
    }
    
    return 1;
  }

  
  /*
  * This function fills the list of squares with 
  * squares, some of which are assigned to be mines,
  * while others are not mines.
  */
  void buildBoard(){
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
               
        //For debugging...Shows us where the mines have been placed.
        System.out.print("Placed mine at " + mineRow + " - " + mineCol + "\n");
        System.out.println("Mine status: " + board[mineRow][mineCol].getIsMine() + "\n");
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
  }
    
  /**
   * This will calculate the number of mines the passed in cell is touching
   */
  public int calcNumTouching(int row, int col){
    int count = 0;
    int rowStart = row - 1;
    int colStart = col - 1;
      
    System.out.println("Cell row: " + row + " col: " + col);
    //If the row is at the edge of the board
    if (row == 0 || row == numRows - 1){
      
    }
    //If the col is at the edge of the board 
    if (col == 0 || col == numCols - 1){
    
    }

    else{
      //Check all squares around given location. 
      for (int i = (rowStart); i <= (rowStart + 2); i++){
        for (int j = (colStart); j <= (colStart + 2); j++){          
          //Check mine status
          if(board[i][j].getIsMine())
            count++;
        }      
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
  public void findEmptyCells(int curRow, int curCol){
        
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
    public boolean gameIsWon(int row, int col){
      //determines if a square is a mine and then appropriately adds one count to 
      //either good or bad flag count. 
      if(board[row][col].getIsMine() == true){
        goodFlags++;
        totalFlags++;
      }
      else {
        totalFlags++;
      }
       
        
      //calculates badFlags to meet requirements for lesson03.  Can be removed later
                 
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