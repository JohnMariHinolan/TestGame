package com.jm.obj.ability;

import com.jm.config.AbilityType;
import com.jm.obj.board.Player;

public class Ability {
	private String abilityName;
	private AbilityType abilityType;
	private AbilityActivation abilityActivation;
	
	
	// should be a list of card 
	public void activate(Player player,CardPicker card) {
		
		abilityActivation.activate(player,card);
	};
	

	
	public String getAbilityName() {
		return abilityName;
	}

	public void setAbilityName(String abilityName) {
		this.abilityName = abilityName;
	}

	public AbilityType getAbilityType() {
		return abilityType;
	}

	public void setAbilityType(AbilityType abilityType) {
		this.abilityType = abilityType;
	}

	public AbilityActivation getAbilityActivation() {
		return abilityActivation;
	}

	public void setAbilityActivation(AbilityActivation abilityActivation) {
		this.abilityActivation = abilityActivation;
	}
	
	
	
	
}
