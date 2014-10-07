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
    isMine = false;
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
  public void setNumtouching(int touching){
    numTouching = touching;
  }
  
  /*
  * onClick defines the behavior of the square once it has been clicked
  */  
  @Override
  public void onClick() {
    
  }

}
