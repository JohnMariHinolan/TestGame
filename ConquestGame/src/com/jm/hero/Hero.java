package com.jm.hero;

import java.util.List;

import com.jm.obj.ability.Ability;
import com.jm.obj.unit.Unit;
import com.jm.victoryco.VictoryCondition;

public abstract class Hero {

	
	private List<Unit> availableUnit;
	
	private List<VictoryCondition> victoryConditionList;
	
	private List<Ability> heroAbilityList;
	
	
	public abstract void build();
	
	
	
}
