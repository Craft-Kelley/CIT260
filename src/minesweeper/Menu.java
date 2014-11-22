/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minesweeper;

import java.io.Serializable;

/**
 *
 * @author Summer
 */
public abstract class Menu implements Serializable{
 static String[] menuItems = null;
 static String menuName = null;
 
 public void getInput(){};
 
 /*
 * Default constructor
 */
 public Menu(String[] items, String name){
  for (int i = 0; i < items.length; i++)
     menuItems[i] = items[i];
  menuName = name;
 }
 
 
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
 

}
