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
 * @author Casey
 */
public class GetPlayerNameView implements Serializable{
    public GetPlayerNameView() {
      
    }
    

  /*
  * Get user input
  */
  public String getInput () {
    Scanner inFile = new Scanner(System.in);
    String input = "";
    boolean goodInput = false;  //This should only change if invalid input is 
                               //detected
        
     while(!goodInput){
        goodInput = true;

//Prompt for name
       System.out.println("Please enter name: ");
      
      //get value entered by user
      input = inFile.nextLine();            
      char[] chars = input.toCharArray();
      
      //If the user did not enter input....
      if (chars.length < 1)
        goodInput = false;
      
      else{
        //Verify that input contains only letters
        for (char c : chars) {
         if(!Character.isLetter(c)) {
           goodInput = false; //If a non-letter is found, prompt for input again
          }
        }
      } 
       
      //If we have bad input, output error message
      if (!goodInput){
        System.out.println("ERROR: Name should contain only alpha caracters.  No numbers or special characters accepted.");
      }
    } 
            
    //Once we are outside of the loop, we have good input.
    //Output the greeting message and end the function.
    System.out.println("Welcome: " + input);
    return input;
  }

}
