package com.jm.obj.ability;

import com.jm.config.AbilityType;

public abstract class Ability {
	private String abilityName;
	private AbilityType abilityType;
	
	public abstract void activate();

	
	
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
	
	
	
}
