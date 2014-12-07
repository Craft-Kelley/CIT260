/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minesweeper.exceptions;

/**
 *
 * @author Summer
 */
public class OutOfBoundsException extends Exception{
    public OutOfBoundsException() {
 
    }
    
    public OutOfBoundsException(String message) {
        super(message);
    } 
    public OutOfBoundsException(String message, Throwable cause) {
        super(message, cause);
    } 
    public OutOfBoundsException(Throwable cause) {
        super(cause);
    } 
    
    public void showLimit(int lim, int input){
        System.out.println("Out of bounds exception!");
        System.out.println("--- Limit is " + lim + " ---");
        System.out.println("--- Input is " + input + " ---");
    }
}

