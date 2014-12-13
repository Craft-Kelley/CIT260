package minesweeper.menu;
import minesweeper.Minesweeper;
import minesweeper.frames.OptionFrame;
import java.util.Scanner;

/**
 *
 * @author Jacky Northgrave
 */
public class OptionMenu extends Menu{
  public final static String[] menuItems = { 
        ("R - Edit number of rows"),
        ("C - Edit number of columns"),
        ("G - Edit game level"),
        ("M - Return to main menu")
    };
  public final static String menuName = "Options Menu";
  

  public static void main(String[] args){
      final Minesweeper mine = new Minesweeper();
      
      try {
          java.awt.EventQueue.invokeLater(new Runnable(){
          @Override
          public void run(){
              mine.optionFrame = new OptionFrame();
              mine.optionFrame = setVisible(true);
          }
      });
      } catch (Throwable e){
          System.out.println("Unexpected error:" + e.getMessage());
          System.out.println(e.getStackTrace().toString());
      }
      finally{
          System.out.println("Exiting try catch; entering Finally");
          if(mine.optionFrame != null){
              mine.optionFrame.dispose();
          }
      }
  }
    
    /*
    * Default Constructor
    */
    public OptionMenu() {
        super(OptionMenu.menuItems, OptionMenu.menuName);
       // instance = theInstance;
        String select = getInput(menuItems);
       switch (select){ /*
            case "R":
                setBoardRows;
            case"C":
                gameCols; 
            case "G":
               gameLevel();
            case "M":
                MainMenu main = new MainMenu();*/
        }
    }
        

    public void gameLevel() {
    int easy[] = {3,3,1};//stores values in an array to represent rows, cols, and mines
    int medium[] = {5,5,3};
    int hard[] = {10,10,20};
    
    String items[]={
        ("E = Easy"),
        ("M = Medium"),
        ("H = Hard"),
    };  
    String name = "Pick a level - Easy, Medium, or Hard";
    String select = getInput(items);
    switch (select){
        case "E":
            instance.setBoardRows(easy[0]);
            instance.setBoardCols(easy[1]);
            instance.setGameLevel(easy[2]);
            instance.getClass();
            

            
        case "M":
            instance.setBoardRows(medium[0]);
            instance.setBoardCols(medium[1]);
            instance.setGameLevel(medium[2]);
            
        case "H":
            instance.setBoardRows(hard[0]);
            instance.setBoardCols(hard[1]);
            instance.setGameLevel(hard[2]);
            
        default:
            System.out.println("Please enter E for Easy, M for Medium or H for Hard");
            getInput(items);
            MainMenu main = new MainMenu();
    }
    }
  
    
  /*It allows the user to select game edit options.
  * In this case, the selections are editing the number of rows,
  * editing the number of columns, and editing the game level. 
  * The game level is limited to 1, 2, or 3, while the number of
  * rows and columns on the board is not limited. 
  *
  * @param instance used to access the setters to change the actual
  * game settings.
  *  
  * Get user input to direct menu  
  *  
  */
    
  /*
    @Override 
    public void getInput(){
        
        String input;
        Scanner inFile = new Scanner(System.in);
        display(menuItems);

    do{
      display();
        
      input = inFile.nextLine();
      input = input.trim().toUpperCase();
       
      switch (input) {
        case "R":  //Edit number of rows
          instance.setBoardRows(getInt("Please enter the number of rows: ", 1000));
          break;
        case "C":  //Edit number of cols
          instance.setBoardCols(getInt("Please enter the number of columns: ", 1000));
          break;
        case "G":  //Edit game level
          String levelPrompt = "Please select level of difficulty: \n"
                               + "1 - Easy\n"
                               + "2 - Medium\n"
                               + "3 - Difficult\n"
                               + "> ";
          instance.setGameLevel(getInt(levelPrompt, 3));
          break;
        default:
          System.out.println("Invalid input. Please enter a valid command.");
          display(menuItems);
          break;
      }
    } while (!input.equals("M")); //Start game returns to minesweeper to start the game
    
  }
  
  
   Prompts the user, returns user input.  User input must be 
   an integer.
   @param prompt the prompt to display to the user to get the int
   @param limit the upper bound of the int (the highest number the int can be)
  
  public int getInt(String prompt, int limit){ //MOVE
    int input = 0;

    //Get input
    Scanner inFile = new Scanner(System.in);
    boolean goodInput = true;
    try {
    System.out.print("Input:");
    input = inFile.nextInt();
    
    //Display prompt
    System.out.println();
    
     }catch (Exception e){
     System.out.println(e.getMessage());
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
  */
}
