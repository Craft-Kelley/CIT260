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
  /*
  * onClick defines the behavior of the square once it has been clicked
  */  
  @Override
  public void onClick() {
    
  }

  /*
  * Constructor with parameters
  */
  public void EmptySquare(){
    isMine = false;
    isFlagged = false;
    isClicked = false;
  }
}
