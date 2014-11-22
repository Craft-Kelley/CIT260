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
 * @author Summer
 */
public abstract class Menu implements Serializable{
 static String[] menuItems = null;
 static String menuName = null;
 
// public void getInput(){};
 
 /*
 * Default constructor
 */
 public Menu(String[] items, String name){
  //for (int i = 0; i < items.length; i++)
    // menuItems[i] = items[i];
  menuName = name;
  //String select = getInput(items);
 }
 
 /*
 * reusable getInput code
 *@param Menu Items array
 *@auth Kelley
 */
 
 public String getInput(String[] items){
        
        String select;
        Scanner inFile = new Scanner(System.in);
        
        do {
            displayOptions(items); //display item
            
            //get selection entered
            select = inFile.nextLine();
            select = select.trim().toUpperCase();
            
            return select;
        } while (!select.equals("Q"));
                
        
                      }
 /*
 * reusable getInput code for a more simplified input need.  No parameters required.
 */
 public void getInput(){

     String select;
     Scanner inFile = new Scanner (System.in);
     System.out.println(menuName + "\nPress Enter to Continue");
     select = inFile.nextLine();
     
     
 
 };  
 
 
 /*
 * Setter for menu name
 * @param name - a string to be set as the menuName
 */
 public void setMenuName(String name){
   menuName = name;
 }
 
  
 /*
 * Displays the menu items in a standard way
 */
 void displayOptions(){
    System.out.println("\n====================================================");
    System.out.println(menuName + ":");
    System.out.println("Enter the letter for your selection choice.");
    for (int i = 0; i < menuItems.length; i++ ){
      System.out.println("\t" + menuItems[i]);
    }
    System.out.println("\n====================================================");
    System.out.print("> ");    
  }
 
  /*
 * Displays the menu items in a standard way
 */
 void displayOptions(String[] items){
    System.out.println("\n====================================================");
    System.out.println(menuName + ":");
    System.out.println("Enter the letter for your selection choice.");
    for (int i = 0; i < items.length; i++ ){
      System.out.println("\t" + items[i]);
    }
    System.out.println("\n====================================================");
    System.out.print("> ");    
  }
 /*
 * displayOption works with a string to create a nice display
 * @param String item (not an array)
 * 
 */
 public void displayOptions(String item){
     String output = item;
 System.out.println("\n====================================================");
 System.out.println(output);
  System.out.println("\n====================================================");      
 }

}
