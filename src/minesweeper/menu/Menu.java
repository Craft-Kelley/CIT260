/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minesweeper.menu;

import java.io.Serializable;
import java.util.Scanner;
import minesweeper.Minesweeper;
import minesweeper.interfaces.DisplayInfo;
import minesweeper.interfaces.EnterInfo;

/**
 *
 * @author Summer
 * @author Jacky 
 */
// public void getInput(){};
 public class Menu implements Serializable, DisplayInfo, EnterInfo{
 static String[] menuItems = null;
 static String menuName = null;
   Minesweeper instance;
 
   
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
            display(items); //display item
            
            //get selection entered
            select = inFile.nextLine();
            select = select.trim().toUpperCase();
            
            return select;
        } while (!select.equals("Q"));
                
        
                      }
 /*
 * reusable getInput code for a more simplified input need.  No parameters required.
 */
 @Override
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
 @Override
 public void display(){
    System.out.println("\n====================================================");
    System.out.println(menuName + ":");
    System.out.println("Enter the letter for your selection choice.");
     for (String menuItem : menuItems) {
         System.out.println("\t" + menuItem);
     }
    System.out.println("\n====================================================");
    System.out.print("> ");    
  }
 
  /*
 * Displays the menu items in a standard way
 */
 void display(String[] items){
    System.out.println("\n====================================================");
    System.out.println(menuName + ":");
    System.out.println("Enter the letter for your selection choice.");
     for (String item : items) {
         System.out.println("\t" + item);
     }
    System.out.println("\n====================================================");
    System.out.print("> ");    
  }
 /*
 * displayOption works with a string to create a nice display
 * @param String item (not an array)
 * 
 */
 public void display(String item){
     String output = item;
 System.out.println("\n====================================================");
 System.out.println(output);
  System.out.println("\n====================================================");      
 }

}
