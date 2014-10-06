/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minesweeperkc;

/**
 *
 * @author Jacky Northgrave
 */
public class Menu {
    
    // Menu class will allow users to
    // start a new game, access the options menu, 
    // check the win percentage, or view the help menu. 
    
    
    //Instance Variables
    String arrayList;
    String greeting= "This is the Main Menu Page.";
    
    private String [][] menuItems = null;
    
    public Menu(){
    }
    
    public Menu(String [][] menuItems){
        this();
        this.menuItems = menuItems;
    }
    
 /**
 * This function will allow a greeting
 * to appear whenever opening the menu
 */ 
    public void displayGreeting(String [] args){
        System.out.println(greeting);
    }
/**
 * This function will display individual
 * strings as options for the menu
 */ 
    public void displayList(){
        
    }
/**
 * This function will find and reveal
 * all of the adjacent empty cells
 */     
    public void findEmptyCells(){
        
    }
    public static void main(String [ ] args){
        
    }

}
