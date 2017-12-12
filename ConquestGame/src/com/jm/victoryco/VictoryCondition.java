package com.jm.victoryco;

import com.jm.config.VictoryConTrigEnum;
import com.jm.obj.board.Game;

public abstract class VictoryCondition {
    // trigger when
	
	VictoryConTrigEnum victoryConTrigEnum;
	
	public boolean isWin(Game board){return false;}
	public boolean isLoose(Game board) {return false;}
	
}
