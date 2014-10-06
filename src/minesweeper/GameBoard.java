/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minesweeperkc;

/**
 *
 * @author Casey
 */

import java.util.Random;

public class GameBoard {
    
    public static void main(String[] args) {
        int numRows=0;// initialized to 0 since it's not putting any parameters from above
	int numCols=0;
	int numMarked = 0;
	int numUnknown = numRows * numCols;
	int[] boardArray;
        boolean[][] mines;
        int[][] board;
	boardArray = new int[numUnknown];

	
	//storage
	mines = new boolean[numRows][numCols];
	board = new int[numRows][numCols];
	
	//new board
	for (int i=0; i<numUnknown; i++){
		boardArray[i]=i;
		}
	
	//random mine allocation
	int cells = numRows * numCols;
	int temp = 0;
        int numMines=0; 
	Random rand = new Random();
	
	while (temp < numMines) {
		int cell = rand.nextInt();
		cell = (cell < 0 ? -cell : cell)%cells;
		if (!mines[cell%numRows][cell/numRows]) {
			mines[cell%numRows][cell/numRows] = true;
			temp++;
		}
	}
    }
    
}