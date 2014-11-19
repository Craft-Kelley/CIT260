package minesweeper;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jacky Northgrave
 * @author Summer Smith
 */
public class MainMenu  implements Serializable{
  String menuName = "Main Menu";
  String greeting= "This is the Main Menu Page.";
  private final static String[] menuItems = {
        ("S - Start Game"),
        ("A - About Program"),
        ("O - Edit Game Options"),
        ("P - Player Statistics"),
        ("G - Show High Scores"),
        ("Q - Quit game"),
        ("H - Help")
    };
  
  /*
  * Constructor 
  */
  MainMenu(){
    
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
        case "O":  //options
          editGameOptions(instance);
          displayList(menuItems, menuName);
          break;
        case "A": //About
          AboutMenu about = new AboutMenu();
          about.getInput();
          displayList(menuItems, menuName);
          break;
        case "P":  //player statistics
          player.playerStatistics();
          displayList(menuItems, menuName);
          break;
        case "G": //show high score 
          HighScore scores = new HighScore();
          scores.readFile();
          scores.displayHighScores();
          displayList(menuItems, menuName);
          break;
        case "H":  //help
          HelpMenu helpMenu = new HelpMenu();
          helpMenu.getInput();
          displayList(menuItems, menuName);
          break;
        case "S": //Start game
          break;
        case "Q":
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




