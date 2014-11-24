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

import minesweeper.menu.MainMenu;
import minesweeper.menu.GameMenu;
import java.util.Scanner;

public class Minesweeper {

    public String level;
    static int minesLeft;
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
      MainMenu mainMenu = new MainMenu();
      player = new Player();
      

      //Continue prompting from the main menu until the player decides to quit.
     // mainMenu.getInput(instance);
     // startGame();
      
      System.out.println("Thanks for playing!");
    }
        
    /*
    * StartGame provides startup protocols for a new game
    */
    public static void startGame(){
      player = new Player();
      
      
      GameBoard board = new GameBoard(boardRows, boardCols, gameLevel);
      board.buildBoard();
      
      GameMenu game = new GameMenu();
//      game.getInput();
      
   //   System.out.println("Game Over!");

    }
    
    public void getName(){
      System.out.println(name);
    }
   
    
    
    
    /*
    * Setter and getter for rows
    */
    public void setBoardRows(int rows){
      boardRows = rows;
    }
    public int getBoardRows(){
        return boardRows;
    }
    
    /*
    * Setter and getter for cols
    */
    public void setBoardCols(int cols){
      boardCols = cols;
    }
    public int getBoardCols(){
        return boardCols;
    }
    /*
    * Setter and getter for level
    */ 
    public void setGameLevel(int level){
      gameLevel = level;
    }
    public int getGameLevel(){
        return gameLevel;
    }

}

