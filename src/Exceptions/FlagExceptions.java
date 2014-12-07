/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author Jonathan
 */
public class FlagExceptions extends Exception {

    /**
     * Creates a new instance of <code>FlagExceptions</code> without detail
     * message.
     */
    public FlagExceptions() {
    }
    public FlagExceptions(String message) {
        super(message);
    }

    public FlagExceptions(String message, Throwable cause) {
        super(message, cause);
    }

    public FlagExceptions(Throwable cause) {
        super(cause);
    }
    
}
