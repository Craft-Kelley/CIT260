/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minesweeper;

import java.util.Scanner;
import java.io.Serializable;

/**
 *
 * @author Kelley
 */
public class AboutMenuView implements Serializable {
    
    private final static String[] menuItems = {
        ("D = Developers"),
        ("C = Course Information"),
        ("Q = Quit About Menu")
    };
    
    //Create instance of AboutMenuControl class
    
    private  final AboutMenuControl aboutMenuControl = new AboutMenuControl();
    
    //default constructor
    
    public AboutMenuView(){
        
    }
    
    //display menu and get user input
    
    public void getInput(){
        
        String select;
        Scanner inFile = new Scanner(System.in);
        
        do {
            this.display(); //display item
            
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
    private static final void display(){
        System.out.println("\n====================================================");
        System.out.println("About this program: ");
        System.out.println("Enter the letter for your selection choice");
        for (int i = 0; i < AboutMenuView.menuItems.length; i++ ){
            System.out.println("\t" + menuItems[i]);
        }
        System.out.println("\n====================================================");
        System.out.print("> ");
       
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
