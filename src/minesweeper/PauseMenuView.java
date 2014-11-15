/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minesweeper;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Casey
 */
public class PauseMenuView {
 PauseMenuControl pauseControl = new PauseMenuControl();
String menuName = "Pause Menu";
  String greeting= "This is the Pause Menu Page.";
  private final static String[][] menuItems = {
        {"S - Start Game"},
        {"P - Pause Game"},
        {"O - Display Options"},
        {"Q - Quit Game"}
    };
  
  /*
  * Constructor 
  */
  
  PauseMenuView(){
    
  }  
  
  /*
  * Gets input from the user
  * @return true when the player wants to start a game
  * @return false when the player wants to quit a game
  */
  public boolean getInput(Player player, Minesweeper instance){
    String input;
    Scanner inFile = new Scanner(System.in);
    displayList(menuItems, menuName);
    
    do{
      input = inFile.nextLine();
      input = input.trim().toUpperCase();
       
      switch (input) {
        case "S":  //start game
          break;
        case "P": //pause game
          break;
        case "O":  //display game options
          break;
        case "Q": //quit game
          return false;      
        default:
          System.out.println("Invalid input. Please enter a valid command.");
          displayList(menuItems, menuName);
          break;
      }
    } while (!input.equals("S")); //start game returns to minesweeper to start the game
    
    return true;
    
  }
  
  /**
  * This function will display individual
  * strings (menu items) as options for the menu
  */ 
  private void displayList(String[][] list, String name){
    System.out.println("\n====================================================");
    System.out.println(name);
    
    for (String[] menuItem : list) {
      System.out.println("\t" + menuItem[0]);
    }
    System.out.println("\n====================================================");
    System.out.print("> ");
  }
  
}