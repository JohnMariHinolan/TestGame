package com.jm.obj.ability;

import com.jm.card.Card;
import com.jm.obj.board.Player;

public interface AbilityActivation {

	// could be none
	public void activate(Player player, CardPicker targetCard);
	
}
