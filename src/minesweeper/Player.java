/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minesweeperkc;

/**
 *
 * @author Jacky Northgrave
 */
public class Player {

    
// The player class is to show the player's wins, losses, and game statsistics
    

    
    
    public static final String PLAYER_ONE = "PLAYER";

        //Instance variables
        public String name;
        public long intWins = 0;
        public long intLosses = 0;    

    public Player() {
    }
/*
*This function allows the game to retrieve the player's name
* and set it within the game    
*/
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
/*
*This function allows the game to log how many wins 
*the player has
*/
    public long getIntWins() {
        return intWins;
    }
    public void setIntWins(long intWins) {
        this.intWins = intWins;
    }
/*
*This function allows the game to log how many 
*losses the player has
*/
    public long getIntLosses() {
        return intLosses;
    }
    public void setIntLosses(long losses) {
        this.intLosses = losses;
    }
/*
*This function calculates the winning percentage of the player
*/
    public double getWinPercentage() {
    double totalScore = this.getIntWins() + this.getIntLosses();

    if (totalScore == 0) {
            return 0;
    }
    double winLossRatio = this.getIntWins() / totalScore;
    return winLossRatio*100;
    }
/*
*This function calculates the player's individual stats
*/
    public String getPlayerStastics() {
    String playerStatistics = 
    this.getName() + " has won " + this.getWinPercentage() + "% of the games.";
        
        return playerStatistics;
    }
    public static void main(String[] args) {
    }
}