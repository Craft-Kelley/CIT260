package minesweeper;

/**
 * This function will build the game board
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
  void calcNumMines(){
    //TODO: add logic to do calculation based on difficulty level
    
    //For now...
    numMines = 3;
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
   
    //Place mines
    for (int i = 0; i < numMines; i++){
      // Assign mineRow to a random number, then mod by the number of rows on the
      // board to make sure we stay within board bounds.  
      // Adding 1 ensure that the mines can be placed at the far bound of 
      // the board.
      mineRow = (int)(Math.random()*10) % (numRows + 1);
      mineCol = (int)(Math.random()*10) % (numCols + 1);
      
      if(board[mineRow][mineCol] != null){
        
      }
      System.out.println(mineRow + " -- " + mineCol);
      
    }

    //Fill in empty squares
    for (int i = 0; i < numRows; i++){
      for (int j = 0; j < numCols; j++){
        
      }
    }
  }
    
  /**
  * This function will find and reveal
  * all of the adjacent empty cells
  */     
  public void findEmptyCells(){
        
  }
    
}