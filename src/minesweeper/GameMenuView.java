/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minesweeper;

import java.util.Scanner;
/**
 *
 * @author Jacky Northgrave
 */
public class GameMenuView {
        
        private GameMenuControl gameMenuControl = new GameMenuControl ();

        private final static String[][] menuItems = {
        {"G", "Guess Square"},
        {"P", "Pause"},
        {"R", "Reveal Board"},
        {"Q", "Quit Game"},
        {"D", "Display the board"}   
    };

        public GameMenuView (){
            this.gameMenuControl = new GameMenuControl();
        }
        
 
    //user input
    public void getInput(Player player){
        
        Scanner inFile = new Scanner(System.in);
        String input = inFile.nextLine();
                
        do {     
            //display the game menu
            this.displayGameOptions();
            
            input = inFile.nextLine();
            input = input.trim().toUpperCase();
    
            switch (input) {
                //guess square  
                case "G":
                    break;
                //pause game    
                case "P":
                    break;
                //reveal game board    
                case "R":
                gameBoard.revealBoard();
                    break;
                //quit game    
                case "Q":
                    break;
                //display game board    
                case "D":
                GameBoard board = new GameBoard(boardRows, boardCols, gameLevel);
                board.displayBoard();
                    break;
                default:
                    System.out.println("Invalid input. Please enter a valid command.");
                    continue;
                
               /* 
                case "N":
                    Player playerName = new Player(); //added instance to debug function (kc)
                    playerName.playerStatistics();
                    break;
                //displays game options
                case "O":
                    gameMenuControl.displayOptionMenu();
                    break;
                //displays help menu
                case "H":
                    gameMenuControl.displayHelpMenu();
                    break;
                //creates error warning if user enters invalid input    
                default:
                    System.out.println("Invalid input. Please enter a valid command.");
                    displayGameOptions();
                    break;*/
            
            }
        //quit minesweeper game    
        } while (!input.equals("Q"));
          
          return;
    }
    public void displayGameOptions(){
        System.out.println("\n\t==============================");
        System.out.println("\tGame Menu Options:");
        
        for (String[] menuItem : menuItems) {
      System.out.println("\t" + menuItem[0] + "\t" + menuItem[1]);
    }
        System.out.println("\t==============================\n");    
    }
}
