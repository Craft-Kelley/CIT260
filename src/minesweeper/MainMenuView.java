/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minesweeper;

import java.util.ArrayList;

/**
 *
 * @author Jacky Northgrave
 */
public class MainMenuView {
  
    String menuName;
  String greeting= "This is the Main Menu Page.";
  private ArrayList <String> menuItems = null;
    /*
  * Constructor with parameters
  */
  MainMenuView(String name, ArrayList <String> items){
    this.menuName = name;
    this.menuItems = items;
  }
      /**
  * This function will display the menu information
  */ 
  public void display(){
    //Output menu name
    
    System.out.println("");
        
    //Output menu items
  }
  
  /**
  * This function will display individual
  * strings (menu items) as options for the menu
  */ 
  public void displayList(){
  
  }

}
