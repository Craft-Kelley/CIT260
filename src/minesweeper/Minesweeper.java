package minesweeper;

/**
 *  Project: Minesweeper
 * 
 *  Authors:
 *    Kelley Craft
 *    Jacky Northgrave
 *    Summer Smith
 *    Jonathan Crawford
 *    Casey Ames
 * 
 *  Summary:
 *    This is a simple game ... (INSERT GAME SUMMARY HERE)
 */
public class Minesweeper {

    public String level;
    private int minesLeft;
    String name = "John Doe";
    String instructions = "Welcome to the game of Minesweeper. \n"
            + "You will be playing individually. The objective of the game \n "
            + "is to find the empty squares while avoiding the mines.\n "
            + "Good Luck!";
    static Player player;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {      
      HelpMenuView helpMenuView = new HelpMenuView();
      helpMenuView.displayOptions();

      
    }
    
    /*
    * StartGame provides startup protocols for a new game
    */
    public static void startGame(){
      player = new Player();
      
      //Display main menu
      MainMenuControl mainMenu = new MainMenuControl();
      
      
      
      //Redirect based on menu selections
    }
    
    public void getName(){
      System.out.println(name);
    }
   
    public void displayHelp(){
      System.out.println(instructions);
    }
      
}
