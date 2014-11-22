/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minesweeper;

import java.util.Scanner;
/**
 *
 * @author Jacky Northgrave
 */
public class HelpMenu extends Menu{
      private final static String[] menuItems = {
        ("M - Main Menu"),
        ("D - Display Instructions"),
        ("Q - Quit Help")
      };
      
      private final static String menuName = "Help Menu";
         

  //  private final HelpMenuControl helpMenuControl = new HelpMenuControl ();
    
    
    /*
    * Default Constructor
    */
    public HelpMenu(){
      super(HelpMenu.menuItems, HelpMenu.menuName);
      String select = getInput(menuItems);
      switch (select) {
          case "M":
              MainMenu main = new MainMenu();
        case"D": 
            displayInstructions();
        case "Q":
            MainMenu menu = new MainMenu();
            
      }

    }
    public void displayInstructions(){
    System.out.println(
            "\tThe game is Minesweeper. It is a one player game. Mines are "
            + "\nhidden on a grid of tiles. Tiles will either be blank, numbered "
            + "\nor filled with a mine. If you click on a tile with a mine it will "
            + "\nend the game. If you click on a tile with a number it will reveal "
            + "\nhow many mines are touching the tile. "
        );
    getInput();
    HelpMenu help = new HelpMenu();
    }
    /*
    * Gets user input
    *
    @Override
    public void getInput(){
        
        String input; 
        Scanner inFile = new Scanner(System.in);
        
        
        do {
            
            displayOptions();
            
            input = inFile.nextLine();
            input = input.trim().toUpperCase();
        
            switch (input) {
                case "M":
                    return;
                case "D":
                    this.helpMenuControl.displayInstructions();
                    break;
                case "Q":
                    break;
                default:
                    System.out.println("Invalid input. Please enter a valid command.");
                    continue;
            
            }
        } while (!input.equals("Q"));
          
      return;
    }*/
  /**
  *
  * @author Jacky Northgrave
  */
/*public class HelpMenuControl {
    
    public  void displayInstructions(){
        System.out.println(
            "\tThe game is Minesweeper. It is a one player game. Mines are "
            + "hidden on a grid of tiles. Tiles will either be blank, numbered "
            + "or filled with a mine. If you click on a tile with a mine it will "
            + "end the game. If you click on a tile with a number it will reveal "
            + "how many mines are touching the tile. "
        );
    }*/
}


