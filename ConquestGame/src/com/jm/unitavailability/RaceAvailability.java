package com.jm.unitavailability;

import java.util.ArrayList;
import java.util.List;

import com.jm.card.obj.bldg.Building;
import com.jm.card.obj.unit.Unit;
import com.jm.obj.ability.Ability;
import com.jm.obj.ability.AbilityTree;
import com.jm.victoryco.VictoryCondition;

public abstract class RaceAvailability {

	
	private List<Unit> availableUnits = new ArrayList<>();
	private List<Building> availableBuildings = new ArrayList<>();
	private List<Ability> raceAbility = new ArrayList<>();
	private List<VictoryCondition> raceVC = new ArrayList<>();
	private AbilityTree abilityTree;
	
	public  void addAll() {};
	
	public void addRaceAbilitys(Ability ability) {
		raceAbility.add(ability);
	}

	public void addAvailableBuildings(Building building) {
		availableBuildings.add(building);
	}
	
	public void addAvailableUnits(VictoryCondition vc) {
		raceVC.add(vc);
	}
	
	public void addAvailableUnits(Unit unit) {
		 availableUnits.add(unit);
	}

	public List<Unit> getAvailableUnits() {
		return availableUnits;
	}


	
	
	
}
