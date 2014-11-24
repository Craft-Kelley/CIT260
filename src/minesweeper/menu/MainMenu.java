package minesweeper.menu;

import minesweeper.HighScore;
import minesweeper.Minesweeper;
import minesweeper.Player;


//import java.util.ArrayList;
//import java.util.Scanner;

/**
 *
 * @author Jacky Northgrave
 * @author Summer Smith
 */
public class MainMenu extends Menu{
  private final static String menuName = "Main Menu";
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
  public MainMenu(){
    super(MainMenu.menuItems, MainMenu.menuName);
    String select = super.getInput(menuItems);
   
  
  /*
  * Gets input from the user
  * @return true when the player wants to start a game
  * @return false when the player wants to quit a game
  */
 /* public void getInput(Minesweeper instance){
    String input;
    Scanner inFile = new Scanner(System.in);
    displayOptions(menuItems);
    
    do{
      input = inFile.nextLine();
      input = input.trim().toUpperCase();
       */
switch (select) {
        case "O":  //options
          OptionMenu option = new OptionMenu();
          display(menuItems);
          break;
        case "A": //About
          AboutMenu about = new AboutMenu();
          //getInput(menuItems);
          //displayOptions(menuItems);
          break;
        case "P":  //player statistics
          Player.playerStatistics();
          getInput();
          MainMenu menu = new MainMenu();
        case "G": //show high score 
          HighScore scores = new HighScore();
          scores.readFile();
          scores.displayHighScores();
          getInput();
          MainMenu main = new MainMenu();
        case "H":  //help
          HelpMenu helpMenu = new HelpMenu();
          helpMenu.getInput();
          display(menuItems);
          break;
        case "S": //Start game
          Minesweeper.startGame();
          break;
        case "Q":
          
          break;
        default:
          System.out.println("Invalid input. Please enter a valid command.");
          display(menuItems);
          break;
      }
    } //while (!input.equals("S")); //start game returns to minesweeper to start the game
  }

   




