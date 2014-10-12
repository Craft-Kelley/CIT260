/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minesweeper;

import java.awt.Composite;

/**
 *
 * @author Casey
 * 
 * This is a timer that increases by 1 every second.
 */
public class Timer {
     
    long base;
    int offset;
    boolean running;
    Runnable runnable;
    
    /**
     * The period of the timer in milliseconds.
     * @param parent
     * @param style
     */
    
	public Timer (Composite parent, int style) {
    super (parent, style);
    final Display display = getDisplay ();
	      runnable = new Runnable () {
                  @Override
	          public void run () {
            if (isDisposed ()) return;
            long time = System.currentTimeMillis ();
            setValue (offset + (int) (time - base) / 1000);
            display.timerExec (PERIOD, runnable);
        }

        private boolean isDisposed() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void setValue(int i) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    };
}

/**
 * Determines if the timer is running.
 * 
 * @return true if the timer is running; false otherwise.
 */
	  public boolean isRunning () {
    return running;
}

/**
 * Resets the counter.  The next time the counter draws,
 * it will start again from zero.
 */
	  public void reset () {
    base = System.currentTimeMillis ();
    offset = 0;
}

/**
 * Starts the counter.  If the counter was stopped,
 * it will start drawing again begining at the same
 * point where it stopped.
 */
	  public void start () {
    if (running) return;
    base = System.currentTimeMillis ();
    running = true;
    Display display = getDisplay ();
    display.timerExec (0, runnable);
}

/**
 * Stops the counter.  The counter will stop drawing.
 */
	public void stop () {
    if (!running) return;
    offset = getValue ();
    running = false;
    Display display = getDisplay ();
    display.timerExec (-1, runnable);
}

    private Display getDisplay() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private int getValue() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class Display {

        public Display() {
        }

        private void timerExec(int i, Runnable runnable) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

}