/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minesweeper;

import java.util.Scanner;

/**
 *
 * @author Kelley
 */
public class AboutMenu extends Menu {

    //Create instance of AboutMenuControl class    
    private  final AboutMenuControl aboutMenuControl = new AboutMenuControl();
    
    /*
    * Default constructor
    */
    public AboutMenu(){
      String[] items = {
        ("D = Developers"),
        ("C = Course Information"),
        ("Q = Quit About Menu")
      };
      setMenuItems(items);
      
      setMenuName("About Menu");
    }
    
    /*
    * Get user input to direct menu
    */
    @Override
    public void getInput(){
        
        String select;
        Scanner inFile = new Scanner(System.in);
        
        do {
            displayOptions(); //display item
            
            //get selection entered
            select = inFile.nextLine();
            select = select.trim().toUpperCase();
            
            switch(select){
                case "D":
                    this.aboutMenuControl.displayDevelopers();
                    break;
                case "C":
                    this.aboutMenuControl.displayCourse();
                    break;
                case "Q":
                    break;
                default:
                    System.out.println("Invalid choice.  Please enter D, C, or Q.");
                    continue;
        }  
        }
        while (!select.equals("Q"));
            
            return;
            
    }

    
public class AboutMenuControl  {
    public AboutMenuControl(){
        
    }

    public void displayDevelopers(){
      System.out.println();
      this.displayAboutBorder();
      System.out.print("\t\tGroup 1\n"
            + "\n Casey Ames"
            + "\n Kelley Craft"
            + "\n Jonathan Crawford"
            + "\n Jacky Northgrave"
            + "\n Summer Smith");
    displayAboutBorder();
}
    
public void displayCourse(){
    System.out.println();
    displayAboutBorder();
    System.out.println("\n\t CIT-260 section 03"
            + "\n\t Instructor:  Dr. Aaron Wester"
            + "\n\t AKA Brother Wester");
    displayAboutBorder();
}
    
private void displayAboutBorder(){
    System.out.println("\n++++++++++++++++++++++++++++++++++++++");
}
}

    
}
