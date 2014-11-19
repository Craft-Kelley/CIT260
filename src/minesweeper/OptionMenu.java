/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minesweeper;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Jonathan
 */
public class OptionMenu implements Serializable{
    //Need default constructor
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
  
  /*
  * This is a sub-menu of the main menu.  It allows the user to
  * select game edit options.
  * In this case, the selections are editing the number of rows,
  * editing the number of columns, and editing the game level. 
  * The game level is limited to 1, 2, or 3, while the number of
  * rows and columns on the board is not limited. 
  *
  * @param instance used to access the setters to change the actual
  *                 game settings
  */
  private void editGameOptions(Minesweeper instance){ //MOVE getInput
    String name = "Game Options";  //MOVE to default constructor
    String[][] editItems = { //MOVE this to default constructor (like it's done in the HelpMenu)
        {"r - edit number of rows"},
        {"c - edit number of columns"},
        {"g - edit game level"},
        {"m - return to main menu"}
    };
    String input;
    Scanner inFile = new Scanner(System.in);
    displayList(editItems, name);
    
    do{
      input = inFile.nextLine();
      input = input.trim().toUpperCase();
       
      switch (input) {
        case "R":  //edit number of rows
          instance.setBoardRows(getInt("Please enter the number of rows: ", 1000));
          break;
        case "C":  //edit number of cols
          instance.setBoardCols(getInt("Please enter the number of columns: ", 1000));
          break;
        case "G":  //edit game level
          String levelPrompt = "Please select difficulty level: \n"
                               + "1 - Easy\n"
                               + "2 - Medium\n"
                               + "3 - Difficult\n"
                               + "> ";
          instance.setGameLevel(getInt(levelPrompt, 3));
          break;
        default:
          System.out.println("Invalid input. Please enter a valid command.");
          displayList(editItems, name);
          break;
      }
    } while (!input.equals("M")); //start game returns to minesweeper to start the game
    
  }
  
  /*
  * Prompts the user, returns user input.  User input must be 
  * an integer.
  * @param prompt the prompt to display to the user to get the int
  * @param limit the upper bound of the int (the highest number the int can be)
  */
  public int getInt(String prompt, int limit){ //MOVE
    int input = 0;

    //Get input
    Scanner inFile = new Scanner(System.in);
    boolean goodInput = true;
    try {
    System.out.print("Input: ");
    input = inFile.nextInt();
    
    //Display prompt
    System.out.println();
    
     }catch (Exception e){
     System.out.println("Error: Must enter a number");
     goodInput = false;
    }  
    
    for (int i = 0; goodInput; i++);
    System.out.println();

    //Verify that input is less than limit 
   if (input < limit){
        System.out.println("Error: Must enter a number less than" + limit);

    }          
    return input;
    }
}
