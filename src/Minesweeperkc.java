/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package minesweeperkc;

/**
 * Project: Minesweep
 * Authors:
 * Kelley Craft
 * Jacky Northgrave
 * Summer Smith
 * Jonathan Crawford
 * Casey Ames
 */
public class Minesweeperkc {

    // Instance Variables
    String name;
    String instructions = "Welcome to the game of Minesweeper. \n"
            + "You will be playing individually. The objective of the game \n "
            + "is to find the empty squares while avoiding the mines.\n "
            + "Good Luck!";
    public Minesweeperkc(){
    }
    public static void main(String[] args) {
       //calls the getName() and displayHelp()
       Minesweeperkc minesweeper = new Minesweeperkc();
       minesweeper.getName();
       minesweeper.displayHelp();
        
      // calls the Square class and displays the values held in variable of the Square class  
       Square square = new Square();
       square.SquareMineStatus();
       
       // calls the Mine class and displays the output
       Mine mine = new Mine();
       mine.clickedMine();
       
       //Summer's class
       PlayGame newGame = new PlayGame(32.0, 25.0);
       newGame.playGame();
       
       // Jacky's class - calls the menu class
       Menu menu = new Menu();
       menu.displayGreeting(args);
       
       //Jacky's class - calls the player class
       Player player = new Player();
       player.getName();
       
       Minesweeperkc newObject = new Minesweeperkc();
       display();
       Stats();
       
       Player playerSatistics = new Player();
       System.out.println(player.getPlayerStastics());
       System.out.println(player.getWinPercentage());
    }
   public void getName(){
   System.out.println(name);
   }
   
   public void displayHelp(){
   System.out.println(instructions);
   }
    
    public static void display(){
        
        System.out.println("output1");
    }
    
    public static void Stats() {
        
        System.out.println("stats data") ;
    }
    
}
