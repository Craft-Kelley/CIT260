/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minesweeper;

/**
 *
 * @author Jacky Northgrave
 */
public class HelpMenuControl {
    
    public void displayInstructions(){
        System.out.println(
            "\tThe game is Minesweeper. It is a one player game. Mines are hidden on a grid of tiles. Tiles will either be blank, numbered or filled with a mine. If you click on a tile with a mine it will end the game. If you click on a tile with a number it will reveal how many mines are touching the tile. "
        );
    }
}
