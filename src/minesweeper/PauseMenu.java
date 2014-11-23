/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minesweeper;

/**
 *
 * @author Casey
 */
public class PauseMenu extends Menu {
private static final String menuItems[] = {""};// allows Menu superclass
 private static final String menuName = "Game Paused";//for Menu superclass
 /*
 *Constructor
 */
 public PauseMenu(){
     super(PauseMenu.menuItems,PauseMenu.menuName);//Constructing Menu 
     getInput();
 } 
 
 /*
 * Gets input from the user
 */

 //There is supposed to be an @Override in here. Just Have not figured out 
 /*what I need to change for it.
 
 boolean paused;
      
   // if(PauseMenu(VK_SPACE) {
    /*if(paused == true) {
        paused = false;
        }
    else if(!paused){
        paused = true;
    }
*/
  }

