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
    private void calcNumMines(){
    //calculate the number of mines by using 25% of total number of boxes
    //beginner: 5 rows 5 columns, 6 mines
    if (numCols==5 && numRows==5){
    double calcNumMine = (double) (25.0 *(numCols * numRows))/100;
    int roundedCalcNumMine = (int)calcNumMine;
    
    System.out.println("===================================");
    System.out.print("\tNumber of Mines on \n");
    System.out.print("\tBeginner Game Board:" + roundedCalcNumMine);
    System.out.println("===================================");
}
    else {
    System.out.println("Beginning Level Error"); 
}
    //intermediate: 10 rows 10 columns, 25 mines
    if (numCols==10 && numRows==10){
        double calcNumMine = (double) (25.0 *(numCols + numRows))/100;
        int roundedCalcNumMine = (int) calcNumMine;
        
    System.out.println("===================================");
    System.out.print("\tNumber of Mines on \n");
    System.out.print("\tIntermediate Game Board:" + roundedCalcNumMine);
    System.out.println("==================================="); 
}
    else {
    System.out.println("Intermediate Level Error");
}
    //expert: 15 rows 15 columns, 56 mines
    if (numCols==15 && numRows==15){
        double calcNumMine = (double) (25.0 * (numCols + numRows))/100;
        int roundedCalcNumMine = (int) calcNumMine;
        
    System.out.println("===================================");
    System.out.print("\tNumber of Mines on \n");
    System.out.print("\tExpert Game Board:" + roundedCalcNumMine);
    System.out.println("==================================="); 
}
    else{
    System.out.println("Expert Level Error");
 }
}

  
  /*
  * This function fills the list of squares with 
  * squares, some of which are assigned to be mines,
  * while others are not mines.
  */
  void buildBoard(){
    calcNumMines();
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
  * all of the adjacent empty cells
  */     
  public void findEmptyCells(){
        
  }
  
  /*
  * This function is mostly for debugging purposes
  */
  public void displayBoard(){
     for (int i = 0; i < numRows; i++){
      for (int j = 0; j < numCols; j++){
        System.out.print(board[i][j].getIsMine() + " | ");
      }
      System.out.print("\n");
     }
  }
}