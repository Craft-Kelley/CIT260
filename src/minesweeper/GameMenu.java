/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minesweeper;

import java.io.Serializable;
import java.util.Scanner;
/**
 *
 * @author Jacky Northgrave
 */
public class GameMenu implements Serializable{
    GameBoard board; //This will be passed in from the Minesweeper class
    private final static String[][] menuItems = {
        {"G", "Guess Square"},
        {"P", "Pause"},
        {"R", "Reveal Board"},
        {"Q", "Quit Game"},
        {"D", "Display the board"}   
    };

   /*
   * Constructor
   */
   public GameMenu(GameBoard board){
      this.board = board;
   }
        
  @Override
  public String toString(){
    String theString = "duh";
    
    return theString;
  }
  /*
  * gets input from the user to direct game play
   */
    public void getInput(Player player){      
      Scanner inFile = new Scanner(System.in);
      String input = inFile.nextLine();
                
      do { 
        if (board.gameIsWon())
          break;
        
        //display the game menu
        this.displayGameOptions(menuItems);
            
        input = inFile.nextLine();
        input = input.trim().toUpperCase();
                
        switch (input) {     
          case "G"://guess square
            guessSquare();
            break;
          case "P"://pause game  
            PauseMenu pause = new PauseMenu();
            break;
          case "R"://reveal game board    
            board.revealBoard();
            break;
          case "Q"://quit game  
            break;  
         case "D"://display game board
            board.displayBoard();
            break;           
          default:
            System.out.println("Invalid input. Please enter a valid command.");
            } 
        } while (!input.equals("Q"));         //quit minesweeper game   
          
          return;
    }
    
    /*
    * displays the items in the menuItems array
    */
    public void displayGameOptions(String[][] items){
        System.out.println("\n\t==============================");
        System.out.println("\tGame Menu Options:");
        
        for (String[] menuItem : items) {
      System.out.println("\t" + menuItem[0] + "\t" + menuItem[1]);
    }
        System.out.println("\t==============================\n");    
    }
    
    /*
    * Prompts the user for the coordinates they wish to guess
    */
    private void guessSquare(){
      String[][] guessItems = {
        {"C", "- Click Square"},
        {"F", "- Flag Square"},
        {"R", "- Return to game menu"}
       };
      
      char[] coords = new char[2];
      getCords(coords);
      
      Scanner inFile = new Scanner(System.in);
      String input = inFile.nextLine();
                
      this.displayGameOptions(guessItems);
            
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
      }

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
       
        char x = coords[0]; // pulls out the x coordinate
        int y = (int)coords[1]; //pulls out the y coordinate and casts it to an int
        char r = (char)(board.getNumRows() + 16); // creates a variabel equal to the number of rows in the board and converts it to a char equal to a letter in the ASCII characters
        int c = board.getNumCols(); //creates a variable equal to the number of columns
        int[] convertedCoords = new int[2]; //creates variable to hold converted coordinates
        
        /*
        compares x and y coordinate to the r variable above to ensure the selection is within the range of rows in the game. If either is out of range it returns a value of false.  If variable are valid, then it casts them both to an integer in a new array and returns a value of true. 
        */
        if (x < r || x > r){
            System.out.println("Enter a letter A through " + r);
            return false;
        }else if (y < 1 || y > r){
            System.out.println("Enter a row between 1 and " + c);
            return false;
        }else{ 
            convertedCoords[0] = (int) x;
            convertedCoords[1] = (int) y;
            System.out.println("Converted Coordinates are (" + convertedCoords[0] + "," + convertedCoords[1] + ")");
            return true;
        }
     
    }
    
    /*
    * verifies that the coordinates are inside the boundaries of the board array
    */
    private void checkCoordinates(int input[]){
      
    }
    
}