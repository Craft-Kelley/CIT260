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
public class AboutMenuView {
    
    private final static String[] menuItems = {
        ("D = Developers"),
        ("C = Course Information"),
        ("Q = Quit About Menu")
    };
    
    //Create instance of AboutMenuControl class
    
    private AboutMenuControl aboutMenuControl = new AboutMenuControl();
    
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
    public final void display(){
        System.out.println("\n\t==================================================");
        System.out.println("\tEnter the letter for your selection choice");
        for (int i = 0; i < AboutMenuView.menuItems.length; i++ ){
            System.out.println("\t     " + menuItems[i]);
        }
        System.out.println("\t==================================================\n");
        
       
    }
    
    
    
}
