/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minesweeper.exceptions;

/**
 *
 * @author Jacky Northgrave
 * 
 */
public class BoardExceptions extends Exception {
     public BoardExceptions() {
 
}
    public BoardExceptions(String message) {
        super(message);
    } 
    public BoardExceptions(String message, Throwable cause) {
        super(message, cause);
    } 
    public BoardExceptions(Throwable cause) {
        super(cause);
    } 
}
