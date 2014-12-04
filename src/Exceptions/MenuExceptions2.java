/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author Kelley
 */
public class MenuExceptions2 extends Exception {
    public MenuExceptions2() {
 
}
    public MenuExceptions2(String message) {
        super(message);
    } 
    public MenuExceptions2(String message, Throwable cause) {
        super(message, cause);
    } 
    public MenuExceptions2(Throwable cause) {
        super(cause);
    } 
}