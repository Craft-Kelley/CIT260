package minesweeperkc;

/**
 * This function will build the game board
 * @author Casey
 */

import java.util.ArrayList;
import java.util.Random;

public class GameBoard {
  int numCols;
  int numRows;
  int gameLevel; //the level the game is on
  ArrayList <Square> boardSquares;
  
  /*
  * Constructor with parameters
  */
  GameBoard(int cols, int rows, int level){
    numCols = cols;
    numRows = rows;
    gameLevel = level;
  }
  
  /*
  * This function fills the list of squares with 
  * squares, some of which are assigned to be mines,
  * while others are not mines.
  */
  void buildBoard(){
    
  }
    
  /**
  * This function will find and reveal
  * all of the adjacent empty cells
  */     
  public void findEmptyCells(){
        
  }
    
}