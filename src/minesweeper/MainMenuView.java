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
        {"O - Options"},
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
    displayList();
    
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
          displayList();
          break;
      }
    } while (!input.equals("S"));
    
    return true;
    
  }
  
  /**
  * This function will display individual
  * strings (menu items) as options for the menu
  */ 
  private void displayList(){
    System.out.println(menuName);
    System.out.println("\n\t==============================");

    for (String[] menuItem : menuItems) {
      System.out.println("\t" + menuItem[0] + "\t" + menuItem[1]);
    }
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
    
  }
  
  /*
  * displays the available selections for editing the game.
  */
  public void displayEditOptions(){
    
  }
}
