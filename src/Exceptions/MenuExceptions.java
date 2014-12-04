/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author Kelley
 *         Casey
 *         Jacky 
 */ 
public class MenuExceptions extends Exception {
    public MenuExceptions() {
 
}
    public MenuExceptions(String message) {
        super(message);
    } 
    public MenuExceptions(String message, Throwable cause) {
        super(message, cause);
    } 
    public MenuExceptions(Throwable cause) {
        super(cause);
    } 
}
