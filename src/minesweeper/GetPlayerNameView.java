/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minesweeper;
import java.util.Scanner;

/**
 *
 * @author Casey
 */
public class GetPlayerNameView {
    public GetPlayerNameView() {
      
    }
    

  /*
  * Get user input
  */
  public String getInput() {
    Scanner inFile = new Scanner(System.in);
    String input = "";
    boolean goodInput = true;  //This should only change if a non-letter is 
                               //found in the input
        
    do {
      if (goodInput) //If this is our first time through the loop, just output prompt
        System.out.println("Please enter name: ");
      else if (!goodInput){ //If this not our first time through the loop,
        //Output error message before re-promtping for name
        System.out.println("ERROR: Name should contain only alpha caracters.  No numbers or special caracters accepted.");
        System.out.println("Please enter name: ");
      }
      
      //get value entered by user
      input = inFile.nextLine();            
      char[] chars = input.toCharArray();
      
      //Verify that input contains only letters
      for (char c : chars) {
        if(!Character.isLetter(c)) {
         goodInput = false; //If a non-letter is found, prompt for input again
        }
      }
       
    } while(!goodInput); 
            
    //Once we are outside of the loop, we have good input.
    //Output the greeting message and end the function.
    System.out.println("Welcome: " + input);
    return input;
  }

}
