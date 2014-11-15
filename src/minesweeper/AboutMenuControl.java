/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minesweeper;


/**
 *
 * @author Kelley
 */
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
    
public static void displayCourse(){
    System.out.println();
    displayAboutBorder();
    System.out.println("\n\t CIT-260 section 03"
            + "\n\t Instructor:  Dr. Aaron Wester"
            + "\n\t AKA Brother Wester");
    displayAboutBorder();
}
    
private static void displayAboutBorder(){
    System.out.println("\n++++++++++++++++++++++++++++++++++++++");
}
}
