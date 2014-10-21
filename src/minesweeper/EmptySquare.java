/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minesweeper;

/**
 * Class comment
 * @author Summer
 */
public class EmptySquare extends Square{
  int numTouching;
  
  /*
  * Constructor with parameters
  */
  public void EmptySqure(int touching){
    numTouching = touching;
    isFlagged = false;
    isClicked = false;
  }
  
  /*
  * Default constructor
  */
  public void EmptySquare(){
    isFlagged = false;
    isClicked = false;
  }
  
  /*
  * Getter for numTouching
  */
  public int getNumTouching(){
    return numTouching;
  }
  
  /*
  * Setter for
  */
  public void setNumTouching(int touching){
    numTouching = touching;
  }
  
  /*
    * Getter for isMine
    */
    public boolean getIsMine(){
      return false;
    }

  /*
  * onClick defines the behavior of the square once it has been clicked
  */  
  @Override
  public void onClick() {
    //Display number of mines touching
    
  }

}
