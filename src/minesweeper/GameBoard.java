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
  Square[][] grid;
  
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
    numMines = 10;
  }
  
  /*
  * This function fills the list of squares with 
  * squares, some of which are assigned to be mines,
  * while others are not mines.
  */
  void buildBoard(){
    calcNumMines();
    int rand = 0;
    grid = new Square[numRows][numCols];
    
    rand = (int)(Math.random()*100);
    System.out.println("First: " + rand);
    rand = (int)(Math.random());
    System.out.println("Second: " + rand);
    //Place mines
    for (int i = 0; i < numMines; i++){
      rand = (int)(Math.random()*100);
       
      
    }

    //Fill in empty squares
    for (int i = 0; i < numRows; i++){
      for (int k = 0; k < numCols; k++){
        
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