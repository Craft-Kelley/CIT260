/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * @author Kelley Craft
 */
package minesweeper;

/**
 * Will tell if Mine is dormant or activated
 */
public class Mine extends Square{

  public boolean detonated; //mine status true for detonated false for not
  public String gameOver = "Kaboom!  You just blew up a mine! \n Game over!";

  /* 
  * function will show dormant or display end game message for clicked mine 
  */
  @Override
  public void onClick() {
    detonated = true;
    
    if (detonated == true) {
        System.out.println(gameOver);
        
}
    else System.out.println("take another turn");   
  }

  /*
    * Getter for isMine
    */
    public boolean getIsMine(){
      return true;
    }

  
  public void Mine(){
    isFlagged = false;
    isClicked = false;
  }

}

    
    
