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
public class GameMenuView {
        GameBoard board; //This will be passed in from the Minesweeper class
        private final static String[][] menuItems = {
        {"G", "Guess Square"},
        {"P", "Pause"},
        {"R", "Reveal Board"},
        {"Q", "Quit Game"},
        {"D", "Display the board"}   
    };

        public GameMenuView (GameBoard board){
            this.board = board;
        }
        
 
    //user input
    public void getInput(Player player){
        
        Scanner inFile = new Scanner(System.in);
        String input = inFile.nextLine();
                
        do {     
            //display the game menu
            this.displayGameOptions();
            
            input = inFile.nextLine();
            input = input.trim().toUpperCase();
    
            switch (input) {
                //guess square      
                case "G":
                guessSquare();
                //Having trouble calling the input from user I thought it would be : displayInput();
                    break;
                  
                //pause game    
                case "P":
                //Nothing is in the Pause class. I wasn't sure if this was right but I gave it my best attempt
                PauseMenuView pause = new PauseMenuView();
                    break;
                  
                //reveal game board    
                case "R":
                board.revealBoard();
                    break;
                  
                //quit game    
                case "Q":
                    break;
                  
                //display game board    
                case "D":
                    board.displayBoard();
                    break;
                  
                default:
                    System.out.println("Invalid input. Please enter a valid command.");
                    continue;
                
               /* 
                case "N":
                    Player playerName = new Player(); //added instance to debug function (kc)
                    playerName.playerStatistics();
                    break;
                //displays game options
                case "O":
                    gameMenuControl.displayOptionMenu();
                    break;
                //displays help menu
                case "H":
                    gameMenuControl.displayHelpMenu();
                    break;
                //creates error warning if user enters invalid input    
                default:
                    System.out.println("Invalid input. Please enter a valid command.");
                    displayGameOptions();
                    break;*/
            
            }
        //quit minesweeper game    
        } while (!input.equals("Q"));
          
          return;
    }
    
    /*
    * displays the items in the menuItems array
    */
    public void displayGameOptions(){
        System.out.println("\n\t==============================");
        System.out.println("\tGame Menu Options:");
        
        for (String[] menuItem : menuItems) {
      System.out.println("\t" + menuItem[0] + "\t" + menuItem[1]);
    }
        System.out.println("\t==============================\n");    
    }
    
    /*
    * Prompts the user for the coordinates they wish to guess
    */
    void guessSquare(){
      Scanner inFile = new Scanner(System.in);
      String input = inFile.nextLine();
      
      char[] coords = new char[2];
      
      
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
      
      return true;
    }
    
    /*
    * verifies that the coordinates are inside the boundaries of the board array
    */
    void checkCoordinates(int input[]){
      
    }
    
}
