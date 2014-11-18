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
      while(mainMenu.getInput(player, instance))
        startGame();
      
      System.out.println("Thanks for playing!");
    }
        
    /*
    * StartGame provides startup protocols for a new game
    */
    public static void startGame(){
      player = new Player();
      
      
      GameBoard board = new GameBoard(boardRows, boardCols, gameLevel);
      board.buildBoard();
      
      GameMenu game = new GameMenu(board);
      game.getInput(player);
      
      System.out.println("Game Over!");

    }
    
    public void getName(){
      System.out.println(name);
    }
   
    public static void displayInstructions(){
      System.out.println("*****************************************************");
      System.out.println("*  Welcome to the game of Minesweeper. \n"
            + "*  You will be playing individually. The objective of the game \n"
            + "*  is to find the empty squares while avoiding the mines.\n");
      System.out.println("*****************************************************");
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

