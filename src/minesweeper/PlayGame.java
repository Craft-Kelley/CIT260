/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minesweeperkc;

/**
 * This will be the driver class for the game.
 * @author Summer Smith
 */
public class PlayGame {
  //member (instance) variables
  public String level;
  private int minesLeft;
  public static double numWins;
  public static double numLosses;
  
  /**
   * Constructor with arguments
   */
  PlayGame(double wins, double losses){
    numWins = wins;
    numLosses = losses;
  }
  /**
   * playGame is currently the driver function.
   */  
  public static void playGame(){
    Boolean gameWon = true; //This may be feedback from the number of mines left,
            //or feedback given when a mine is clicked
    
    if (gameWon == true)
      wonGame();
    else
      lostGame();
  }
  
  /**
   * wonGame takes appropriate action when a player wins a game.
   * In the future, it may ask the player if they want to play again.
   * 
   */
  public static void wonGame(){
    numWins++;
    calcWinPercentage();
  }
  
  /**
   * lostGame takes appropriate action when a player loses a game.
   * In the future, it may ask the player if they want to play again.
   * 
   */
  public static void lostGame(){
    numLosses++;
    calcWinPercentage();
  }
  
  /**
   * calcWinPercentage calculates the percentage of wins per total games played,
   * and displays the results to the command line.
   */
  static void calcWinPercentage(){
    double total = numWins + numLosses;
    
    double winPercent = (numWins/total) * 100;
    
    System.out.println("===============================================");
    System.out.println("Wins: " + numWins);
    System.out.println("Losses: " + numLosses);    
    System.out.println("Total games: " + total);
    System.out.println("Your win percentage is " + winPercent + "%");
    System.out.println("===============================================");
  }
}
