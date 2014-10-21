package minesweeper;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jacky Northgrave
 * @author Summer Smith
 */
public class MainMenuView {
  String menuName = "Main Menu";
  String greeting= "This is the Main Menu Page.";
  private final static String[][] menuItems = {
        {"S - Start Game"},
        {"O - Edit Game Options"},
        {"P - Player Statistics"},
        {"H - Help"}
    };
  
  /*
  * Constructor 
  */
  MainMenuView(){
    
  }  
  
  /*
  * Gets input from the user
  */
  public boolean getInput(Player player, Minesweeper instance){
    String input;
    Scanner inFile = new Scanner(System.in);
    displayList(menuItems, menuName);
    
    do{
      input = inFile.nextLine();
      input = input.trim().toUpperCase();
       
      switch (input) {
        case "O":  //options
          editGameOptions(instance);
          break;
        case "P":  //player statistics
          player.playerStatistics();
          break;
        case "H":  //help
          instance.displayHelp();
          HelpMenuView helpMenu = new HelpMenuView();
          helpMenu.getInput();
          break;
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
    System.out.println("\n==============================");
    System.out.println(name);
    
    for (String[] menuItem : list) {
      System.out.println("\t" + menuItem[0]);
    }
    System.out.println("==============================\n");    
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
  private void editGameOptions(Minesweeper instance){
    String name = "Game Options";
    String[][] editItems = {
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
        case "r":  //edit number of rows
          instance.setBoardRows(getInt("Please enter the number of rows: ", 1000));
          break;
        case "c":  //edit number of cols
          instance.setBoardCols(getInt("Please enter the number of columns: ", 1000));
          break;
        case "g":  //edit game level
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
  * 
  */
  public int getInt(String prompt, int limit){
    int input = 0;
    
    //Output prompt
    System.out.println(prompt);
    
    //Get input
    
    //Verify that input is an int
    
    //Verify that the input is less that the limit
        
    return input;
  }

}
