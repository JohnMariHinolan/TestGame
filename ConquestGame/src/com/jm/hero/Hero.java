package com.jm.hero;

import java.util.List;

import com.jm.card.obj.unit.Unit;
import com.jm.config.HeroEnum;
import com.jm.obj.ability.Ability;
import com.jm.victoryco.VictoryCondition;

public class Hero {

	private int heroHp;

	private List<Unit> availableUnit ;
	
	private List<VictoryCondition> victoryConditionList;
	
	private List<Ability> heroAbilityList;
	
	//private List<>
	
	//public abstract void build();

	public int getHeroHp() {
		return heroHp;
	}

	public void setHeroHp(int heroHp) {
		this.heroHp = heroHp;
	}

	public List<Unit> getAvailableUnit() {
		return availableUnit;
	}

	public void setAvailableUnit(List<Unit> availableUnit) {
		this.availableUnit = availableUnit;
	}

	public List<VictoryCondition> getVictoryConditionList() {
		return victoryConditionList;
	}

	public void setVictoryConditionList(List<VictoryCondition> victoryConditionList) {
		this.victoryConditionList = victoryConditionList;
	}

	public List<Ability> getHeroAbilityList() {
		return heroAbilityList;
	}

	public void setHeroAbilityList(List<Ability> heroAbilityList) {
		this.heroAbilityList = heroAbilityList;
	}
	
	
	
}
