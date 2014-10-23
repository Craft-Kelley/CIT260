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
        {"A - About Program"},
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
          displayList(menuItems, menuName);
          break;
        case "A": //About
          AboutMenuView about = new AboutMenuView();
          about.getInput();
          displayList(menuItems, menuName);
          break;
        case "P":  //player statistics
          player.playerStatistics();
          displayList(menuItems, menuName);
          break;
        case "H":  //help
          HelpMenuView helpMenu = new HelpMenuView();
          helpMenu.getInput();
          displayList(menuItems, menuName);
          break;
        case "S": //Start game
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
  public int getInt(String prompt, int limit){
    int input = 0;
    
    
    //Output prompt
    System.out.print(prompt);
        
        //Verify that input is an int
        if (!setBoardRows.isNumeric())
            return false;
        
        //Input must be greater than zero and cannot be empty
        if (setBoardRows == null || setBoardRows.length() == 0)
            return false;
        
        //Verify that the input is less that the limit
        for (int i = 0; i < setBoardRows.length(1000); i++) {
            if (setBoardRows >= 1 && setBoardRows <=1000)
                System.out.println("Number of Rows:" + setBoardRows);
            else{
                System.out.println("Invalid Input. Rows must be greater than 0 and less than 1000");
            }
        }
        
        //Get input
        return input;
        }

}
/* public final void displayOptions(){
        System.out.println("\n====================================================");
        System.out.println("Help Options:");
        
        for (int i = 0; i < HelpMenuView.menuItems.length; i++){
            System.out.println("\t" + menuItems [i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\n====================================================");  
        System.out.print("> "); */