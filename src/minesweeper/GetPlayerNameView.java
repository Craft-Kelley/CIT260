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
//get input from user
    public String getInput() {
        Scanner inFile = new Scanner(System.in);
        String getInput;
        int Llama = 0;
   
    /*insert code for letters only
    public boolean isAlpha(getInput) {
        char[] chars = getInput.toCharArray();

    
    for (char c : chars) {
        if(!Character.isLetter(c)) {
            return false;
        }
    }
    return true;
    */
        while(Llama < 1) {
            System.out.println("Please enter name");
            //get value entered by user
            getInput = inFile.nextLine();
            
        if(getInput.length() > 0) {
            System.out.println("Welcome:" + getInput);
        }
        
        else {
            continue;
        }
}   
        return null;
    }
}
