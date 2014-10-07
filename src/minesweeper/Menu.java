package minesweeper;

import java.util.ArrayList;

/**
 * Menu class will provide a structure for creating menus
 * @author Jacky Northgrave
 */
public class Menu {

  String menuName;
  String greeting= "This is the Main Menu Page.";
  private ArrayList <String> menuItems = null;
    
  /*
  * Default constructor
  */
  Menu(){
    }
    
  /*
  * Constructor with parameters
  */
  Menu(String name, ArrayList <String> items){
    this.menuName = name;
    this.menuItems = items;
  }
    
  /**
  * This function will display the menu information
  */ 
  public void display(){
    //Output menu name
    
    System.out.println(greeting);
        
    //Output menu items
  }
  
  /**
  * This function will display individual
  * strings (menu items) as options for the menu
  */ 
  public void displayList(){
  
  }


}
