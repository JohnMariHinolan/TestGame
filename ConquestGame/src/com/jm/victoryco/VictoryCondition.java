package com.jm.victoryco;

import com.jm.config.VictoryConTrigEnum;
import com.jm.obj.board.Board;

public abstract class VictoryCondition {
    // trigger when
	VictoryConTrigEnum victoryConTrigEnum;
	
	public boolean isWin(Board board){return false;}
	public boolean isLoose(Board board) {return false;}
	
}
