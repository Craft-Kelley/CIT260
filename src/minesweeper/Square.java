package minesweeper;

/**
 * Square class will define a square on the playing board - KC
 * @author Kelley Craft
 */
public abstract class Square {
    boolean isMine; // declares if the square is a mine
    boolean isFlagged;// declares if the square is flagged
    boolean isClicked; // declares if a flag is clicked
    
    //Abstract functions  -- to be defined in subclasses
    public abstract void onClick(); //Defines behaviour when square is clicked

    
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
    * Getter for isFlagged
    */
    public boolean getIsFlagged(){
      return isFlagged;
    }
    
    /*
    * Setter for isMine
    */
    public void setIsFlagged(boolean flag){
      isFlagged = flag;
    }
    
    /*
    * Getter for isMine
    */
    public boolean getIsMine(){
      return isMine;
    }
    
    /*
    * Setter for isMine
    */
    public void setIsMine(boolean mine){
      isMine = mine;
    }
    
    /**
     *This function allows the status of the square to be retrieved
     **/     
    public void SquareMineStatus(){
        System.out.println("status of isMine = " + isMine);
        System.out.println("status of isFlagged = " + isFlagged);
        System.out.println("status of isClicked = " + isClicked);
    }  
    
}
