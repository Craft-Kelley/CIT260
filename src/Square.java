/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minesweeperkc;

/**
 * Square class will define a square on the playing board - KC
 * @author Kelley Craft
 */
public class Square {
   
    //Instance variables
    
    public boolean isMine; // declares if the square is a mine
    public boolean isFlagged;// declares if the square is flagged
    public boolean isClicked; // declares if a flag is clicked
    
    //initialize the Square
    public Square(){
    }
    
    /**
     *This function allows the status to change
     * @param none
     * @return system output status of variables isMine, isFlagged, isClicked
     **/
        
    public void SquareMineStatus(){
        
        isMine = true; // declares if the square is a mine
        isFlagged = false; // declares if the square is flagged
        isClicked = false; // declares if a flag is clicked
        
        System.out.println("status of isMine = " + isMine);
        System.out.println("status of isFlagged = " + isFlagged);
        System.out.println("status of isClicked = " + isClicked);
    }
    
    /**
     *this function allows the status of a square to be retrieved.
     * @param none
     * @return system output of test message
     */
    public static void getStatus (){
        
        String status="this might be redundant";
        System.out.println(status);
    }
        
    }
