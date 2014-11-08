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
public class HelpMenuView {
        
    private final static String[][] menuItems = {
        {"M", "Main Menu"},
        {"D", "Display Instructions"},
        {"Q", "Quit Help"}
    };

    private HelpMenuControl helpMenuControl = new HelpMenuControl ();
    
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
                case "M":
                    return;
                case "D":
                    this.helpMenuControl.displayInstructions();
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
        System.out.println("\n====================================================");
        System.out.println("Help Options:");
        
        for (int i = 0; i < HelpMenuView.menuItems.length; i++){
            System.out.println("\t" + menuItems [i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\n====================================================");  
        System.out.print("> ");
    }
}
