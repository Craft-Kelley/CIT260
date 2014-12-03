/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions1;

/**
 *
 * @author Casey
 */
public class MenuExceptions1 extends Exception {
    public MenuExceptions1() {
 
}
    public MenuExceptions1(String message) {
        super(message);
    } 
    public MenuExceptions1(String message, Throwable cause) {
        super(message, cause);
    } 
    public MenuExceptions1(Throwable cause) {
        super(cause);
    } 
}


