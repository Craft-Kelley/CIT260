/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minesweeper;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *This class is responsible for tracking high score data.
 * @author Summer
 * @author Jacky Northgrave
 */
public class HighScore implements Serializable{
  
private ArrayList <String> names = new ArrayList();
private ArrayList <Integer> scores = new ArrayList();
  
  /*
  *
  */

  @Override
  public String toString(){
    String theString = "duh";
    
    return theString;
  } 
  
  public void displayHighScores(){
    System.out.println("High Scores");
    System.out.println("Name\tScore");

    
    sortScores();
    
    for (int i = 0; i < scores.size(); i++){
      System.out.println(names.get(i) + "\t" + scores.get(i));
    }

  }
  
  /*
  * Sorts names in alphabetical order
  */
  private void sortNames(){
    int j;
    int i;
    int scoreKey;
    String nameKey;
    
        for( i = 0; i < names.size() - 1; i++){
            nameKey = names.get(i);
            scoreKey = scores.get(i);
        for(j = i +1; j < names.size();j++){ 
            //ascending sort
            if(names.get(i).compareToIgnoreCase(names.get(j)) > 0){
            names.set(i + 1, names.get(i));
            scores.set(i + 1, scores.get(i));
            }
            //swapping
            names.set(i+1, nameKey);
            scores.set(i+1, scoreKey); 
        }
     } 
  }
  
  /*
  * Sorts the scores from high to low
  */
  private void sortScores(){
    int j;
    int scoreKey;
    String nameKey;
    int i;
    
    for (j = 1; j < scores.size(); j++){
      scoreKey = scores.get(j);
      nameKey = names.get(j);
      
      for (i = j - 1; (i >= 0) && (scores.get(i) < scoreKey); i--){
        scores.set(i + 1, scores.get(i));
        names.set(i + 1, names.get(i));
      }
      scores.set(i+1, scoreKey);
      names.set(i+1, nameKey);
    }
  }
  
  /*
  * This happens when the game is started
  */
  public void readFile(){
    names.add("Susan");
    scores.add(350);    
    names.add("Jeremy");
    scores.add(300);
    names.add("Kaitlyn");
    scores.add(200);
    names.add("Tyler");
    scores.add(500);
    
  }
  
  /*
  * This happens when the game quits
  */
  private void writeFile(){
    
  }
  
}
