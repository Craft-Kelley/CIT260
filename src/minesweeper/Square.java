package minesweeper;

/**
 * Square class will define a square on the playing board - KC
 * @author Kelley Craft
 */
public abstract class Square {
    boolean isFlagged;// declares if the square is flagged
    boolean isClicked; // declares if a flag is clicked
    int numTouching;
    
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
