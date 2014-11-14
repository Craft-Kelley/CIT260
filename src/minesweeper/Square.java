package minesweeper;

import java.io.Serializable;

/**
 * Square class will define a square on the playing board - KC
 * @author Kelley Craft
 */
public abstract class Square implements Serializable{
    boolean isClicked;
    static boolean isFlagged;
    int numTouching = 0;
    
    //Abstract functions  -- to be defined in subclasses
    public abstract void onClick(); //Defines behaviour when square is clicked
    public abstract boolean getIsMine();
    
    /*
    * Getter for isClicked
    */
    public boolean getIsClicked(){
      return isClicked;
    }

    
    /*
    * Setter for isMine, also takes action if the
    * clicked status is changed to true
    */
    public void setIsClicked(boolean click){
      isClicked = click;
      if (isClicked)
        onClick();
    }
    
   /*
  * Setter for numTouching
  */
  public void setNumTouching(int touching){
    numTouching = touching;
  }
  
    /*
  * Getter for numTouching
  */
  public int getNumTouching(){
    return numTouching;
  }
    
    /*
    * Getter for isFlagged
    */
    public boolean getIsFlagged(){
      return isFlagged;
    }
    
    /*
    * Setter for isFlagged
    */
    public void setIsFlagged(boolean flag){
      isFlagged = flag;
    }
       
    /**
     *This function allows the status of the square to be retrieved
     **/     
    public void SquareMineStatus(){
        System.out.println("status of isFlagged = " + isFlagged);
        System.out.println("status of isClicked = " + isClicked);
    }  
}