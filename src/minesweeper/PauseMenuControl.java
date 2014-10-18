/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minesweeper;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Casey
 */
public class PauseMenuControl {
  String menuName = "Pause Menu";
  String greeting= "This is the Pause Menu Page.";
  private final static String[][] menuItems = {
        {"S - Start Game"},
        {"A - Pause"},
	{"Q - Quit"}
        };

 /*
 * Constructor 
 */

 PauseMenuControl(){

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
        case "A":  //pause
	GameCode.gamePause();
	break;
	case "S":   //start
	GameCode.gameStart()
	break;
	case "Q":   //quit
	GameCode.gameQuit()	
	break;
        default:
        System.out.println("Invalid input. Please enter a valid command.");
        displayList();
        break;
      }
    } while (!input.equals("A")); //pauses the timer and freezes the game
    
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
