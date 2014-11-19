package minesweeper;


import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jacky Northgrave
 * @author Summer Smith
 */
public class MainMenu  extends Menu{
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
  
 
   }




