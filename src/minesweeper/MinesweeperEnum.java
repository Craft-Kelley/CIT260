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
public enum MinesweeperEnum {
    PLAYER_ONE ("Player"),
    gameOver ("Game Over");

String message;

private MinesweeperEnum(String message) {
    this.message = message;
}

public String getMessage(){
    return message;
}

public void display() {
    System.out.println(this.message);
}

}

