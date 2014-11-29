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
/*I was supposed to take something from here and put it in the other 
classes somehow and get the program to run with the enum. It runs but 
I do not know what nor how to put the connection into the other classes. - Jonathan*/
}

/* Casey's attempt at an individual project:

public MinesweeperEnum enterName () {
String strName = null;
Scanner inFile = Minesweeper.getInputFile();

System.out.println("\tPlease enter the name of the player");
do {
strName = inFile.nextLine();
strName = strName.trim().toUpperCase();
if (strName.length() < 1);
System.out.println("\n\tError: You must enter a name or enter a letter");
return MinesweeperEnum.ERROR;
}
strName = strName.trim;
} while (strName == null;
this.setName(strName);
return MinesweeperEnum.PLAYING;
}

*/