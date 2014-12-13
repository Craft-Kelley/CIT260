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
 *    This is a simple game. Minesweeper is has evolved 
 *    since the 1960's into the game that it is today. It 
 *    is a single player puzzle video game. The objective is
 *    to clear a game board containing hidden "mines" without
 *    detonating any of them, with help from clues about the 
 *    number of neighboring mines in each field. 
 */

import minesweeper.menu.MainMenu;
import minesweeper.menu.GameMenu;
import minesweeper.frames.MainFrame;

public class Minesweeper {

    public String level;
    static int minesLeft;
    String name = "John Doe";
    static Player player;
    static int boardRows = 3;
    static int boardCols = 3;
    static int gameLevel = 1;
    static Minesweeper instance = new Minesweeper();
    MainFrame mainFrame;
        
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
        //MainMenu mainMenu = new MainMenu();
        //player = new Player();
        final Minesweeper mine = new Minesweeper(); 
     
        try {
          java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
               mine.mainFrame = new MainFrame();
               mine.mainFrame.setVisible(true);
            }
          });
        }catch (Throwable e){
            System.out.println("Unexpected error: " + e.getMessage());
            System.out.println(e.getStackTrace().toString());
        }
        finally{
             System.out.println("Exiting try catch; entering FINALLY");
            if(mine.mainFrame != null){
            mine.mainFrame.dispose();
        }
    }
      
      //Continue prompting from the main menu until the player decides to quit.
     // mainMenu.getInput(instance);
     // startGame();
      
      System.out.println("Thanks for playing!");
    }
        
    /*
    * StartGame provides startup protocols for a new game
    */
    public void startGame(){
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

