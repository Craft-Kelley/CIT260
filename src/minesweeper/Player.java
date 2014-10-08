/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minesweeper;

/**
 * The player class keeps track of user information
 * @author Jacky Northgrave
 */
public class Player {
    
  public static final String PLAYER_ONE = "PLAYER";
  public String name;
  int numWins;
  int numLosses;    

  /*
  * Default constructor
  */
  public Player() {
    numWins = 0;
    numLosses = 0;
  }
    
  /*
  * Constructor with parameters
  */
  public Player(int wins, int losses){
    numWins = wins;
    numLosses = losses;
  }
    
  /*
  *This function allows the game to retrieve the player's name
  * and set it within the game    
  */
  public String getName() {
    return name;
  }
  
  /*
  * Setter for name
  */
  public void setName(String name) {
    this.name = name;
  }

   /*
  * getter for numWins
  */
  public long getIntWins() {
    return numWins;
  }
    
  /*
  * Setter for numWins
  */
  public void setIntWins(int wins) {
    this.numWins = wins;
  }
  
  /*
  * getter for numLosses
  */
  public long getIntLosses() {
    return numLosses;
  }
    
  /*
  * Setter for numLosses variable
  */
  public void setIntLosses(int losses) {
    this.numLosses = losses;
  }
 
  /*
  * This function calculates the winning percentage of the player
  */
  public void playerStatistics(){
    int total = numWins + numLosses;
    if (numWins==0 && numLosses==0){
      System.out.println("====================================================");
      System.out.print("\tNo games have been played by this player\n");
      System.out.print("\t--Game must be played to recieve stats-- \n");
      System.out.println("====================================================");
    }
    else {
      double winPercent = ((double)numWins/total) * 100;
    
      int roundedWinPercent = (int)winPercent;
    
      System.out.println("===============================================");
      System.out.println("Wins: " + numWins);
      System.out.println("Losses: " + numLosses);    
      System.out.println("Total games: " + total);
      System.out.println("Your win percentage is " + roundedWinPercent + "%");
      System.out.println("===============================================");
    }
  }
      
}