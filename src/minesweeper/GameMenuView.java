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
        {"P", "Player Statistics"},
        {"O", "Options"},    
        {"H", "Help"}
    };

        public GameMenuView (){
            this.gameMenuControl = new GameMenuControl();
        }
   
 
    //user input
    public void getInput(){
        
        String input; 
        Scanner inFile = new Scanner(System.in);
                
        do {     
            //display the game menu
            this.displayGameOptions();
            
            input = inFile.nextLine();
            input = input.trim().toUpperCase();
    
            switch (input) {
                //displays player statistics    
                case "P":
                    Player player = new Player(); //added instance to debug function (kc)
                    player.playerStatistics();
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
                    break;
            
            }
        //starts new minesweeper game    
        } while (!input.equals("S"));
          
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
