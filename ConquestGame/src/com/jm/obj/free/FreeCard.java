package com.jm.obj.free;

import com.jm.card.Card;
import com.jm.config.FreeCardType;

public class FreeCard extends Card {

	FreeCardType freeCardType;
	
	// low level card cant be draw on the first turn
	private int cardLvl;
	
	public int getCardLvl() {
		return cardLvl;
	}

	public void setCardLvl(int cardLvl) {
		this.cardLvl = cardLvl;
	}

	public void use() {}
	
	
}
