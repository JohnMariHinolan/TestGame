package com.jm.config;

public enum UnitNameEnum {

	HUMAN_LV1_WARRIOR("Warrior"),
	
	HUMAN_LV2_KNIGHT("Knight"),
	HUMAN_LV3_SOLDIER("Soldier");
	
	private String var;
	
	UnitNameEnum(String var) {
		this.var = var;
	}
	
	public String getName() {
		return this.var;
	}
	
}
