/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minesweeper.menu;

import java.util.Scanner;
import minesweeper.GameBoard;
import minesweeper.Minesweeper;
/**
 *
 * @author Jacky Northgrave
 */
public class GameMenu extends Menu{
    GameBoard board; //This will be passed in from the Minesweeper class
    private final static String[] menuItems = {
        ("G = Guess Square"),
        ("P = Pause"),
        ("R = Reveal Board"),
        ("Q = Quit Game"),
        ("D = Display the board")   
    };
    
    private final static String menuName = "GameMenu";
    
    
   /*
   * Constructor
   */
   public GameMenu(){
      super(menuItems, menuName);
      String select = getInput(menuItems);
      //displayOptions(menuItems);
    
      /*getInput();
   }
        
  @Override
  public String toString(){
    String theString = "duh";
    
    return theString;
  }
  /*
  * gets input from the user to direct game play
   
    public void getInput(Player player){   
        String input = "D";
        Scanner inFile = new Scanner(System.in);
        //displayOptions(menuItems);        
      do { 
       if (board.gameIsWon())
       //   break;
          */

        /*input = inFile.nextLine();  
        input = input.trim().toUpperCase();*/
                
        switch (select) {     
          case "G"://guess square
            guessSquare();
            break;
          case "P"://pause game  
            PauseMenu pause = new PauseMenu();
            GameMenu game = new GameMenu();
          case "R"://reveal game board    
            //board.revealBoard();//debugging
            display("A Work In Progress");
            break;
          case "Q"://quit game  
            break;  
         case "D"://display game board
            //board.displayBoard();//debugging
             display("A Work In Progress");
            break;           
          default:
            System.out.println("Invalid input. Please enter a valid command.");
            } 
       
    }

  
    /*
    * Prompts the user for the coordinates they wish to guess
    */
    private void guessSquare(){
      String[] guessItems = {
        ("C = - Click Square"),
        ("F = - Flag Square"),
        ("R = - Return to game menu")
       };
      
      char[] coords = new char[2];
      getCords(coords);
      String select = getInput(guessItems);
      
     switch(select){
         case "C":
             board.clickSquare(coords[1], coords[2]);
         case "F":
             board.flagSquare(coords[1],coords[2]);
         case "R":
             GameMenu game = new GameMenu();
     }
     /* Scanner inFile = new Scanner(System.in);
      String input = inFile.nextLine();
                
      displayOptions(guessItems);
            
      input = inFile.nextLine();
      input = input.trim().toUpperCase();
        
      if (input.equals("C")){
        board.clickSquare(coords[1], coords[2]);
      }
      else if (input.equals("F")){
        board.flagSquare(coords[1], coords[2]);
      }
      else if (input.equals("R") == false){
        System.out.println("Invalid input. Please enter a valid command.");
      }*/

    }
  
    /*
    * get coords prompts the user for coordinates.
    * @param coords  - an array of size 2 to be filled with the user input
    */
    private void getCords(char[] coords){
      Scanner inFile = new Scanner(System.in);
      String input = inFile.nextLine();
      
      do{
        System.out.println("Coordinates: ");
        input = inFile.nextLine();
        input = input.trim().toUpperCase();
        
        for (int i: coords){
          coords[i] = input.charAt(i);
          
          System.out.println((int)coords[0] + (int) coords[1] + "  wahoo  ");//for testing purposes
        }
        
      }while(!convertCoordinates(coords));
    }
    
    /*
    *Converts coordinates (i.e. A1) to numbers (i.e. 1-1)
    * @param coords is an array holding two chars- the coordinates. 
    * @return true if the coordinates are valid and have been converted
    * @return false if the coordinates are invalid or could not be converted
    */
    boolean convertCoordinates(char[] coords){
       
        int x = (int)coords[0]; // pulls out the x coordinate
        int y = (int)coords[1]; //pulls out the y coordinate and casts it to an int
        int r = instance.getBoardRows(); // gets number of rows
        int c = instance.getBoardCols(); //creates a variable equal to the number of columns
        int[] convertedCoords = new int[2]; //creates variable to hold converted coordinates
        
        /*
        compares x and y coordinate to the r variable above to ensure the selection is within the range of rows in the game. If either is out of range it returns a value of false.  If variable are valid, then it casts them both to an integer in a new array and returns a value of true. 
        */
      /*  if (x < r || x > r){
            System.out.println("Enter a letter A through " + (char)r);
            return false;
        }else if (y < 1 || y > c){
            System.out.println("Enter a column between 1 and " + c);
            return false;
        }else{ 
            convertedCoords[0] = (int) x;
            convertedCoords[1] = (int) y;
            System.out.println("Converted Coordinates are (" + convertedCoords[0] + "," + convertedCoords[1] + ")");
          */  return true;
       // }
     
    }
    
    /*
    * verifies that the coordinates are inside the boundaries of the board array
    */
    private void checkCoordinates(int input[]){
      
    }
    
}
