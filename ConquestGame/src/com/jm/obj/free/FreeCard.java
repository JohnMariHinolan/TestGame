package com.jm.obj.free;

import com.jm.card.Card;
import com.jm.config.FreeCardType;

public class FreeCard extends Card {

	FreeCardType freeCardType;
	
	// low level card cant be draw on the first turn
	private int cardLvl;
	
	public void use() {}
	
	
}
