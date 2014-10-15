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
    
        private final static String[][] menuItems = {
        {"N", "New Game"},
        {"S", "Player Statistics"},
        {"H", "Help"},
        {"Q", "Quit"}
    };

    private GameMenuControl gameMenuControl = new GameMenuControl ();
    
    //display the options menu
 
    //user input
    public void getInput(){
        
        String input; 
        Scanner inFile = new Scanner(System.in);
        
        do {
            
            this.displayOptions();
            
            input = inFile.nextLine();
            input = input.trim().toUpperCase();
        
            switch (input) {
                case "N":
                    gameMenuControl.startNewGame();
                    break;
                case "S":
                    gameMenuControl.displayPlayerStatistics();
                    break;
                case "H":
                    gameMenuControl.displayHelpMenu();
                    break;
                case "Q":
                    break;
                default:
                    System.out.println("Invalid input. Please enter a valid command.");
                    continue;
            
            }
        } while (!input.equals("Q"));
          
          return;
    }
    public final void displayOptions(){
        System.out.println("\n\t==============================");
        System.out.println("\tGame Options:");
        
        for (int i = 0; i < GameMenuView.menuItems.length; i++){
            System.out.println("\t" + menuItems [i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t==============================\n");    
    }
}
